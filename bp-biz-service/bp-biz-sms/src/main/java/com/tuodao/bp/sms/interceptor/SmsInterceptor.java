package com.tuodao.bp.sms.interceptor;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.tuodao.bp.result.exception.MicroServiceException;
import com.tuodao.bp.sms.Constants.SmsResponseConst;
import com.tuodao.bp.sms.cache.SmsCache;
import com.tuodao.bp.sms.config.SmsConfig;
import com.tuodao.bp.sms.db.model.biz.SmsDTO;

/**
 * @description: 短信拦截器
 * @author: mif
 * @date: 2017/8/23
 * @time: 14:39
 * @copyright: 拓道金服 Copyright (c) 2017
 */
@Aspect
//@Component
@Order(2)
public class SmsInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(SmsInterceptor.class);

    @Resource
    private SmsConfig smsConfig;

    @Resource
    private SmsCache smsCache;

    @Before("within(com.tuodao.bp.sms.controller.SmsController)")
    public void doBefore(JoinPoint joinPoint) throws Throwable {

        if (!smsConfig.getEnable()) {
            logger.info("发送短信失败：功能未启用");
            throw new MicroServiceException(SmsResponseConst.SMS_SEND_UNABLE);
        }
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
//        String ip = WebUtils.getClientIP(request);

        Object[] args = joinPoint.getArgs();
        SmsDTO smsDTO = (SmsDTO) args[1];
        String mobiles = smsDTO.getMobiles();
        String ip = smsDTO.getCustomerIp();

        logger.info("smsDTO={}", smsDTO);

        String cachePhone = smsCache.getMobiles(mobiles);
        logger.debug("phone1 ={} ", cachePhone);
        if (StringUtils.isEmpty(cachePhone)) {
            smsCache.putMobiles(mobiles);
        } else {
            logger.info("发短信太过频繁，每个手机60秒以内只能发一次...");
            throw new MicroServiceException(SmsResponseConst.SMS_SEND_TOO_FREQUENTLY);
        }

        Integer count = smsCache.getMobilesNumber(mobiles);
        logger.debug("count ={} ", count);
        if (count <= smsConfig.getTopNumberLimit()) {
            smsCache.putMobilesNumber(mobiles, count + 1);
        } else {
            logger.info("每天同一手机最多发短信次数:{}", smsConfig.getTopNumberLimit());
            throw new MicroServiceException(SmsResponseConst.MOBILE_COUNT_TOP_LIMIT);
        }


        count = smsCache.getIpCount(ip);
        logger.debug("ipCount ={} ", count);
        if (count < smsConfig.getTopIpLimit()) {
            smsCache.putIpCount(ip, count + 1);
        } else {
            logger.info("同一天，同一IP，最多发短信次数:{}", smsConfig.getTopIpLimit());
            throw new MicroServiceException(SmsResponseConst.IP_COUNT_TOP_LIMIT);
        }


        Set<String> ipSet = smsCache.getMobilesIpList(mobiles);
        if (null == ipSet) {
            ipSet = new HashSet<String>();
            ipSet.add(ip);
            smsCache.putMobilesIpList(mobiles, ipSet);
        } else {
            logger.debug("ipList.size ={},content{}", ipSet.size(), JSON.toJSONString(ipSet));
            if (ipSet.size() < smsConfig.getTopMobileIpLimit()) {
                ipSet.add(ip);
                smsCache.putMobilesIpList(mobiles, ipSet);
            } else {
                logger.info("单个手机号在1天内最多可绑定{}个IP获取注册短信验证码.", smsConfig.getTopMobileIpLimit());
                throw new MicroServiceException(SmsResponseConst.MOBILE_BAND_IP_COUNT_TOP_LIMIT);
            }
        }
    }
}
