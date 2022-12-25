package com.alipay.service.schema.api;

import com.alipay.service.schema.exception.SchemaException;
import com.alipay.service.schema.model.attribute.Attribute;
import com.alipay.service.schema.model.attribute.ComplexAttribute;
import com.alipay.service.schema.model.attribute.MultiAttribute;
import com.alipay.service.schema.model.attribute.MultiComplexAttribute;
import com.alipay.service.schema.model.attribute.SingleAttribute;
import com.alipay.service.schema.model.enums.AttrRuleTypeEnum;
import com.alipay.service.schema.model.enums.AttrTypeEnum;
import com.alipay.service.schema.model.enums.AttrValueTypeEnum;
import com.alipay.service.schema.model.enums.SchemaErrorEnum;
import com.alipay.service.schema.model.option.Option;
import com.alipay.service.schema.model.rule.AttributeRule;
import com.alipay.service.schema.util.StringUtil;
import com.alipay.service.schema.util.XmlUtils;
import org.dom4j.Element;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceSchemaReader {

    public static Map<String, Attribute> readXmlForMap(File file) throws SchemaException {
        Element rootEle = XmlUtils.getRootElementFromFile(file);
        return readXmlForMap(rootEle);
    }

    public static Map<String, Attribute> readXmlForMap(String xmlStirng) throws SchemaException {
        Element rootEle = XmlUtils.getRootElementFromString(xmlStirng);
        return readXmlForMap(rootEle);
    }

    public static List<Attribute> readXmlForList(File file) throws SchemaException {
        Element rootEle = XmlUtils.getRootElementFromFile(file);
        return readXmlForList(rootEle);
    }

    public static List<Attribute> readXmlForList(String xmlStirng) throws SchemaException {
        Element rootEle = XmlUtils.getRootElementFromString(xmlStirng);
        return readXmlForList(rootEle);
    }

    public static List<Attribute> readXmlForList(Element rootEle) throws SchemaException {
        List<Attribute> attributeList = ServiceSchemaFactory.createEmptyAttributeList();
        List<Element> attributeElmList = XmlUtils.getChildElements(rootEle, "attribute");
        for (Element attrElm : attributeElmList) {
            Attribute attribute = elementToAttribute(attrElm);
            attributeList.add(attribute);
        }
        return attributeList;
    }

    public static Map<String, Attribute> readXmlForMap(Element rootEle) throws SchemaException {
        Map<String, Attribute> attributeMap = new HashMap<String, Attribute>();
        List<Element> attributeElmList = XmlUtils.getChildElements(rootEle, "attribute");
        for (Element attributeElm : attributeElmList) {
            Attribute attribute = elementToAttribute(attributeElm);
            attributeMap.put(attribute.getId(), attribute);
        }
        return attributeMap;
    }

    public static Attribute elementToAttribute(Element attributeElm) throws SchemaException {
        if (attributeElm == null) {
            return null;
        }
        String attributeId = XmlUtils.getAttributeValue(attributeElm, "id");
        if (StringUtil.isEmpty(attributeId)) {
            String msg = SchemaErrorEnum.ATTR_MISS_ID.getErrorMessage() + "相关xml片段 ["
                    + attributeElm.asXML() + "]";
            throw new SchemaException(SchemaErrorEnum.ATTR_MISS_ID.getErrorCode(), msg);
        }
        String attributeType = XmlUtils.getAttributeValue(attributeElm, "type");
        if (StringUtil.isEmpty(attributeType)) {
            String msg = SchemaErrorEnum.ATTR_MISS_TYPE.getErrorMessage() + "相关xml片段 ["
                    + attributeElm.asXML() + "].attributeId=" + attributeId;
            throw new SchemaException(SchemaErrorEnum.ATTR_MISS_TYPE.getErrorCode(), msg,
                    attributeId);
        }
        String attributeName = XmlUtils.getAttributeValue(attributeElm, "name");

        String valueType = XmlUtils.getAttributeValue(attributeElm, "valueType");
        AttrValueTypeEnum valueTypeEnum = AttrValueTypeEnum.getByCode(valueType);
        if (valueTypeEnum == null) {
            String msg = SchemaErrorEnum.ATTR_VALUETYPE_ERROR.getErrorMessage() + "相关xml片段 ["
                    + attributeElm.asXML() + "].attributeId=" + attributeId;
            throw new SchemaException(SchemaErrorEnum.ATTR_VALUETYPE_ERROR.getErrorCode(),
                    msg, attributeId);
        }

        AttrTypeEnum attributeTypeEnum = AttrTypeEnum.getType(attributeType);
        if (attributeTypeEnum == null) {
            String msg = SchemaErrorEnum.ATTR_TYPE_ERROR.getErrorMessage() + "相关xml片段["
                    + attributeElm.asXML() + "].attributeId=" + attributeId;
            throw new SchemaException(SchemaErrorEnum.ATTR_TYPE_ERROR.getErrorCode(), msg,
                    attributeId);
        }

        Attribute attribute_result = null;
        switch (attributeTypeEnum) {
            case SINGLE:
                attribute_result = elementToSingleAttribute(attributeElm, attributeId,
                        attributeName, valueTypeEnum);
                break;
            case MULTI:
                attribute_result = elementToMultiAttribute(attributeElm, attributeId, attributeName,
                        valueTypeEnum);
                break;
            case COMPLEX:
                attribute_result = elementToComplexAttribute(attributeElm, attributeId,
                        attributeName, valueTypeEnum);
                break;
            case MULTICOMPLEX:
                attribute_result = elementToMultiComplexAttribute(attributeElm, attributeId,
                        attributeName, valueTypeEnum);
                break;
        }
        return attribute_result;
    }

    private static AttributeRule elementToRule(Element ruleEle,
                                               String attributeId) throws SchemaException {
        if (ruleEle == null) {
            return null;
        }
        String ruleType = XmlUtils.getAttributeValue(ruleEle, "type");
        if (StringUtil.isEmpty(ruleType)) {
            throw new SchemaException(SchemaErrorEnum.ATTR_RULE_TYPE_ERROR, attributeId);
        }
        String ruleValue = XmlUtils.getAttributeValue(ruleEle, "value");
        if (StringUtil.isEmpty(ruleValue)) {
            throw new SchemaException(SchemaErrorEnum.ATTR_RULE_VALUE_ERROR, attributeId);
        }

        AttributeRule rule = null;
        AttrRuleTypeEnum ruleTypeEnum = AttrRuleTypeEnum.getType(ruleType);
        if (ruleTypeEnum == null) {
            throw new SchemaException(SchemaErrorEnum.ATTR_RULE_TYPE_ERROR, attributeId);
        }
        rule = ServiceSchemaFactory.createRule(ruleTypeEnum);
        rule.setType(ruleTypeEnum);
        rule.setName(XmlUtils.getAttributeValue(ruleEle, "name"));
        rule.setValue(ruleValue);

        return rule;
    }

    private static Option elementToOption(Element optionEle,
                                          String attributeId) throws SchemaException {
        Option opResult = new Option();
        String displayName = XmlUtils.getAttributeValue(optionEle, "displayName");
        if (StringUtil.isEmpty(displayName)) {
            throw new SchemaException(SchemaErrorEnum.OPTION_NAME_ERROR, attributeId);
        }
        String value = XmlUtils.getAttributeValue(optionEle, "value");
        if (StringUtil.isEmpty(value)) {
            throw new SchemaException(SchemaErrorEnum.OPTION_VALUE_ERROR, attributeId);
        }
        opResult.setDisplayName(displayName);
        opResult.setValue(value);

        return opResult;
    }

    private static SingleAttribute elementToSingleAttribute(Element attributeElm,
                                                            String attributeId,
                                                            String attributeName,
                                                            AttrValueTypeEnum valueType) throws SchemaException {
        if (attributeElm == null) {
            return null;
        }
        SingleAttribute singleAttribute = (SingleAttribute) ServiceSchemaFactory
                .createAttribute(AttrTypeEnum.SINGLE);
        singleAttribute.setId(attributeId);
        singleAttribute.setName(attributeName);
        singleAttribute.setValueType(valueType);
        //rules
        Element rulesEle = XmlUtils.getChildElement(attributeElm, "rules");
        if (rulesEle != null) {
            List<Element> ruleEleList = XmlUtils.getChildElements(rulesEle, "rule");
            for (Element ruleEle : ruleEleList) {
                AttributeRule rule = elementToRule(ruleEle, singleAttribute.getId());
                singleAttribute.addRule(rule);
            }
        }

        //option
        Element optionsEle = XmlUtils.getChildElement(attributeElm, "options");
        if (optionsEle != null) {
            List<Element> optionEleList = XmlUtils.getChildElements(optionsEle, "option");
            for (Element optionEleEle : optionEleList) {
                Option op = elementToOption(optionEleEle, singleAttribute.getId());
                singleAttribute.addOption(op);
            }
        }

        //value
        Element value = XmlUtils.getChildElement(attributeElm, "value");
        if (value != null) {
            singleAttribute.setValue(XmlUtils.getElementValue(value));
        }
        return singleAttribute;
    }

    private static MultiAttribute elementToMultiAttribute(Element attrElm, String attrId,
                                                          String attrName,
                                                          AttrValueTypeEnum valueType) throws SchemaException {
        if (attrElm == null) {
            return null;
        }
        MultiAttribute multiAttr = (MultiAttribute) ServiceSchemaFactory
                .createAttribute(AttrTypeEnum.MULTI);
        multiAttr.setId(attrId);
        multiAttr.setName(attrName);
        multiAttr.setValueType(valueType);
        //rules
        Element rulesEle = XmlUtils.getChildElement(attrElm, "rules");
        if (rulesEle != null) {
            List<Element> ruleEleList = XmlUtils.getChildElements(rulesEle, "rule");
            for (Element ruleEle : ruleEleList) {
                AttributeRule rule = elementToRule(ruleEle, multiAttr.getId());
                multiAttr.addRule(rule);
            }
        }

        //value
        Element valuesEle = XmlUtils.getChildElement(attrElm, "values");
        if (valuesEle != null) {
            List<Element> valueEleList = XmlUtils.getChildElements(valuesEle, "value");
            for (Element valueEle : valueEleList) {
                String value = XmlUtils.getElementValue(valueEle);
                multiAttr.addValue(value);
            }
        }

        //option
        Element optionsEle = XmlUtils.getChildElement(attrElm, "options");
        if (optionsEle != null) {
            List<Element> optionEleList = XmlUtils.getChildElements(optionsEle, "option");
            for (Element optionEleEle : optionEleList) {
                Option op = elementToOption(optionEleEle, multiAttr.getId());
                multiAttr.addOption(op);
            }
        }

        return multiAttr;
    }

    private static MultiComplexAttribute elementToMultiComplexAttribute(Element attributeElm,
                                                                        String attributeId,
                                                                        String attributeName,
                                                                        AttrValueTypeEnum valueType) throws SchemaException {
        if (attributeElm == null) {
            return null;
        }
        MultiComplexAttribute multiComplexAttribute = (MultiComplexAttribute) ServiceSchemaFactory
                .createAttribute(AttrTypeEnum.MULTICOMPLEX);
        multiComplexAttribute.setId(attributeId);
        multiComplexAttribute.setName(attributeName);
        multiComplexAttribute.setValueType(valueType);

        //attributes
        List<Element> attributesList = XmlUtils.getChildElements(attributeElm, "attributes");
        if (attributesList != null) {
            for (Element attributes : attributesList) {
                ComplexAttribute complexAttribute = new ComplexAttribute();
                List<Element> attributeEleList = XmlUtils.getChildElements(attributes, "attribute");
                for (Element subAttributeEle : attributeEleList) {
                    Attribute attrFromEle = elementToAttribute(subAttributeEle);
                    complexAttribute.addAttribute(attrFromEle);
                }
                multiComplexAttribute.addAttributes(complexAttribute);
            }
        }
        //rules
        Element rulesEle = XmlUtils.getChildElement(attributeElm, "rules");
        if (rulesEle != null) {
            List<Element> ruleEleList = XmlUtils.getChildElements(rulesEle, "rule");
            for (Element ruleEle : ruleEleList) {
                AttributeRule rule = elementToRule(ruleEle, multiComplexAttribute.getId());
                multiComplexAttribute.addRule(rule);
            }
        }
        return multiComplexAttribute;
    }

    private static ComplexAttribute elementToComplexAttribute(Element attrElm, String attrId,
                                                              String attrName,
                                                              AttrValueTypeEnum valueType) throws SchemaException {
        if (attrElm == null) {
            return null;
        }
        ComplexAttribute complexAttr = (ComplexAttribute) ServiceSchemaFactory
                .createAttribute(AttrTypeEnum.COMPLEX);
        complexAttr.setId(attrId);
        complexAttr.setName(attrName);
        complexAttr.setValueType(valueType);
        Element attributesEle = XmlUtils.getChildElement(attrElm, "attributes");
        if (attributesEle != null) {
            List<Element> attributeEleList = XmlUtils.getChildElements(attributesEle, "attribute");
            for (Element subAttributeEle : attributeEleList) {
                Attribute attributeFromEle = elementToAttribute(subAttributeEle);
                complexAttr.addAttribute(attributeFromEle);
            }
        }
        //rules
        Element rulesEle = XmlUtils.getChildElement(attrElm, "rules");
        if (rulesEle != null) {
            List<Element> ruleEleList = XmlUtils.getChildElements(rulesEle, "rule");
            for (Element ruleEle : ruleEleList) {
                AttributeRule rule = elementToRule(ruleEle, complexAttr.getId());
                complexAttr.addRule(rule);
            }
        }
        return complexAttr;
    }
}
