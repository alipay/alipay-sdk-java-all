package com.alipay.api.kms.aliyun.http;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class TrueHostnameVerifier implements HostnameVerifier {
    @Override
    public boolean verify(String s, SSLSession sslSession) {
        return true;
    }
}
