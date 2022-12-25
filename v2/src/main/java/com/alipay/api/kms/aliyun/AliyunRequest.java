package com.alipay.api.kms.aliyun;

import com.alipay.api.kms.aliyun.credentials.ICredentials;
import com.alipay.api.kms.aliyun.http.FormatType;
import com.alipay.api.kms.aliyun.http.HttpRequest;
import com.alipay.api.kms.aliyun.http.MethodType;
import com.alipay.api.kms.aliyun.http.ProtocolType;
import com.alipay.api.kms.aliyun.utils.HmacSHA1Signer;
import com.alipay.api.kms.aliyun.utils.ParameterUtils;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class AliyunRequest<T extends AliyunResponse> extends HttpRequest {
    private static final int DEFAULT_TIMEOUT_IN_MILLISECONDS = 5000;
    private final Map<String, String> queryParameters = new HashMap<String, String>();
    private final Map<String, String> domainParameters = new HashMap<String, String>();
    private final Map<String, String> bodyParameters = new HashMap<String, String>();
    private String version;
    private String actionName;
    private String securityToken;
    private FormatType acceptFormat;
    public ProtocolType protocol;
    protected String strToSign;

    public AliyunRequest() {
        this.headers.put("x-sdk-client", "Java/2.0.0");
        this.headers.put("x-sdk-invoke-type", "normal");
        init();
    }

    public AliyunRequest(String version, String action) {
        this();
        this.setVersion(version);
        this.setActionName(action);
    }

    private void init() {
        this.setMethod(MethodType.GET);
        this.setAcceptFormat(FormatType.JSON);
        this.setHttpContentType(FormatType.FORM);
        this.setProtocol(ProtocolType.HTTPS);
        this.setConnectTimeout(DEFAULT_TIMEOUT_IN_MILLISECONDS);
        this.setReadTimeout(DEFAULT_TIMEOUT_IN_MILLISECONDS * 2);
    }

    public Map<String, String> getQueryParameters() {
        return Collections.unmodifiableMap(queryParameters);
    }

    public <K> void putQueryParameter(String name, K value) {
        setParameter(this.queryParameters, name, value);
    }

    protected void putQueryParameter(String name, String value) {
        setParameter(this.queryParameters, name, value);
    }

    public Map<String, String> getDomainParameters() {
        return Collections.unmodifiableMap(domainParameters);
    }

    protected void putDomainParameter(String name, Object value) {
        setParameter(this.domainParameters, name, value);
    }

    protected void putDomainParameter(String name, String value) {
        setParameter(this.domainParameters, name, value);
    }

    public Map<String, String> getBodyParameters() {
        return Collections.unmodifiableMap(bodyParameters);
    }

    protected void putBodyParameter(String name, Object value) {
        setParameter(this.bodyParameters, name, value);
    }

    protected void setParameter(Map<String, String> map, String name, Object value) {
        if (null == map || name == null || value == null) {
            return;
        }
        map.put(name, String.valueOf(value));
    }

    public HttpRequest signRequest(ICredentials credentials, String endpoint) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Map<String, String> imutableMap = new HashMap<String, String>(this.getQueryParameters());
        if (null != credentials) {
            String accessKeyId = credentials.getAccessKeyId();
            String accessSecret = credentials.getAccessKeySecret();
            String securityToken = credentials.getSecurityToken();
            if (securityToken != null) {
                this.putQueryParameter("SecurityToken", securityToken);
            }

            imutableMap = ParameterUtils.refreshSignParameters(this.getQueryParameters(), accessKeyId, this.getAcceptFormat());

            Map<String, String> paramsToSign = new HashMap<String, String>(imutableMap);
            Map<String, String> bodyParams = this.getBodyParameters();
            if (bodyParams != null && !bodyParams.isEmpty()) {
                byte[] data;
                if (FormatType.JSON == this.getHttpContentType()) {
                    data = ParameterUtils.getJsonData(bodyParams);
                } else if (FormatType.XML == this.getHttpContentType()) {
                    data = ParameterUtils.getXmlData(bodyParams);
                } else {
                    // For contentType RAW and Form, the actual data format will be form
                    data = ParameterUtils.getFormData(bodyParams);
                }
                this.setHttpContent(data, "UTF-8", null);
                paramsToSign.putAll(bodyParams);
            }

            String strToSign = ParameterUtils.composeStringToSign(this.getMethod(), paramsToSign);
            String signature = HmacSHA1Signer.signString(strToSign, accessSecret + "&");
            imutableMap.put("Signature", signature);
            this.strToSign = strToSign;
        }
        setUrl(ParameterUtils.composeUrl(endpoint, imutableMap, this.getProtocol().toString()));
        return this;
    }

    public abstract Class<T> getResponseClass();

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
        this.putQueryParameter("Version", version);
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
        this.putQueryParameter("Action", actionName);
    }

    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        this.putQueryParameter("SecurityToken", securityToken);
    }

    public FormatType getAcceptFormat() {
        return acceptFormat;
    }

    public void setAcceptFormat(FormatType acceptFormat) {
        this.acceptFormat = acceptFormat;
        this.putHeaderParameter("Accept", FormatType.mapFormatToAccept(acceptFormat));
        this.putQueryParameter("Format", acceptFormat.toString());
    }

    public ProtocolType getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolType protocol) {
        this.protocol = protocol;
    }

    public String getStrToSign() {
        return strToSign;
    }

    public void setStrToSign(String strToSign) {
        this.strToSign = strToSign;
    }
}
