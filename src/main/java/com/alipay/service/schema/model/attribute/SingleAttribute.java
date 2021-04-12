/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.service.schema.model.attribute;

import org.dom4j.Element;

import com.alipay.service.schema.exception.ServiceSchemaException;
import com.alipay.service.schema.model.enums.AttrTypeEnum;
import com.alipay.service.schema.model.enums.SchemaErrorEnum;
import com.alipay.service.schema.util.StringUtil;
import com.alipay.service.schema.util.XmlUtils;

/**
 * @author junying
 * @version : SingleAttribute.java, v 0.1 2021年03月17日 10:07 下午 junying Exp $
 */
public class SingleAttribute extends Attribute {

    private String id;
    private String value;

    @Override
    public Element toElement() throws ServiceSchemaException {
        Element attributeNode = XmlUtils.createRootElement("attribute");
        if (StringUtil.isEmpty(this.id)) {
            throw new ServiceSchemaException(SchemaErrorEnum.ATTR_MISS_ID);
        }
        if (this.getType() == null || StringUtil.isEmpty(this.getType().getType())) {
            throw new ServiceSchemaException(SchemaErrorEnum.ATTR_MISS_TYPE, this.id);
        }
        AttrTypeEnum fieldEnum = AttrTypeEnum.getType(this.getType().getType());
        if (fieldEnum == null) {
            throw new ServiceSchemaException(SchemaErrorEnum.ATTR_TYPE_ERROR, this.id);
        }
        attributeNode.addAttribute("id", this.id);
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

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id value to be assigned to property id
     */
    @Override
    public void setId(String id) {
        this.id = id;
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