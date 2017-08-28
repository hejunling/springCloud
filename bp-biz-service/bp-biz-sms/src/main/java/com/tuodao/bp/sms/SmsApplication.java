package com.tuodao.bp.sms;

import com.tuodao.bp.sms.config.EnableSmgConfiguration;
import com.tuodao.bp.sms.config.SmsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @description: 短信服务启动类
 * @author: mif
 * @date: 2017/8/23
 * @time: 14:26
 * @copyright: 拓道金服 Copyright (c) 2017
 */
@SpringBootApplication
@EnableAsync
@Import(EnableSmgConfiguration.class)
@EnableConfigurationProperties(SmsConfig.class)
public class SmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmsApplication.class, args);
    }
}
