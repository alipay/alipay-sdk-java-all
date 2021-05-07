package com.alipay.api.kms.aliyun.credentials.provider;

public class CredentialsProviderFactory {
    public <T extends ICredentialsProvider> T createCredentialsProvider(T classInstance) {
        return classInstance;
    }
}
