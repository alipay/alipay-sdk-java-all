package com.alipay.mcp.protocol;

import java.util.Map;

/**
 * Tool 调用参数
 *
 * @author alipay
 */
public class ToolCallParams {

    /** 工具名称 */
    private String name;

    /** 调用参数 */
    private Map<String, Object> arguments;

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getArguments() {
        return arguments;
    }

    public void setArguments(Map<String, Object> arguments) {
        this.arguments = arguments;
    }
}