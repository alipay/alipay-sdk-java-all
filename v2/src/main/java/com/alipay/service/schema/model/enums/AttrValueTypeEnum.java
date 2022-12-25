/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.service.schema.model.enums;

import com.alipay.service.schema.util.StringUtil;

/**
 * 服务属性值类型
 *
 * @author hongbi.wang
 * @version $Id: AttrValueTypeEnum.java, v 0.1 2021年03月01日 1:59 PM hongbi.wang Exp $
 */
public enum AttrValueTypeEnum {

    TEXT("text", "文本类型"),
    BOOLEAN("boolean", "boolean类型"),
    NUMERIC("numeric", "数据类型"),
    ENUM("enum", "枚举型"),
    OBJECT("object", "对象型");

    private String code;
    private String name;

    AttrValueTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static AttrValueTypeEnum getByCode(String code) {
        if (StringUtil.isEmpty(code)) {
            return null;
        }
        for (AttrValueTypeEnum typeEnum : values()) {
            if (typeEnum.getCode().equals(code)) {
                return typeEnum;
            }
        }
        return null;
    }

    /**
     * Getter method for property <tt>code</tt>.
     *
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     *
     * @param code value to be assigned to property code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }
}