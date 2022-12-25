package com.alipay.api.kms.aliyun.http;

public enum ProtocolType {
    HTTP("http"),

    HTTPS("https");

    private final String protocol;

    ProtocolType(String protocol) {
        this.protocol = protocol;
    }

    @Override
    public String toString() {
        return protocol;
    }
}
