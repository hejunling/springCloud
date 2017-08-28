package com.tuodao.bp.sms.Constants;

/**
 * @description: 短信服务异常代码常量
 * @author: mif
 * @date: 2017/8/23
 * @time: 14:45
 * @copyright: 拓道金服 Copyright (c) 2017
 */
public class SmsResponseConst {

    /** 成功 */
    public static final int SUCCESS = 100000;

    /** 发送短信失败：功能未启用 */
    public static final int SMS_SEND_UNABLE = 200002;
    /** 短信发送太频繁，请稍候*/
    public static final int SMS_SEND_TOO_FREQUENTLY = 200003;
    /** 本号码当天短信发送量达到上限 */
    public static final int MOBILE_COUNT_TOP_LIMIT = 200004;
    /** 本IP当天短信发送量达到上限 */
    public static final int IP_COUNT_TOP_LIMIT = 200005;
    /** 本号码1天内最多可绑定的IP发送短信达到上限*/
    public static final int MOBILE_BAND_IP_COUNT_TOP_LIMIT = 200006;
    /** 互亿短信未配置或已禁用 */
    public static final int HUYI_ACCOUT_UNCONFIG = 200007;
    /** 短信合作平台异常*/
    public static final int COOPERATION_PLATFORM_EXCEPTION = 200008;
    /**返回结果解析异常*/
    public static final int ANALYTIC_RESULT_EXCEPTION = 200009;
    /**电话号码不能为空*/
    public static final int MOBILE_CAN_NOT_BE_NULL = 200010;
    /**电话号码格式错误*/
    public static final int MOBILE_FORMAR_ERROR = 200011;
    /** 短信内容不能为空*/
    public static final int CONTENT_CAN_NOT_BE_NULL = 200012;
    /** 短信内容最大300字*/
    public static final int CONTENT_LENGTH_MAX_300 = 200013;
    /** 客户端IP不能为空*/
    public static final int CUSTOMER_IP_CAN_NOT_BE_NULL = 200014;
    /** 客户端IP格式错误*/
    public static final int CUSTOMER_IP_FORMAR_ERROR = 200015;
    /** 短息类型不能为空*/
    public static final int SMS_TYPE_CAN_NOT_BE_NULL = 200016;
    /** 短息类型只能为1(通知类)和2(营销类)*/
    public static final int SMS_TYPE_ONLY_1_AND_2 = 200017;
    /** 访问IP受限,请与管理员联系*/
    public static final int IP_DENIED = 200018;

}
