package com.tuodao.bp.sms.cache;

import com.tuodao.bp.sms.Constants.SmsConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @description: 缓存信息
 * @author: mif
 * @date: 2017/8/23
 * @time: 14:42
 * @copyright: 拓道金服 Copyright (c) 2017
 */
@Service
public class SmsCache {
    private static final Logger logger = LoggerFactory.getLogger(SmsCache.class);

    /**
     * cache中获取mobiles
     *
     * @param mobiles
     * @return
     */
    @Cacheable(cacheNames = SmsConstants.MOBILE_CACHE, key = "T(com.tuodao.bp.msg.constants.SmsContants).MOBILE_CACHE + #p0", cacheManager = "secondsCacheManager")
    public String getMobiles(String mobiles) {
        return null;
    }

    /**
     * mobiles 存入cache
     *
     * @param mobiles
     * @return
     */
    @CachePut(cacheNames = SmsConstants.MOBILE_CACHE, key = "T(com.tuodao.bp.msg.constants.SmsContants).MOBILE_CACHE + #p0", cacheManager = "secondsCacheManager")
    public String putMobiles(String mobiles) {
        return mobiles;
    }


    @Cacheable(cacheNames = SmsConstants.PHONE_COUNT_CACHE, key = "T(com.tuodao.bp.msg.constants.SmsContants).PHONE_COUNT_CACHE + #p0", cacheManager = "daysCacheManager")
    public Integer getMobilesNumber(String mobiles) {
        return 0;
    }

    @CachePut(cacheNames = SmsConstants.PHONE_COUNT_CACHE, key = "T(com.tuodao.bp.msg.constants.SmsContants).PHONE_COUNT_CACHE + #p0", cacheManager = "daysCacheManager")
    public Integer putMobilesNumber(String mobiles, Integer count) {
        return count;
    }


    @Cacheable(cacheNames = SmsConstants.IP_NUMBER_CACHE, key = "T(com.tuodao.bp.msg.constants.SmsContants).IP_NUMBER_CACHE + #p0", cacheManager = "daysCacheManager")
    public Integer getIpCount(String ip) {
        return 0;
    }

    @CachePut(cacheNames = SmsConstants.IP_NUMBER_CACHE, key = "T(com.tuodao.bp.msg.constants.SmsContants).IP_NUMBER_CACHE + #p0", cacheManager = "daysCacheManager")
    public Integer putIpCount(String ip, Integer count) {
        return count;
    }


    @Cacheable(cacheNames = SmsConstants.PHONE_IP_NUMBER_CACHE, key = "T(com.tuodao.bp.msg.constants.SmsContants).PHONE_IP_NUMBER_CACHE + #p0", cacheManager = "daysCacheManager")
    public Set<String> getMobilesIpList(String mobiles) {
        return null;
    }

    @CachePut(cacheNames = SmsConstants.PHONE_IP_NUMBER_CACHE, key = "T(com.tuodao.bp.msg.constants.SmsContants).PHONE_IP_NUMBER_CACHE + #p0", cacheManager = "daysCacheManager")
    public Set<String> putMobilesIpList(String mobiles, Set<String> set) {
        return set;
    }
}
