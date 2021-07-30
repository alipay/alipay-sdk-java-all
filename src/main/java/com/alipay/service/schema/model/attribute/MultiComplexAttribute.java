/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.service.schema.model.attribute;

import com.alipay.service.schema.exception.SchemaException;
import com.alipay.service.schema.model.enums.AttrTypeEnum;
import com.alipay.service.schema.model.enums.SchemaErrorEnum;
import com.alipay.service.schema.util.XmlUtils;
import org.dom4j.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * 多组符合属性
 *
 * @author hongbi.wang
 * @version $Id: MultiComplexAttribute.java, v 0.1 2021年02月26日 5:48 PM hongbi.wang Exp $
 */
public class MultiComplexAttribute extends Attribute {

    private List<ComplexAttribute> attributes = new ArrayList<ComplexAttribute>();

    public void addAttributes(ComplexAttribute complexAttribute) {
        this.attributes.add(complexAttribute);
    }

    @Override
    public Element toElement() throws SchemaException {
        checkAttribute();

        Element attrNode = XmlUtils.createRootElement("attribute");
        attrNode.addAttribute("id", this.getId());
        attrNode.addAttribute("name", this.getName());
        attrNode.addAttribute("type", this.getType().getType());
        attrNode.addAttribute("valueType", "object");

        for (ComplexAttribute complexAttribute : attributes) {
            Element attributesNode = XmlUtils.appendElement(attrNode, "attributes");
            for (Attribute attribute : complexAttribute.getAttributes()) {
                Element attributeElm = XmlUtils.appendElement(attributesNode, "attribute");
                attributeElm.addAttribute("id", attribute.getId());
                attributeElm.addAttribute("name", attribute.getName());
                if (attribute.getType() == null) {
                    throw new SchemaException(SchemaErrorEnum.ATTR_MISS_TYPE, this.getId());
                }
                attributeElm.addAttribute("type", attribute.getType().getType());
                if (attribute.getValueType() == null) {
                    throw new SchemaException(SchemaErrorEnum.ATTR_VALUETYPE_ERROR,
                            this.getId());
                }
                attributeElm.addAttribute("valueType", attribute.getValueType().getCode());
                //rules
                appendRulesElement(attributeElm, attribute.getRules(), attribute.getId());
                //options
                appendOptionsElement(attributeElm, attribute.getOptions(), attribute.getId());
                //value
                appendAttributeValues(attribute, attributeElm);

            }

        }
        return attrNode;
    }

    @Override
    public Element toValueElement() throws SchemaException {
        checkAttribute();
        Element attrNode = XmlUtils.createRootElement("attribute");
        attrNode.addAttribute("id", this.getId());
        attrNode.addAttribute("name", this.getName());
        attrNode.addAttribute("type", this.getType().getType());
        attrNode.addAttribute("valueType", "object");

        for (ComplexAttribute complexAttribute : attributes) {
            Element attributesNode = XmlUtils.appendElement(attrNode, "attributes");
            for (Attribute attribute : complexAttribute.getAttributes()) {
                Element attributeElm = XmlUtils.appendElement(attributesNode, "attribute");
                attributeElm.addAttribute("id", attribute.getId());
                attributeElm.addAttribute("name", attribute.getName());
                if (attribute.getType() == null) {
                    throw new SchemaException(SchemaErrorEnum.ATTR_MISS_TYPE, this.getId());
                }
                attributeElm.addAttribute("type", attribute.getType().getType());
                if (attribute.getValueType() == null) {
                    throw new SchemaException(SchemaErrorEnum.ATTR_VALUETYPE_ERROR,
                            this.getId());
                }
                attributeElm.addAttribute("valueType", attribute.getValueType().getCode());
                //value
                appendAttributeValues(attribute, attributeElm);

            }

        }
        return attrNode;
    }

    public ComplexAttribute cloneAttribute() throws SchemaException {
        if (this.getAttributes() == null || this.getAttributes().size() <= 0) {
            throw new SchemaException(SchemaErrorEnum.SYSTEM_ERROR, this.getId());
        }
        ComplexAttribute complexAttribute = this.getAttributes().get(0);
        List<Attribute> newAttributes = new ArrayList<Attribute>();
        for (Attribute attribute : complexAttribute.getAttributes()) {
            Attribute newAttribute = AttrTypeEnum.createAttribute(attribute.getType());
            newAttribute.setId(attribute.getId());
            newAttribute.setName(attribute.getName());
            newAttribute.setValueType(attribute.getValueType());
            newAttribute.setOptions(attribute.getOptions());
            newAttribute.setRules(attribute.getRules());
            newAttributes.add(newAttribute);
        }
        ComplexAttribute newComplexAttribute = new ComplexAttribute();
        newComplexAttribute.setId(complexAttribute.getId());
        newComplexAttribute.setName(complexAttribute.getName());
        newComplexAttribute.setType(complexAttribute.getType());
        newComplexAttribute.setValueType(complexAttribute.getValueType());
        newComplexAttribute.setRules(complexAttribute.getRules());
        newComplexAttribute.setOptions(complexAttribute.getOptions());
        newComplexAttribute.setAttributes(newAttributes);
        return newComplexAttribute;
    }

    /**
     * Getter method for property <tt>attributes</tt>.
     *
     * @return property value of attributes
     */
    public List<ComplexAttribute> getAttributes() {
        return attributes;
    }

    /**
     * Setter method for property <tt>attributes</tt>.
     *
     * @param attributes value to be assigned to property attributes
     */
    public void setAttributes(List<ComplexAttribute> attributes) {
        this.attributes = attributes;
    }
}