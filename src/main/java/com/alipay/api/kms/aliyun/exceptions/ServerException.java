package com.alipay.api.kms.aliyun.exceptions;

public class ServerException extends ClientException {
    public ServerException(String errorCode, String errorMessage) {
        super(errorCode, errorMessage);
        this.setErrorType(ErrorType.Server);
    }

    public ServerException(String errCode, String errMsg, String requestId) {
        this(errCode, errMsg);
        this.setRequestId(requestId);
    }
}
