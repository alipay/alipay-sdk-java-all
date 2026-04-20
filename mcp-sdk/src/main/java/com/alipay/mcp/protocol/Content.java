package com.alipay.mcp.protocol;

/**
 * 内容项
 *
 * @author alipay
 */
public class Content {

    /** 内容类型：text, image, resource */
    private String type;

    /** 文本内容 (type=text 时) */
    private String text;

    /** MIME 类型 */
    private String mimeType;

    /** 图片数据 (type=image 时) */
    private String data;

    /** 资源引用 (type=resource 时) */
    private Resource resource;

    // getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }
}