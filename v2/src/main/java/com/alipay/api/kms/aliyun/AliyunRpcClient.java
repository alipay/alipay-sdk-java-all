package com.alipay.api.kms.aliyun;

import com.alibaba.fastjson.JSON;
import com.alipay.api.internal.util.StringUtils;
import com.alipay.api.kms.aliyun.credentials.AccessKeyCredentials;
import com.alipay.api.kms.aliyun.credentials.BasicSessionCredentials;
import com.alipay.api.kms.aliyun.credentials.ICredentials;
import com.alipay.api.kms.aliyun.credentials.provider.*;
import com.alipay.api.kms.aliyun.exceptions.ClientException;
import com.alipay.api.kms.aliyun.exceptions.ServerException;
import com.alipay.api.kms.aliyun.http.*;
import com.alipay.api.kms.aliyun.utils.BackoffUtils;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AliyunRpcClient {
    private static final String SIGNATURE_BEGIN = "string to sign is:";
    private final String endpoint;
    private final CompatibleUrlConnClient httpClient;
    private ICredentialsProvider credentialsProvider;
    private BackoffStrategy backoffStrategy;
    private final CredentialsProviderFactory factory;

    public AliyunRpcClient(String endpoint) {
        this.endpoint = endpoint;
        this.httpClient = new CompatibleUrlConnClient();
        this.backoffStrategy = new FullJitterBackoffStrategy();
        this.factory = new CredentialsProviderFactory();
    }

    public AliyunRpcClient(String endpoint, String accessKeyId, String accessKeySecret) {
        this(endpoint);
        this.credentialsProvider = getAccessKeyCredentialsProvider(accessKeyId, accessKeySecret);
    }

    public AliyunRpcClient(String endpoint, String accessKeyId, String accessKeySecret, String securityToken) {
        this(endpoint);
        this.credentialsProvider = getStsTokenCredentialsProvider(accessKeyId, accessKeySecret, securityToken);
    }

    public AliyunRpcClient(String endpoint, String accessKeyId, String accessKeySecret, String roleArn, String roleSessionName) {
        this(endpoint);
        this.credentialsProvider = getRamRoleArnCredentialsProvider(accessKeyId, accessKeySecret, roleArn, roleSessionName, "");
    }

    public AliyunRpcClient(String endpoint, String accessKeyId, String accessKeySecret, String roleArn, String roleSessionName,
                           String policy) {
        this(endpoint);
        this.credentialsProvider = getRamRoleArnCredentialsProvider(accessKeyId, accessKeySecret, roleArn, roleSessionName, policy);
    }

    public AliyunRpcClient(String endpoint, String roleName) {
        this(endpoint);
        this.credentialsProvider = getEcsRamRoleCredentialsProvider(roleName);
    }

    public AliyunRpcClient withBackoffStrategy(BackoffStrategy backoffStrategy) {
        this.backoffStrategy = backoffStrategy;
        return this;
    }

    private ICredentialsProvider getAccessKeyCredentialsProvider(String accessKeyId, String accessKeySecret) {
        return factory.createCredentialsProvider(new StaticCredentialsProvider(new AccessKeyCredentials(accessKeyId,
                accessKeySecret)));
    }

    private ICredentialsProvider getStsTokenCredentialsProvider(String accessKeyId, String accessKeySecret, String securityToken) {
        return factory.createCredentialsProvider(new StaticCredentialsProvider(new BasicSessionCredentials(accessKeyId,
                accessKeySecret, securityToken)));
    }

    private ICredentialsProvider getEcsRamRoleCredentialsProvider(String roleName) {
        if (StringUtils.isEmpty(roleName)) {
            throw new IllegalArgumentException("The roleName is empty");
        }
        return factory.createCredentialsProvider(new EcsRamRoleCredentialsProvider(roleName));
    }

    private ICredentialsProvider getRamRoleArnCredentialsProvider(String accessKeyId, String accessKeySecret, String roleArn,
                                                                  String roleSessionName, String policy) {
        if (StringUtils.isEmpty(accessKeyId) || StringUtils.isEmpty(accessKeySecret)) {
            throw new IllegalArgumentException("The accessKeyId or accessKeySecret is empty");
        }
        if (StringUtils.isEmpty(roleArn) || StringUtils.isEmpty(roleSessionName)) {
            throw new IllegalArgumentException("The roleArn or roleSessionName is empty");
        }
        if (StringUtils.isEmpty(policy)) {
            return factory.createCredentialsProvider(new RamRoleArnCredentialsProvider(accessKeyId, accessKeySecret, roleArn,
                    roleSessionName));
        }
        return factory.createCredentialsProvider(new RamRoleArnCredentialsProvider(accessKeyId, accessKeySecret, roleArn,
                roleSessionName, policy));
    }

    public <T extends AliyunResponse> HttpResponse doRequest(AliyunRequest<T> request) throws ClientException {
        int retryTimes = 0;
        Long waitTimeExponential;
        while ((waitTimeExponential = backoffStrategy.getWaitTimeExponential(retryTimes)) > 0) {
            try {
                return this.doAction(request);
            } catch (ClientException e) {
                if (!BackoffUtils.judgeNeedBackoff(e)) {
                    throw e;
                }
                sleep(waitTimeExponential);
            }
            retryTimes = retryTimes + 1;
        }
        throw new ClientException("No results were obtained from KMS, after retrying " + retryTimes + " times");
    }

    private void sleep(Long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException ignore) {
        }
    }

    private <T extends AliyunResponse> HttpResponse doAction(AliyunRequest<T> request) throws ClientException {
        HttpResponse response;
        try {
            ICredentials credentials = this.credentialsProvider.getCredentials();
            HttpRequest httpRequest = request.signRequest(credentials, endpoint);
            response = this.httpClient.syncInvoke(httpRequest);
            return response;
        } catch (IOException e) {
            throw new ClientException("ServerUnreachable", "Server unreachable: connection " + request.getUrl() + " failed", e);
        } catch (NoSuchAlgorithmException e) {
            throw new ClientException("InvalidMD5Algorithm", "MD5 hash is not supported by client side.", e);
        } catch (Exception e) {
            throw new ClientException(e);
        }
    }

    public <T extends AliyunResponse> T getAcsResponse(AliyunRequest<T> request) throws ClientException {
        HttpResponse baseResponse = this.doRequest(request);
        return parseAcsResponse(request, baseResponse);
    }

    private <T extends AliyunResponse> T parseAcsResponse(AliyunRequest<T> request, HttpResponse baseResponse) throws ClientException {
        FormatType format = baseResponse.getHttpContentType();
        if (FormatType.JSON != format && FormatType.XML != format) {
            throw new ClientException(String.format("Server response has a bad format type: %s;\nThe original return is: %s;", format, baseResponse.getHttpContentString()));
        }
        if (baseResponse.isSuccess()) {
            return readResponse(request.getResponseClass(), baseResponse, format);
        } else {
            AliyunError error = readError(baseResponse, format);
            if (500 <= baseResponse.getStatus()) {
                throw new ServerException(error.getErrorCode(), error.getErrorMessage(), error.getRequestId());
            } else if (400 == baseResponse.getStatus() && ("IncompleteSignature".equals(error.getErrorCode())
                    || "SignatureDoesNotMatch".equals(error.getErrorCode()))) {
                String errorMessage = error.getErrorMessage();
                Pattern startPattern = Pattern.compile(SIGNATURE_BEGIN);
                Matcher startMatcher = startPattern.matcher(errorMessage);
                if (startMatcher.find()) {
                    int start = startMatcher.end();
                    String errorStrToSign = errorMessage.substring(start);
                    if (request.strToSign.equals(errorStrToSign)) {
                        throw new ClientException("InvalidAccessKeySecret", "Specified Access Key Secret is not valid.", error.getRequestId());
                    }
                }
            }
            throw new ClientException(error.getErrorCode(), error.getErrorMessage(), error.getRequestId(), error.getErrorDescription());
        }
    }

    protected <T extends AliyunResponse> T readResponse(Class<T> clasz, HttpResponse httpResponse, FormatType format) throws ClientException {
        UnmarshallerContext context = new UnmarshallerContext();
        T response;
        String stringContent = httpResponse.getHttpContentString();
        if (stringContent == null) {
            throw new ClientException("InvalidServerResponse", "Failed to parse the response. The request was succeeded, but the server returned an empty HTTP body.");
        }
        try {
            response = clasz.getConstructor().newInstance();
        } catch (Exception e) {
            throw new ClientException("InvalidResponseClass", "Unable to allocate " + clasz.getName() + " class");
        }
        context.setResponseMap(JSON.parseObject(stringContent).getInnerMap());
        context.setHttpResponse(httpResponse);
        response.getInstance(context);
        return response;

    }

    private AliyunError readError(HttpResponse httpResponse, FormatType format) throws ClientException {
        AliyunError error = new AliyunError();
        UnmarshallerContext context = new UnmarshallerContext();
        String stringContent = httpResponse.getHttpContentString();
        if (stringContent == null) {
            error.setErrorCode("(null)");
            error.setErrorMessage("(null)");
            error.setRequestId("(null)");
            error.setStatusCode(httpResponse.getStatus());
            return error;
        } else {
            context.setResponseMap(JSON.parseObject(stringContent).getInnerMap());
            return error.getInstance(context);
        }
    }
}
