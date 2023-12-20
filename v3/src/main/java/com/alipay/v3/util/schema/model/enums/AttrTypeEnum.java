package com.alipay.v3.util.schema.model.enums;

import com.alipay.v3.util.schema.model.attribute.*;

public enum AttrTypeEnum {

    SINGLE("single"),
    MULTI("multi"),
    COMPLEX("complex"),
    MULTICOMPLEX("multiComplex");

    final private String type;

    AttrTypeEnum(final String type) {
        this.type = type;
    }

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
