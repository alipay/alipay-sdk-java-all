package com.alipay.mcp.protocol;

import java.util.List;
import java.util.Map;

/**
 * JSON Schema
 *
 * @author alipay
 */
public class JsonSchema {

    /** 类型 (object, array, string, number, integer, boolean, null) */
    private String type;

    /** 属性定义 */
    private Map<String, JsonSchemaProperty> properties;

    /** 必填字段列表 */
    private List<String> required;

    /** 属性描述 */
    private String description;

    // getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, JsonSchemaProperty> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, JsonSchemaProperty> properties) {
        this.properties = properties;
    }

    public List<String> getRequired() {
        return required;
    }

    public void setRequired(List<String> required) {
        this.required = required;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}