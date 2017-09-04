package com.tuodao.bp.useraccount.constants;

/**
 * @description: 用户相关常量
 * @author: mif
 * @date: 2017/8/28
 * @time: 15:50
 * @copyright: 拓道金服 Copyright (c) 2017
 */
public class UserContstants {
    /**
     * 业务代码(1：互金平台)
     */
    public final static Integer BUSSINESS_CODE_FINANCE = 1;

    /**
     * 是否删除(0：已删除；1:正常)
     */
    public final static Integer DEL_YES = 0;
    public final static Integer DEL_NO = 1;

    /**
     * 二元选择项 （1：是；2：否）
     */
    public final static Integer IF_YES = 1;
    public final static Integer IF_NO = 0;

    /**
     * 用户状态（1：正常；2：冻结；3：注销）
     */
    public final static Integer USER_STATUS_NOMAL = 1;
    public final static Integer USER_STATUS_FREEZE = 2;
    public final static Integer USER_STATUS_CANCEL = 3;

    /**
     * 性别（1：男；2：女）
     */
    public final static Integer MAN = 1;
    public final static Integer WOMAN = 2;
}
