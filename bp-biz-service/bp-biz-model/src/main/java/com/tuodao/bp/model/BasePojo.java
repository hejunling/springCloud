package com.tuodao.bp.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class BasePojo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * 权限ID
     */
    private String accessId;
    /**
     * 请求类型 (1:WEB)
     */
    private String requestType;

    /**
     * 用户编号
     */
//    @NotNull(message = ResponseConst.USER_ID_CAN_NOT_BE_NULL + "")
    private Long userId;

    private String ip; // 用户ip编号

    public String getAccessId() {
        return accessId;
    }

    public void setAccessId(String accessId) {
        this.accessId = accessId;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

	public Map<String, Object> toMap(){
    	Map<String, Object> map = new HashMap<String, Object>();
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields){
            try {
                field.setAccessible(true);
                String name = (String) field.getName();
                Object val = (Object) field.get(this);
                map.put(name,val);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return map;
    }
}
