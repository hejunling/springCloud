package com.tuodao.bp.sms.service;

import com.tuodao.bp.sms.db.mapper.SmsLogMapper;
import com.tuodao.bp.sms.db.model.SmsLog;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @description:
 * @author: mif
 * @date: 2017/8/22
 * @time: 11:43
 * @copyright: 拓道金服 Copyright (c) 2017
 */
@Component
class SmsLogService {

    @Resource
    private SmsLogMapper smsLogMapper;

    @Async
    void insertSmsLog(SmsLog smsLog) {
        smsLogMapper.insert(smsLog);
    }
}
