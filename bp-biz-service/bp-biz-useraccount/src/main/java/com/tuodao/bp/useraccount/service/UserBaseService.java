package com.tuodao.bp.useraccount.service;

import com.tuodao.bp.useraccount.db.mapper.basic.UserInfoMapper;
import com.tuodao.bp.useraccount.db.model.basic.UserInfo;
import com.tuodao.bp.useraccount.db.model.basic.UserInfoExample;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

import static com.tuodao.bp.useraccount.constants.UserContstants.DEL_YES;
import static com.tuodao.bp.useraccount.constants.UserContstants.USER_STATUS_NOMAL;

/**
 * @description: 用户基础服务
 * @author: mif
 * @date: 2017/8/28
 * @time: 15:00
 * @copyright: 拓道金服 Copyright (c) 2017
 */
public class UserBaseService {

    @Resource
    protected UserInfoMapper userInfoMapper;

    /**
     * 根据用户编号查询用户信息
     *
     * @param userId 用户编号
     * @return 用户信息
     */
    public UserInfo selectUserByUserId(String userId) {
        return userInfoMapper.selectByPrimaryKey(userId);
    }

    /**
     * 根据手机号码查询用户信息
     *
     * @param mobile
     * @return
     */
    public UserInfo selectUserByMobile(String mobile) {
        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andMobileEqualTo(mobile).andIsDelEqualTo(DEL_YES).andUserStatusEqualTo(USER_STATUS_NOMAL);

        List<UserInfo> list = userInfoMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(list)) {
            return null;
        } else {
            return list.get(0);
        }
    }
}
