package com.alipay.api.kms.aliyun.credentials;

public interface ICredentials {
    public String getAccessKeyId();

    public String getAccessKeySecret();

    public String getSecurityToken();
}
