/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.service.schema.model.attribute;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Element;

import com.alipay.service.schema.exception.ServiceSchemaException;
import com.alipay.service.schema.model.enums.AttrTypeEnum;
import com.alipay.service.schema.model.enums.SchemaErrorEnum;
import com.alipay.service.schema.util.StringUtil;
import com.alipay.service.schema.util.XmlUtils;

/**
 * @author junying
 * @version : MultiAttribute.java, v 0.1 2021年03月17日 10:05 下午 junying Exp $
 */
public class MultiAttribute extends Attribute {

    private List<String> values = new ArrayList<String>();

    @Override
    public Element toElement() throws ServiceSchemaException {
        Element attributeNode = XmlUtils.createRootElement("attribute");
        if (StringUtil.isEmpty(this.getId())) {
            throw new ServiceSchemaException(SchemaErrorEnum.ATTR_MISS_ID);
        }
        if (this.getType() == null || StringUtil.isEmpty(this.getType().getType())) {
            throw new ServiceSchemaException(SchemaErrorEnum.ATTR_MISS_TYPE, this.getId());
        }
        AttrTypeEnum fieldEnum = AttrTypeEnum.getType(this.getType().getType());
        if (fieldEnum == null) {
            throw new ServiceSchemaException(SchemaErrorEnum.ATTR_TYPE_ERROR, this.getId());
        }
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