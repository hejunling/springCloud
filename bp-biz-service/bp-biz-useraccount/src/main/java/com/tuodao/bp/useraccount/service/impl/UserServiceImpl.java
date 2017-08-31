package com.tuodao.bp.useraccount.service.impl;

import com.tuodao.bp.model.user.input.RegisterInput;
import com.tuodao.bp.useraccount.db.model.basic.UserInfo;
import com.tuodao.bp.useraccount.service.IUserService;
import com.tuodao.bp.useraccount.service.UserBaseService;
import com.tuodao.bp.useraccount.service.async.AsyncUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @description: 用户相关service implement
 * @author: mif
 * @date: 2017/8/28
 * @time: 10:45
 * @copyright: 拓道金服 Copyright (c) 2017
 */
@Service
public class UserServiceImpl extends UserBaseService implements IUserService {

    private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private AsyncUserService asyncUserService;

    @Override
    public void register(RegisterInput input) {
        logger.info("user register ,input = {}", input);

        checkMobileExist(input.getMobile());

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("");//TODO generator
        //TODO copy
        if (!StringUtils.isEmpty(input.getInviterMobile())) {
            setInvitation(userInfo, input.getInviterMobile());// 设置邀请信息
        }

        userInfoMapper.insertSelective(userInfo);
        // 异步初始化相关数据
        asyncUserService.initRegist(userInfo);
    }

    /**
     * 检查用户是否存在
     *
     * @param mobile 手机号码
     */
    private void checkMobileExist(String mobile) {
        UserInfo userInfo = super.selectUserByMobile(mobile);
        if (null != userInfo) {
//            throw new Exception();// TODO
        }
    }

    /**
     * 设置邀请信息
     *
     * @param userInfo      用户信息
     * @param inviterMobile 邀请人号码
     */
    void setInvitation(UserInfo userInfo, String inviterMobile) {
        UserInfo directInviter = selectUserByMobile(inviterMobile);
        userInfo.setDirectInviterNo(directInviter.getUserId()); //直接邀请人编号
        userInfo.setIndirectInviterNo(directInviter.getDirectInviterNo()); // 间接邀请人编号

        //邀请人+1
        asyncUserService.inviterAdd(directInviter.getUserId(), directInviter.getDirectInviterNo());
    }
}
