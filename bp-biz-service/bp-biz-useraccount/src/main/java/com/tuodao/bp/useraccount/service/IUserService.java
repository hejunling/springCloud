package com.tuodao.bp.useraccount.service;

import com.tuodao.bp.model.user.input.RegistInput;

/**
 * @description: 用户相关service interface
 * @author: mif
 * @date: 2017/8/28
 * @time: 10:44
 * @copyright: 拓道金服 Copyright (c) 2017
 */
public interface IUserService {

    /**
     * 注册
     *
     * @param input
     */
    void regist(RegistInput input);

}
