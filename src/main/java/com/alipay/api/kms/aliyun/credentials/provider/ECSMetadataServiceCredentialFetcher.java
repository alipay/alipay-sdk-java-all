package com.alipay.api.kms.aliyun.credentials.provider;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.api.kms.aliyun.credentials.EcsRamRoleCredentials;
import com.alipay.api.kms.aliyun.credentials.exceptions.CredentialsException;
import com.alipay.api.kms.aliyun.http.CompatibleUrlConnClient;
import com.alipay.api.kms.aliyun.http.HttpRequest;
import com.alipay.api.kms.aliyun.http.HttpResponse;
import com.alipay.api.kms.aliyun.http.MethodType;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ECSMetadataServiceCredentialFetcher {
    private static final String URL_IN_ECS_METADATA = "/latest/meta-data/ram/security-credentials/";
    private static final int DEFAULT_TIMEOUT_IN_MILLISECONDS = 5000;
    private static final String ECS_METADAT_FETCH_ERROR_MSG = "Failed to get RAM session credentials from ECS metadata service.";
    private static final int DEFAULT_ECS_SESSION_TOKEN_DURATION_SECONDS = 3600 * 6;
    private URL credentialUrl;
    private String roleName;
    private String metadataServiceHost = "100.100.100.200";
    private int connectionTimeoutInMilliseconds;

    public ECSMetadataServiceCredentialFetcher() {
        this.connectionTimeoutInMilliseconds = DEFAULT_TIMEOUT_IN_MILLISECONDS;
    }

    public void setRoleName(String roleName) {
        if (null == roleName) {
            throw new NullPointerException("You must specifiy a valid role name.");
        }
        this.roleName = roleName;
        setCredentialUrl();
    }

    private void setCredentialUrl() {
        try {
            this.credentialUrl = new URL("http://" + metadataServiceHost + URL_IN_ECS_METADATA + roleName);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e.toString());
        }
    }

    public ECSMetadataServiceCredentialFetcher withECSMetadataServiceHost(String host) {
        System.err.println("withECSMetadataServiceHost() method is only for testing, please don't use it");
        this.metadataServiceHost = host;
        setCredentialUrl();
        return this;
    }

    public ECSMetadataServiceCredentialFetcher withConnectionTimeout(int milliseconds) {
        this.connectionTimeoutInMilliseconds = milliseconds;
        return this;
    }

    public String getMetadata() throws CredentialsException {
        HttpRequest request = new HttpRequest(credentialUrl.toString());
        request.setMethod(MethodType.GET);
        request.setConnectTimeout(connectionTimeoutInMilliseconds);
        request.setReadTimeout(connectionTimeoutInMilliseconds);
        HttpResponse response;

        try {
            response = CompatibleUrlConnClient.compatibleGetResponse(request);
        } catch (Exception e) {
            throw new CredentialsException("Failed to connect ECS Metadata Service: " + e.toString());
        }

        if (response.getStatus() != HttpURLConnection.HTTP_OK) {
            throw new CredentialsException(ECS_METADAT_FETCH_ERROR_MSG + " HttpCode=" + response.getStatus());
        }

        return new String(response.getHttpContent());
    }

    public EcsRamRoleCredentials fetch() throws CredentialsException {
        String jsonContent = getMetadata();
        JSONObject jsonObject;
        jsonObject = JSON.parseObject(jsonContent);

        if (jsonObject.containsKey("Code") && jsonObject.containsKey("AccessKeyId") && jsonObject.containsKey("AccessKeySecret") && jsonObject
                .containsKey("SecurityToken") && jsonObject.containsKey("Expiration")) {
        } else {
            throw new CredentialsException("Invalid json got from ECS Metadata service.");
        }

        if (!"Success".equals(jsonObject.getString("Code"))) {
            throw new CredentialsException(ECS_METADAT_FETCH_ERROR_MSG);
        }
        return new EcsRamRoleCredentials(jsonObject.getString("AccessKeyId"), jsonObject.getString(
                "AccessKeySecret"), jsonObject.getString("SecurityToken"), jsonObject.getString(
                "Expiration"), DEFAULT_ECS_SESSION_TOKEN_DURATION_SECONDS);
    }

    public EcsRamRoleCredentials fetch(int retryTimes) throws CredentialsException {
        for (int i = 0; i <= retryTimes; i++) {
            try {
                return fetch();
            } catch (CredentialsException e) {
                if (i == retryTimes) {
                    throw e;
                }
            }
        }
        throw new CredentialsException("Failed to connect ECS Metadata Service: Max retry times exceeded.");
    }
}
