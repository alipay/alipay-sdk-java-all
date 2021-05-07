package com.alipay.api.kms.aliyun.credentials.provider;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.api.kms.aliyun.credentials.BasicSessionCredentials;
import com.alipay.api.kms.aliyun.credentials.ICredentials;
import com.alipay.api.kms.aliyun.credentials.exceptions.CredentialsException;
import com.alipay.api.kms.aliyun.http.CompatibleUrlConnClient;
import com.alipay.api.kms.aliyun.http.HttpRequest;
import com.alipay.api.kms.aliyun.http.HttpResponse;
import com.alipay.api.kms.aliyun.http.MethodType;
import com.alipay.api.kms.aliyun.utils.HmacSHA1Signer;
import com.alipay.api.kms.aliyun.utils.ParameterUtils;

public class RamRoleArnCredentialsProvider implements ICredentialsProvider {
    private static final int DEFAULT_DURATION_SECONDS = 3600;
    private static final int DEFAULT_TIMEOUT_IN_MILLISECONDS = 5000;
    private static final String DEFAULT_STS_ENDPOINT = "sts.aliyuncs.com";
    private final String roleArn;
    private final String roleSessionName;
    private final String accessKeyId;
    private final String accessKeySecret;
    private final String stsEndpoint;
    private String policy;
    private Integer connectTimeout;
    private Integer readTimeout;
    private BasicSessionCredentials credential = null;

    public RamRoleArnCredentialsProvider(String accessKeyId, String accessKeySecret, String roleArn, String roleSessionName) {
        this.roleArn = roleArn;
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
        this.roleSessionName = roleSessionName;
        this.stsEndpoint = DEFAULT_STS_ENDPOINT;
        this.connectTimeout = DEFAULT_TIMEOUT_IN_MILLISECONDS;
        this.readTimeout = DEFAULT_TIMEOUT_IN_MILLISECONDS;
    }

    public RamRoleArnCredentialsProvider(String accessKeyId, String accessKeySecret, String roleArn, String roleSessionName, String policy) {
        this(accessKeyId, accessKeySecret, roleArn, roleSessionName);
        this.policy = policy;
    }

    @Override
    public ICredentials getCredentials() throws Exception {
        if (credential == null || credential.willSoonExpire()) {
            CompatibleUrlConnClient client = new CompatibleUrlConnClient();
            credential = getNewSessionCredential(client);
        }
        return credential;
    }

    public BasicSessionCredentials getNewSessionCredential(CompatibleUrlConnClient client) throws Exception {
        HttpRequest httpRequest = new HttpRequest();
        httpRequest.setUrlParameter("Action", "AssumeRole");
        httpRequest.setUrlParameter("Format", "JSON");
        httpRequest.setUrlParameter("Version", "2015-04-01");
        httpRequest.setUrlParameter("DurationSeconds", String.valueOf(DEFAULT_DURATION_SECONDS));
        httpRequest.setUrlParameter("RoleArn", this.roleArn);
        httpRequest.setUrlParameter("AccessKeyId", this.accessKeyId);
        httpRequest.setUrlParameter("RoleSessionName", this.roleSessionName);
        if (this.policy != null) {
            httpRequest.setUrlParameter("Policy", this.policy);
        }
        httpRequest.setMethod(MethodType.GET);
        httpRequest.setConnectTimeout(this.connectTimeout);
        httpRequest.setReadTimeout(this.readTimeout);
        String strToSign = ParameterUtils.composeStringToSign(MethodType.GET, httpRequest.getUrlParameters());
        String signature = HmacSHA1Signer.signString(strToSign, this.accessKeySecret + "&");
        httpRequest.setUrlParameter("Signature", signature);
        httpRequest.setUrl(ParameterUtils.composeUrl(this.stsEndpoint, httpRequest.getUrlParameters(), "https"));
        HttpResponse httpResponse = client.syncInvoke(httpRequest);

        JSONObject map = JSON.parseObject(httpResponse.getHttpContentString());
        if (map.containsKey("Credentials")) {
            JSONObject credential = map.getJSONObject("Credentials");
            Long expiration = ParameterUtils.getUTCDate(credential.getString("Expiration")).getTime();
            return new BasicSessionCredentials(credential.getString("AccessKeyId"), credential.getString("AccessKeySecret"),
                    credential.getString("SecurityToken"), expiration);
        } else {
            throw new CredentialsException(JSON.toJSONString(map));
        }
    }

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public Integer getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }
}
