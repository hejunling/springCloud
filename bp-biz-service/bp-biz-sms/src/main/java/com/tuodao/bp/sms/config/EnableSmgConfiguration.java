package com.tuodao.bp.sms.config;

import com.google.common.cache.CacheBuilder;
import org.springframework.cache.CacheManager;
import org.springframework.cache.guava.GuavaCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;


/**
 * @description: 短信相关配置
 * @author: mif
 * @date: 2017/8/15
 * @time: 11:13
 * @copyright: 拓道金服 Copyright (c) 2017
 */
@Configuration
public class EnableSmgConfiguration {

    @Resource
    private SmsConfig smsConfig;

    /**
     * 秒数间隔；60秒内只能发送一次
     *
     * @return
     */
    @Bean(name = "secondsCacheManager")
    public CacheManager secondsCacheManager() {
        GuavaCacheManager cacheManager = new GuavaCacheManager();
        CacheBuilder<Object, Object> cacheBuilder = CacheBuilder.newBuilder()
                .maximumSize(100)
                .expireAfterWrite(smsConfig.getSecondsInterval(), TimeUnit.SECONDS);
        cacheManager.setCacheBuilder(cacheBuilder);
        return cacheManager;
    }

    /**
     * 保存一天的缓存
     *
     * @return
     */
    @Bean(name = "daysCacheManager")
    public CacheManager daysCacheManager() {
        GuavaCacheManager cacheManager = new GuavaCacheManager();
        CacheBuilder<Object, Object> cacheBuilder = CacheBuilder.newBuilder()
                .maximumSize(100)
                .expireAfterWrite(1, TimeUnit.DAYS);
        cacheManager.setCacheBuilder(cacheBuilder);
        return cacheManager;
    }


    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
