package com.alipay.service.schema.api;

import com.alipay.service.schema.model.attribute.Attribute;
import com.alipay.service.schema.model.enums.AttrRuleTypeEnum;
import com.alipay.service.schema.model.enums.AttrTypeEnum;
import com.alipay.service.schema.model.rule.AttributeRule;

import java.util.ArrayList;
import java.util.List;

public class ServiceSchemaFactory {

    public static List<Attribute> createEmptyAttributeList() {
        return new ArrayList<Attribute>();
    }

    public static Attribute createAttribute(AttrTypeEnum attributeType) {
        return AttrTypeEnum.createAttribute(attributeType);
    }

    public static AttributeRule createRule(AttrRuleTypeEnum ruleType) {
        return AttrRuleTypeEnum.createRule(ruleType);
    }

}
