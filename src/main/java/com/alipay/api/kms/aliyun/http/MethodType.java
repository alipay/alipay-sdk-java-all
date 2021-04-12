package com.alipay.api.kms.aliyun.http;

public enum MethodType {
    GET(false),
    PUT(true),
    POST(true);

    private final boolean hasContent;

    MethodType(boolean hasContent) {
        this.hasContent = hasContent;
    }

    public boolean hasContent() {
        return hasContent;
    }
}
