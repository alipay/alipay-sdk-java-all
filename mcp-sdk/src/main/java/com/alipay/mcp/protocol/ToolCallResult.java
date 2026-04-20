package com.alipay.mcp.protocol;

import java.util.List;

/**
 * Tool 调用结果
 *
 * @author alipay
 */
public class ToolCallResult {

    /** 返回内容列表 */
    private List<Content> content;

    /** 是否错误 */
    private Boolean isError;

    // getters and setters
    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

    public Boolean getIsError() {
        return isError;
    }

    public void setIsError(Boolean isError) {
        this.isError = isError;
    }
}