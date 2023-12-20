package com.alipay.v3.util.schema.api;

import com.alipay.v3.util.schema.model.attribute.Attribute;
import com.alipay.v3.util.schema.model.enums.AttrRuleTypeEnum;
import com.alipay.v3.util.schema.model.enums.AttrTypeEnum;
import com.alipay.v3.util.schema.model.rule.AttributeRule;

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
