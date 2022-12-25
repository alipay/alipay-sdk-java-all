/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.service.schema.model.enums;

/**
 * schema错误枚举
 *
 * @author hongbi.wang
 * @version $Id: SchemaErrorEnum.java, v 0.1 2021年03月01日 10:51 AM hongbi.wang Exp $
 */
public enum SchemaErrorEnum {

    SYSTEM_ERROR("SYSTEM_ERROR", "系统错误"),
    XML_FORMAT_ERROR("XML_FORMAT_ERROR", "XML 格式错误,无法正常解析 !"),

    //attribute相关
    ATTR_MISS_ID("ATTR_MISS_ID", "Attribute属性缺少id!"),
    ATTR_MISS_TYPE("ATTR_MISS_TYPE", "Attribute属性缺少type！"),
    ATTR_TYPE_ERROR("ATTR_TYPE_ERROR", "Attribute属性字type类型不正确!"),
    ATTR_VALUE_ERROR("ATTR_VALUE_ERROR", "Attribute属性value不正确!"),
    ATTR_VALUETYPE_ERROR("ATTR_VALUETYPE_ERROR", "Attribute属性valueType不正确!"),

    //rule格式
    ATTR_RULE_NAME_ERROR("ATTR_RULE_NAME_ERROR", "AttrRule格式错误!AttrRule缺少name!"),
    ATTR_RULE_VALUE_ERROR("ATTR_RULE_VALUE_ERROR", "AttrRule格式错误!AttrRule缺少value!"),
    ATTR_RULE_TYPE_ERROR("ATTR_RULE_TYPE_ERROR", "AttrRule类型type不合法"),

    //option相关
    OPTION_NAME_ERROR("OPTION_NAME_ERROR", "Option格式错误!Option名称displayName不能为空!"),
    OPTION_VALUE_ERROR("OPTION_VALUE_ERROR", "Option格式错误!Option的值value不能为空!");

    private String errorCode;
    private String errorMessage;

    SchemaErrorEnum(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    /**
     * Getter method for property <tt>errorCode</tt>.
     *
     * @return property value of errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Setter method for property <tt>errorCode</tt>.
     *
     * @param errorCode value to be assigned to property errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter method for property <tt>errorMessage</tt>.
     *
     * @return property value of errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Setter method for property <tt>errorMessage</tt>.
     *
     * @param errorMessage value to be assigned to property errorMessage
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}