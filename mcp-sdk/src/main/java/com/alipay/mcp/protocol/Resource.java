package com.alipay.mcp.protocol;

/**
 * 资源引用
 *
 * @author alipay
 */
public class Resource {

    /** 资源 URI */
    private String uri;

    /** 资源名称 */
    private String name;

    /** 资源描述 */
    private String description;

    /** 资源内容 */
    private String content;

    /** MIME 类型 */
    private String mimeType;

    // getters and setters
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
}