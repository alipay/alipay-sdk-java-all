/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.service.schema.model.attribute;

import java.util.ArrayList;
import java.util.List;

import com.alipay.service.schema.model.rule.AttributeRule;
import org.dom4j.Element;

import com.alipay.service.schema.exception.ServiceSchemaException;
import com.alipay.service.schema.model.enums.AttrTypeEnum;
import com.alipay.service.schema.model.enums.AttrValueTypeEnum;
import com.alipay.service.schema.model.enums.SchemaErrorEnum;
import com.alipay.service.schema.model.option.Option;
import com.alipay.service.schema.util.StringUtil;
import com.alipay.service.schema.util.XmlUtils;

/**
 * @author junying
 * @version : Attribute.java, v 0.1 2021年03月17日 9:56 下午 junying Exp $
 */
public abstract class Attribute {

    private String id;
    private String name;
    private AttrTypeEnum type;
    private AttrValueTypeEnum valueType;
    private List<AttributeRule> rules = new ArrayList<AttributeRule>();
    private List<Option> options = new ArrayList<Option>();

    /**
     * 转换成document的元素
     *
     * @return
     * @throws ServiceSchemaException
     */
    public abstract Element toElement() throws ServiceSchemaException;

    public void addRule(AttributeRule rule) {
        this.rules.add(rule);
    }

    public void addOption(Option option) {
        this.options.add(option);
    }

    protected void appendRulesElement(Element parent, List<AttributeRule> rules,
                                      String attributeId) throws ServiceSchemaException {
        if (rules == null || rules.size() <= 0) {
            return;
        }
        Element rulesElm = XmlUtils.appendElement(parent, "rules");
        for (AttributeRule rule : rules) {
            Element element = rule.toElement(attributeId);
            rulesElm.add(element);
        }
    }

    protected void appendOptionsElement(Element parent, List<Option> options,
                                        String attributeId) throws ServiceSchemaException {
        if (options == null || options.size() <= 0) {
            return;
        }
        Element optionsElm = XmlUtils.appendElement(parent, "options");
        for (Option option : options) {
            Element optionElm = option.toElement(attributeId);
            optionsElm.add(optionElm);
        }

    }

    protected void appendAttributeValues(Attribute attribute,
                                         Element parent) throws ServiceSchemaException {
        if (attribute.getType() == AttrTypeEnum.SINGLE) {
            appendSingleAttributValue(parent, attribute);
        } else if (attribute.getType() == AttrTypeEnum.MULTI) {
            appendMultiAttributValue(parent, attribute);
        } else {
            throw new ServiceSchemaException(SchemaErrorEnum.ATTR_TYPE_ERROR, attribute.getId());
        }
    }

    protected void appendSingleAttributValue(Element parent, Attribute attribute) {
        Element valueElm = XmlUtils.appendElement(parent, "value");
        SingleAttribute singleAttribute = (SingleAttribute) attribute;
        if (!StringUtil.isEmpty(singleAttribute.getValue())) {
            valueElm.setText(singleAttribute.getValue());
        }
    }

    protected void appendMultiAttributValue(Element parent, Attribute attribute) {
        Element valuesElm = XmlUtils.appendElement(parent, "values");
        MultiAttribute multiAttribute = (MultiAttribute) attribute;
        for (String value : multiAttribute.getValues()) {
            Element valueElm = XmlUtils.appendElement(valuesElm, "value");
            if (!StringUtil.isEmpty(value)) {
                valueElm.setText(value);
            }
        }
    }

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id value to be assigned to property id
     */
    public void setId(String id) {
        this.id = id;
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
    public AttrTypeEnum getType() {
        return type;
    }

    /**
     * Setter method for property <tt>type</tt>.
     *
     * @param type value to be assigned to property type
     */
    public void setType(AttrTypeEnum type) {
        this.type = type;
    }

    /**
     * Getter method for property <tt>valueType</tt>.
     *
     * @return property value of valueType
     */
    public AttrValueTypeEnum getValueType() {
        return valueType;
    }

    /**
     * Setter method for property <tt>valueType</tt>.
     *
     * @param valueType value to be assigned to property valueType
     */
    public void setValueType(AttrValueTypeEnum valueType) {
        this.valueType = valueType;
    }

    /**
     * Getter method for property <tt>rules</tt>.
     *
     * @return property value of rules
     */
    public List<AttributeRule> getRules() {
        return rules;
    }

    /**
     * Setter method for property <tt>rules</tt>.
     *
     * @param rules value to be assigned to property rules
     */
    public void setRules(List<AttributeRule> rules) {
        this.rules = rules;
    }

    /**
     * Getter method for property <tt>options</tt>.
     *
     * @return property value of options
     */
    public List<Option> getOptions() {
        return options;
    }

    /**
     * Setter method for property <tt>options</tt>.
     *
     * @param options value to be assigned to property options
     */
    public void setOptions(List<Option> options) {
        this.options = options;
    }
}