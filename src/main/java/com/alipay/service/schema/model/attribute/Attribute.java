/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.service.schema.model.attribute;

import com.alipay.service.schema.exception.SchemaException;
import com.alipay.service.schema.model.enums.AttrTypeEnum;
import com.alipay.service.schema.model.enums.AttrValueTypeEnum;
import com.alipay.service.schema.model.enums.SchemaErrorEnum;
import com.alipay.service.schema.model.option.Option;
import com.alipay.service.schema.model.rule.AttributeRule;
import com.alipay.service.schema.util.StringUtil;
import com.alipay.service.schema.util.XmlUtils;
import org.dom4j.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * schema的属性
 *
 * @author hongbi.wang
 * @version $Id: Attribute.java, v 0.1 2021年02月26日 5:41 PM hongbi.wang Exp $
 */
public abstract class Attribute {

    private String              id;
    private String              name;
    private AttrTypeEnum        type;
    private AttrValueTypeEnum   valueType;
    private List<AttributeRule> rules   = new ArrayList<AttributeRule>();
    private List<Option>        options = new ArrayList<Option>();

    /**
     * 转换成document的元素
     *
     * @return
     * @throws SchemaException
     */
    public abstract Element toElement() throws SchemaException;

    /**
     * 转换成document的元素
     *
     * @return
     * @throws SchemaException
     */
    public abstract Element toValueElement() throws SchemaException;

    public void addRule(AttributeRule rule) {
        this.rules.add(rule);
    }

    public void addOption(Option option) {
        this.options.add(option);
    }

    protected void appendRulesElement(Element parent, List<AttributeRule> rules,
                                      String attributeId) throws SchemaException {
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
                                        String attributeId) throws SchemaException {
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
                                         Element parent) throws SchemaException {
        if (attribute.getType() == AttrTypeEnum.SINGLE) {
            appendSingleAttributValue(parent, attribute);
        } else if (attribute.getType() == AttrTypeEnum.MULTI) {
            appendMultiAttributValue(parent, attribute);
        } else {
            throw new SchemaException(SchemaErrorEnum.ATTR_TYPE_ERROR, attribute.getId());
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

    protected void checkAttribute() throws SchemaException {
        if (StringUtil.isEmpty(this.id)) {
            throw new SchemaException(SchemaErrorEnum.ATTR_MISS_ID);
        }
        if (this.getType() == null || StringUtil.isEmpty(this.getType().getType())) {
            throw new SchemaException(SchemaErrorEnum.ATTR_MISS_TYPE, this.id);
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