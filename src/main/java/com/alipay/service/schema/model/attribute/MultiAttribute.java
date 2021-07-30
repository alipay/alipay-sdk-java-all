/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.service.schema.model.attribute;

import com.alipay.service.schema.exception.SchemaException;
import com.alipay.service.schema.util.XmlUtils;
import org.dom4j.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * 多值属性
 *
 * @author hongbi.wang
 * @version $Id: MultiAttribute.java, v 0.1 2021年02月26日 5:45 PM hongbi.wang Exp $
 */
public class MultiAttribute extends Attribute {

    private List<String> values = new ArrayList<String>();

    @Override
    public Element toElement() throws SchemaException {

        checkAttribute();
        Element attributeNode = XmlUtils.createRootElement("attribute");
        attributeNode.addAttribute("id", this.getId());
        attributeNode.addAttribute("name", this.getName());
        attributeNode.addAttribute("type", this.getType().getType());
        attributeNode.addAttribute("valueType", this.getValueType().getCode());
        Element valuesNode = XmlUtils.appendElement(attributeNode, "values");
        if (values != null && values.size() > 0) {
            for (String value : values) {
                Element valueNode = XmlUtils.appendElement(valuesNode, "value");
                valueNode.setText(value);
            }
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
        Element valuesNode = XmlUtils.appendElement(attributeNode, "values");
        if (values != null && values.size() > 0) {
            for (String value : values) {
                Element valueNode = XmlUtils.appendElement(valuesNode, "value");
                valueNode.setText(value);
            }
        }

        return attributeNode;
    }

    public void addValue(String value) {
        this.values.add(value);
    }

    /**
     * Getter method for property <tt>values</tt>.
     *
     * @return property value of values
     */
    public List<String> getValues() {
        return values;
    }

    /**
     * Setter method for property <tt>values</tt>.
     *
     * @param values value to be assigned to property values
     */
    public void setValues(List<String> values) {
        this.values = values;
    }
}