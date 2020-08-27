package com.alipay.api.kms.aliyun;

import com.alipay.api.kms.aliyun.http.UnmarshallerContext;

import java.util.Map;

public class AliyunError extends AliyunResponse {
    private int statusCode;
    private String errorCode;
    private String errorMessage;
    private String requestId;
    private String errorDescription;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    @Override
    public AliyunError getInstance(UnmarshallerContext context) {
        Map<String, Object> map = context.getResponseMap();
        this.setStatusCode(context.getHttpStatus());
        this.setRequestId((String) map.get("RequestId"));
        this.setErrorCode((String) map.get("Code"));
        this.setErrorMessage((String) map.get("Message"));
        this.setErrorDescription((String) map.get("Description"));
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public String toString() {
        return "AcsError{" + "statusCode=" + statusCode +
                ", errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", requestId='" + requestId + '\'' +
                ", errorDescription='" + errorDescription + '\'' +
                '}';
    }
}
