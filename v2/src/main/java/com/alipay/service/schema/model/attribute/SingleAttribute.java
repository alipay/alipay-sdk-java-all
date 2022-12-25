/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.service.schema.model.attribute;

import com.alipay.service.schema.exception.SchemaException;
import com.alipay.service.schema.util.StringUtil;
import com.alipay.service.schema.util.XmlUtils;
import org.dom4j.Element;

/**
 * 单值属性
 *
 * @author hongbi.wang
 * @version $Id: SingleAttribute.java, v 0.1 2021年02月26日 5:45 PM hongbi.wang Exp $
 */
public class SingleAttribute extends Attribute {

    private String value;

    @Override
    public Element toElement() throws SchemaException {
        checkAttribute();
        Element attributeNode = XmlUtils.createRootElement("attribute");
        attributeNode.addAttribute("id", this.getId());
        attributeNode.addAttribute("name", this.getName());
        attributeNode.addAttribute("type", this.getType().getType());
        attributeNode.addAttribute("valueType", this.getValueType().getCode());
        Element valueNode = XmlUtils.appendElement(attributeNode, "value");
        if (!StringUtil.isEmpty(this.value)) {
            valueNode.setText(value);
        }

        appendRulesElement(attributeNode, this.getRules(), this.getId());

        appendOptionsElement(attributeNode, this.getOptions(), this.getId());

        return attributeNode;
    }

    @Override
    public Element toValueElement() throws SchemaException {
        checkAttribute();
        Element attributeNode = XmlUtils.createRootElement("attribute");
        attributeNode.addAttribute("id", this.getId());
        attributeNode.addAttribute("name", this.getName());
        attributeNode.addAttribute("type", this.getType().getType());
        attributeNode.addAttribute("valueType", this.getValueType().getCode());
        Element valueNode = XmlUtils.appendElement(attributeNode, "value");
        if (!StringUtil.isEmpty(this.value)) {
            valueNode.setText(value);
        }

        return attributeNode;
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