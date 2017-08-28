package com.tuodao.bp.sms.db.mapper;

import com.tuodao.bp.sms.db.model.SmsLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SmsLogMapper {

    /**
     * 新增
     *
     * @param record
     * @return
     */
    @Insert({
            "insert into sms_log ( request_id, ",
            "request_time, sms_servicer, ",
            "mobile, content, ",
            "customs_ip, respose_time, ",
            "respose_content,respose_result)",
            "values (#{requestId,jdbcType=VARCHAR}, ",
            "#{requestTime,jdbcType=TIMESTAMP}, #{smsServicer,jdbcType=INTEGER}, ",
            "#{mobile,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR}, ",
            "#{customsIp,jdbcType=VARCHAR}, #{resposeTime,jdbcType=TIMESTAMP}, ",
            "#{resposeContent,jdbcType=VARCHAR},#{resposeResult,jdbcType=VARCHAR})"
    })
    int insert(SmsLog record);
}