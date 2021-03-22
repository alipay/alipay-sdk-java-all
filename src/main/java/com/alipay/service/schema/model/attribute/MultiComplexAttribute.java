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
 * @version : MultiComplexAttribute.java, v 0.1 2021年03月17日 10:06 下午 junying Exp $
 */
public class MultiComplexAttribute extends Attribute {

    private List<ComplexAttribute> attributes = new ArrayList<ComplexAttribute>();

    public void addAttributes(ComplexAttribute complexAttribute) {
        this.attributes.add(complexAttribute);
    }

    @Override
    public Element toElement() throws ServiceSchemaException {
        Element attrNode = XmlUtils.createRootElement("attribute");
        if (StringUtil.isEmpty(this.getId())) {
            throw new ServiceSchemaException(SchemaErrorEnum.ATTR_MISS_ID);
        }
        if (this.getType() == null || StringUtil.isEmpty(this.getType().getType())) {
            throw new ServiceSchemaException(SchemaErrorEnum.ATTR_MISS_TYPE, this.getId());
        }
        if (this.getType() == null) {
            throw new ServiceSchemaException(SchemaErrorEnum.ATTR_TYPE_ERROR, this.getId());
        }
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
                    throw new ServiceSchemaException(SchemaErrorEnum.ATTR_MISS_TYPE, this.getId());
                }
                attributeElm.addAttribute("type", attribute.getType().getType());
                if (attribute.getValueType() == null) {
                    throw new ServiceSchemaException(SchemaErrorEnum.ATTR_VALUETYPE_ERROR,
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