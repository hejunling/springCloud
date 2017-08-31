package com.tuodao.bp.useraccount.controller;

import com.tuodao.bp.model.user.input.RegisterInput;
import com.tuodao.bp.useraccount.service.IUserService;
import com.tuodao.bp.useraccount.spring.UnableValidate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description: 用户相关操作
 * @author: mif
 * @date: 2017/8/28
 * @time: 10:29
 * @copyright: 拓道金服 Copyright (c) 2017
 */
@RestController
@RequestMapping(value = "user/user")
public class UserController {

    @Resource
    private IUserService userService;

    /**
     * 注册
     * @param registerInput
     */
    @RequestMapping(value = "register", method = RequestMethod.POST)
    @UnableValidate
    public void register(RegisterInput registerInput) {
        userService.register(registerInput);
    }
}
