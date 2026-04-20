package com.alipay.mcp.protocol;

/**
 * JSON Schema 属性定义
 *
 * @author alipay
 */
public class JsonSchemaProperty {

    /** 类型 */
    private String type;

    /** 描述 */
    private String description;

    /** 枚举值 */
    private Object[] enumValues;

    // getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object[] getEnumValues() {
        return enumValues;
    }

    public void setEnumValues(Object[] enumValues) {
        this.enumValues = enumValues;
    }
}