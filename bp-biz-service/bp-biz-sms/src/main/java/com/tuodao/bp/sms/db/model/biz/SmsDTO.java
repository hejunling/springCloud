package com.tuodao.bp.sms.db.model.biz;

import com.tuodao.bp.sms.Constants.SmsConstants;
import com.tuodao.bp.sms.Constants.SmsResponseConst;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @description: 短信基础类
 * @author: mif
 * @date: 2017/5/9
 * @time: 15:58
 * @copyright: 拓道金服 Copyright (c) 2017
 */
public class SmsDTO implements Serializable {

    private static final long serialVersionUID = -4606783222108578254L;
    /**
     * 手机号码（多个已分号“；”分隔）
     */
    @NotBlank(message = SmsResponseConst.MOBILE_CAN_NOT_BE_NULL + "")
    private String mobiles;

    /**
     * 短信内容
     */
    @NotBlank(message = SmsResponseConst.CONTENT_CAN_NOT_BE_NULL + "")
    @Size(max = 300, message = SmsResponseConst.CONTENT_LENGTH_MAX_300 + "")
    private String content;

    /**
     * 客户端请求IP
     */
    @NotBlank(message = SmsResponseConst.CUSTOMER_IP_CAN_NOT_BE_NULL + "")
    @Pattern(regexp = SmsConstants.IP_REGEXP, message = SmsResponseConst.CUSTOMER_IP_FORMAR_ERROR + "")
    private String customerIp;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCustomerIp() {
        return customerIp;
    }

    public void setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
    }

    public String getMobiles() {
        return mobiles;
    }

    public void setMobiles(String mobiles) {
        this.mobiles = mobiles;
    }
}
