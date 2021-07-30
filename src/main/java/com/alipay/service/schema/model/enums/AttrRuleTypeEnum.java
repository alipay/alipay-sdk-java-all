/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.service.schema.model.enums;

import com.alipay.service.schema.model.rule.AttributeRule;

/**
 * 属性规则类型枚举
 *
 * @author hongbi.wang
 * @version $Id: AttrRuleTypeEnum.java, v 0.1 2021年03月01日 11:33 AM hongbi.wang Exp $
 */
public enum AttrRuleTypeEnum {

    REQUIRED("required", "是否必填,true/false"),
    MAXLENGTH("maxLength", "字符串要求最大长度"),
    MINLENGTH("minLength", "字符串要求最小长度"),
    EXCLUSIVEMAXIMUM("exclusiveMaximum", "最大值,包含最大值,<="),
    EXCLUSIVEMINIMUM("exclusiveMinimum", "最小值,包含最小值,>="),
    MAXIMUM("maximum", "最大值,不包含最大值,<"),
    MINIMUM("minimum", "最小值,不包含最小值,>"),
    MAXSIZE("maxSize", "最大个数"),
    MINSIZE("minSize", "最大个数"),
    PRECISION("precision", "精度"),
    PATTERN("pattern", "正则表达式"),
    VALUETYPE("valueType", "值类型"),
    DEVTIP("devTip", "输入提示"),
    HEIGHT("height", "高度"),
    WIDTH("width", "长度"),
    URLSCHEMA("urlSchema", "url格式"),
    ;

    private String code;
    private String name;

    AttrRuleTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static AttrRuleTypeEnum getType(String code) {
        for (AttrRuleTypeEnum type : values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }
        return null;
    }

    public static AttributeRule createRule(AttrRuleTypeEnum ruleType) {
        AttributeRule rule = new AttributeRule();
        rule.setType(ruleType);
        return rule;
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