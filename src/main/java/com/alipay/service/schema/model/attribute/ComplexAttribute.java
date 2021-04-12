/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.service.schema.model.attribute;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Element;

import com.alipay.service.schema.exception.ServiceSchemaException;
import com.alipay.service.schema.model.enums.SchemaErrorEnum;
import com.alipay.service.schema.util.StringUtil;
import com.alipay.service.schema.util.XmlUtils;

/**
 * @author junying
 * @version : ComplexAttribute.java, v 0.1 2021年03月17日 9:57 下午 junying Exp $
 */
public class ComplexAttribute extends Attribute {

    private List<Attribute> attributes = new ArrayList();

    public void addAttribute(Attribute attribute) {
        this.attributes.add(attribute);
    }

    @Override
    public Element toElement() throws ServiceSchemaException {
        Element attributeNode = XmlUtils.createRootElement("attribute");
        if (StringUtil.isEmpty(this.getId())) {
            throw new ServiceSchemaException(SchemaErrorEnum.ATTR_MISS_ID);
        }
        if (this.getType() == null || StringUtil.isEmpty(this.getType().getType())) {
            throw new ServiceSchemaException(SchemaErrorEnum.ATTR_MISS_TYPE, this.getId());
        }
        if (this.getType() == null) {
            throw new ServiceSchemaException(SchemaErrorEnum.ATTR_TYPE_ERROR, this.getId());
        }
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