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
 * 复合属性
 *
 * @author hongbi.wang
 * @version $Id: ComplexAttribute.java, v 0.1 2021年02月26日 5:47 PM hongbi.wang Exp $
 */
public class ComplexAttribute extends Attribute {

    private List<Attribute> attributes = new ArrayList();

    public void addAttribute(Attribute attribute) {
        this.attributes.add(attribute);
    }

    @Override
    public Element toElement() throws SchemaException {

        checkAttribute();

        Element attributeNode = XmlUtils.createRootElement("attribute");
        attributeNode.addAttribute("id", this.getId());
        attributeNode.addAttribute("name", this.getName());
        attributeNode.addAttribute("type", this.getType().getType());
        attributeNode.addAttribute("valueType", this.getValueType().getCode());

        Element attributesElm = XmlUtils.appendElement(attributeNode, "attributes");
        for (Attribute attribute : attributes) {
            Element attributeElm = XmlUtils.appendElement(attributesElm, "attribute");
            attributeElm.addAttribute("id", attribute.getId());
            attributeElm.addAttribute("name", attribute.getName());
            attributeElm.addAttribute("type", attribute.getType().getType());
            attributeElm.addAttribute("valueType", attribute.getValueType().getCode());

            //rule
            appendRulesElement(attributeElm, attribute.getRules(), attribute.getId());
            //option
            appendOptionsElement(attributeElm, attribute.getOptions(), attribute.getId());
            //value
            appendAttributeValues(attribute, attributeElm);

        }
        appendRulesElement(attributeNode, this.getRules(), this.getId());

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

        Element attributesElm = XmlUtils.appendElement(attributeNode, "attributes");
        for (Attribute attribute : attributes) {
            Element attributeElm = XmlUtils.appendElement(attributesElm, "attribute");
            attributeElm.addAttribute("id", attribute.getId());
            attributeElm.addAttribute("name", attribute.getName());
            attributeElm.addAttribute("type", attribute.getType().getType());
            attributeElm.addAttribute("valueType", attribute.getValueType().getCode());

            //value
            appendAttributeValues(attribute, attributeElm);

        }

        return attributeNode;
    }

    /**
     * Getter method for property <tt>attributes</tt>.
     *
     * @return property value of attributes
     */
    public List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * Setter method for property <tt>attributes</tt>.
     *
     * @param attributes value to be assigned to property attributes
     */
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }
}
