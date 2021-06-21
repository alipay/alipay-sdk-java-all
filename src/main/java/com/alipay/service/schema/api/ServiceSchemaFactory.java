/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.service.schema.api;

import java.util.ArrayList;
import java.util.List;

import com.alipay.service.schema.model.attribute.Attribute;
import com.alipay.service.schema.model.enums.AttrRuleTypeEnum;
import com.alipay.service.schema.model.enums.AttrTypeEnum;
import com.alipay.service.schema.model.rule.AttributeRule;

/**
 * @author junying
 * @version : ServiceSchemaFactory.java, v 0.1 2021年03月17日 8:57 下午 junying Exp $
 */
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
