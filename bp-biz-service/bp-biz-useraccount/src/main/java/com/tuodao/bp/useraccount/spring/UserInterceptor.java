package com.tuodao.bp.useraccount.spring;

import com.tuodao.bp.model.user.input.UserBaseInput;
import com.tuodao.bp.useraccount.db.mapper.basic.UserInfoMapper;
import com.tuodao.bp.useraccount.db.model.basic.UserInfo;
import com.tuodao.bp.useraccount.service.IUserService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @description: 判断用户是否存在
 * @author: mif
 * @date: 2017/8/28
 * @time: 16:04
 * @copyright: 拓道金服 Copyright (c) 2017
 */
@Aspect
@Order(-1)
@Component
public class UserInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(UserInterceptor.class);

    @Resource
    private UserInfoMapper userInfoMapper;

    @Pointcut("execution(public * com.tuodao.bp.useraccount.controller..*(..)) && !@annotation(com.tuodao.bp.useraccount.spring.UnableValidate)")
    public void exsitValidate() {
    }

    @Before("exsitValidate()")
    public void validateUser(JoinPoint point) {
        Object[] args = point.getArgs();
        Object obj = args[0];
        UserBaseInput input = (UserBaseInput) obj;
        if (null == input.getUserId()) {
//            throw new Mi (ResponseConst.USER_ID_CAN_NOT_BE_NULL);TODO
        }

        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(input.getUserId());
        if (null == userInfo) {
            logger.info("用户不存在，userid={}", input.getUserId());
//            throw new BizException(ResponseConst.USER_INEXISTENCE); TODO
        }
    }
}
