package com.alipay.api.kms.aliyun.credentials.provider;

import com.alipay.api.kms.aliyun.credentials.ICredentials;

public interface ICredentialsProvider {
    public ICredentials getCredentials() throws Exception;
}
