package com.tuodao.bp.useraccount.utils;

import java.util.Date;

/**
 * @description: 省份证工具类
 * @author: mif
 * @date: 2017/8/28
 * @time: 17:17
 * @copyright: 拓道金服 Copyright (c) 2017
 */
public class IdCardUtils {

    public static final String[] constellationArr = {"水瓶座", "双鱼座", "牡羊座", "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座",
            "天蝎座", "射手座", "魔羯座"};

    public static final int[] constellationEdgeDay = {20, 19, 21, 21, 21, 22, 23, 23, 23, 23, 22, 22};

    /**
     * 根据身份证号码获取生日
     *
     * @param idCard 身份证号码
     * @return 生日
     */
    public static Date getBirthday(String idCard) {
        String birthdayStr = idCard.substring(6, 14);
        return DateUtils.convertStringToDate("yyyyMMdd", birthdayStr);
    }

    /**
     * 根据身份证获取性别
     *
     * @param idCard 身份证号码
     * @return 性别（1:男；2:女）
     */
    public static Integer getSex(String idCard) {
        return (Integer.parseInt(idCard.substring(14, 15)) + 1) % 2;
    }

    /**
     * 根据身份证获取星座
     *
     * @param idCard 身份证号码
     * @return 星座
     */
    public static String getConstellation(String idCard) {
        int month = Integer.parseInt(idCard.substring(10, 12));
        int day = Integer.parseInt(idCard.substring(12, 14));

        if (day < constellationEdgeDay[month]) {
            month = month - 1;
        }

        if (month >= 0) {
            return constellationArr[month];
        }
        //default to return 魔羯
        return constellationArr[11];
    }

    public static void main(String[] args) {
        String idCard = "410822199001073530";
        System.out.println("性别 = " + getSex(idCard));
        System.out.println("生日 = " + getBirthday(idCard));
        System.out.println("星座 = " + getConstellation(idCard));
    }
}
