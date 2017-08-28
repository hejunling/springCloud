package com.tuodao.bp.sms.controller;

import com.tuodao.bp.api.core.response.RespResult;
import com.tuodao.bp.sms.db.model.biz.SmsDTO;
import com.tuodao.bp.sms.db.model.biz.SmsOut;
import com.tuodao.bp.sms.service.SmsService;
import com.tuodao.bp.api.core.utils.WebUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @description: 短信发送控制类
 * @author: mif
 * @date: 2017/8/23
 * @time: 14:37
 * @copyright: 拓道金服 Copyright (c) 2017
 */
@RestController
@RequestMapping(value = "sms")
public class SmsController {

    @Resource
    private SmsService smsService;

    @RequestMapping(value = "/sendSms", method = RequestMethod.POST)
    public RespResult<SmsOut> sendSms(HttpServletRequest request, SmsDTO smsDTO) throws Exception {
        SmsOut out = smsService.sendSms(smsDTO, WebUtils.getClientIP(request));
        return RespResult.<SmsOut>create().setContent(out);
    }
}
