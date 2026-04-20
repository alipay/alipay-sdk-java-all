package com.alipay.mcp.protocol;

/**
 * MCP Tool 定义
 *
 * @author alipay
 */
public class Tool {

    /** 工具名称 */
    private String name;

    /** 工具描述 */
    private String description;

    /** 输入参数 JSON Schema */
    private JsonSchema inputSchema;

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public JsonSchema getInputSchema() {
        return inputSchema;
    }

    public void setInputSchema(JsonSchema inputSchema) {
        this.inputSchema = inputSchema;
    }
}