/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.service.schema.model.enums;

import com.alipay.service.schema.model.attribute.Attribute;
import com.alipay.service.schema.model.attribute.ComplexAttribute;
import com.alipay.service.schema.model.attribute.MultiAttribute;
import com.alipay.service.schema.model.attribute.MultiComplexAttribute;
import com.alipay.service.schema.model.attribute.SingleAttribute;

/**
 * @author junying
 * @version : AttrTypeEnum.java, v 0.1 2021年03月17日 9:47 下午 junying Exp $
 */
public enum AttrTypeEnum {

    SINGLE("single"),

    MULTI("multi"),

    COMPLEX("complex"),

    MULTICOMPLEX("multiComplex");

    final private String type;

    public static Attribute createAttribute(AttrTypeEnum attributeType) {
        Attribute attribute = null;
        switch (attributeType) {
            case SINGLE:
                attribute = new SingleAttribute();
                break;
            case MULTI:
                attribute = new MultiAttribute();
                break;
            case COMPLEX:
                attribute = new ComplexAttribute();
                break;
            case MULTICOMPLEX:
                attribute = new MultiComplexAttribute();
                break;
        }
        attribute.setType(attributeType);
        return attribute;
    }

    private AttrTypeEnum(final String type) {
        this.type = type;
    }

    public static AttrTypeEnum getType(String type) {
        AttrTypeEnum[] values = AttrTypeEnum.values();
        for (AttrTypeEnum value : values) {
            if (value.getType().equals(type)) {
                return value;
            }
        }
        return null;
    }

    public String toString() {
        return type;
    }

    /**
     * Getter method for property <tt>type</tt>.
     *
     * @return property value of type
     */
    public String getType() {
        return type;
    }
}