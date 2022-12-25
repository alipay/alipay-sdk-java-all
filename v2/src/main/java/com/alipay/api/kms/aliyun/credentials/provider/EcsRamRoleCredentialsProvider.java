package com.alipay.api.kms.aliyun.credentials.provider;

import com.alipay.api.kms.aliyun.credentials.EcsRamRoleCredentials;
import com.alipay.api.kms.aliyun.credentials.ICredentials;
import com.alipay.api.kms.aliyun.credentials.exceptions.CredentialsException;

public class EcsRamRoleCredentialsProvider implements ICredentialsProvider {
    private static final int MAX_ECS_METADATA_FETCH_RETRY_TIMES = 3;
    private final String roleName;
    private EcsRamRoleCredentials credentials = null;
    private ECSMetadataServiceCredentialFetcher fetcher;

    public EcsRamRoleCredentialsProvider(String roleName) {
        if (null == roleName) {
            throw new NullPointerException("You must specifiy a valid role name.");
        }
        this.roleName = roleName;
        this.fetcher = new ECSMetadataServiceCredentialFetcher();
        this.fetcher.setRoleName(this.roleName);
    }

    public EcsRamRoleCredentialsProvider withFetcher(ECSMetadataServiceCredentialFetcher fetcher) {
        this.fetcher = fetcher;
        this.fetcher.setRoleName(roleName);
        return this;
    }

    @Override
    public ICredentials getCredentials() throws CredentialsException {
        if (credentials == null || credentials.isExpired()) {
            credentials = fetcher.fetch(MAX_ECS_METADATA_FETCH_RETRY_TIMES);
        } else if (credentials.willSoonExpire() && credentials.shouldRefresh()) {
            try {
                credentials = fetcher.fetch();
            } catch (CredentialsException e) {
                // Use the current expiring session token and wait for next round
                credentials.setLastFailedRefreshTime();
            }
        }
        return credentials;
    }
}
