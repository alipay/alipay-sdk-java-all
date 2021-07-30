/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.service.schema.model.rule;

import com.alipay.service.schema.exception.SchemaException;
import com.alipay.service.schema.model.enums.AttrRuleTypeEnum;
import com.alipay.service.schema.model.enums.SchemaErrorEnum;
import com.alipay.service.schema.util.StringUtil;
import com.alipay.service.schema.util.XmlUtils;
import org.dom4j.Element;

/**
 * @author hongbi.wang
 * @version $Id: AttributeRule.java, v 0.1 2021年03月01日 11:13 AM hongbi.wang Exp $
 */
public class AttributeRule {

    private String           name;
    private AttrRuleTypeEnum type;
    private String           value;

    public Element toElement(String attributeId) throws SchemaException {
        Element rule = XmlUtils.createRootElement("rule");
        if (type == null) {
            throw new SchemaException(SchemaErrorEnum.ATTR_RULE_TYPE_ERROR, attributeId);
        }
        if (StringUtil.isEmpty(this.name)) {
            throw new SchemaException(SchemaErrorEnum.ATTR_RULE_NAME_ERROR, attributeId);
        }
        if (StringUtil.isEmpty(this.value)) {
            throw new SchemaException(SchemaErrorEnum.ATTR_RULE_VALUE_ERROR, attributeId);
        }
        rule.addAttribute("type", this.getType().getCode());
        rule.addAttribute("name", this.name);
        rule.addAttribute("value", this.value);
        //for Special
        return rule;
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

    /**
     * Getter method for property <tt>type</tt>.
     *
     * @return property value of type
     */
    public AttrRuleTypeEnum getType() {
        return type;
    }

    /**
     * Setter method for property <tt>type</tt>.
     *
     * @param type value to be assigned to property type
     */
    public void setType(AttrRuleTypeEnum type) {
        this.type = type;
    }

    /**
     * Getter method for property <tt>value</tt>.
     *
     * @return property value of value
     */
    public String getValue() {
        return value;
    }

    /**
     * Setter method for property <tt>value</tt>.
     *
     * @param value value to be assigned to property value
     */
    public void setValue(String value) {
        this.value = value;
    }
}