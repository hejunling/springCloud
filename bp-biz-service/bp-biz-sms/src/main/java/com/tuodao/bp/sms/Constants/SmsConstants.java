package com.tuodao.bp.sms.Constants;

/**
 * @description: 短信配置常量
 * @author: mif
 * @date: 2017/8/23
 * @time: 14:36
 * @copyright: 拓道金服 Copyright (c) 2017
 */
public class SmsConstants {

    /**
     * 短信服务商（1：互亿;2:创蓝;3:梦网短信）
     */
    public static final int HUYI_SMS_SERVICER = 1;
    public static final int CHUANGLAN_SMS_SERVICE = 2;
    public static final int EMP_SMS_SERVICE = 3;

    /**
     * 基础数据类型：business：异常；iplimit：ip黑名单
     */
    public static final String BUSSINESS_MODULE = "business";
    public static final String IPLIMIT_MODULE = "iplimit";

    /**
     * 分隔符
     */
    public static final String SPLIT_CHAR = ";";

    /**
     * 缓存信息
     */
    public static final String MOBILE_CACHE = "MOBILE_CACHE_";
    public static final String PHONE_COUNT_CACHE = "PHONE_COUNT_CACHE_";
    public static final String IP_NUMBER_CACHE = "IP_NUMBER_CACHE_";
    public static final String PHONE_IP_NUMBER_CACHE = "PHONE_IP_NUMBER_CACHE_";
    public static final String BASIC_DATA_CACHE = "BASIC_DATA_CACHE_";

    /**
     * 返回结果
     */
    public static final String RESULT_SUCCESS = "success";
    public static final String RESULT_FAILED = "failed";

    /**
     * 格式校验正则
     */
    public static final String MOBILE_REGEXP = "^(((1([3,4,5,7,8][0-9]))\\d{8})|(0\\d{2}-?\\d{8})|(0\\d{3}-?\\d{7,8}))$";
    public static final String IP_REGEXP = "[0-9]+(?:\\.[0-9]+){0,3}";
}
