package com.alipay.api.kms.aliyun.utils;

import com.alipay.api.kms.aliyun.exceptions.ClientException;

public class BackoffUtils {
    /**
     * KMS限流返回错误码
     */
    private final static String REJECTED_THROTTLING = "Rejected.Throttling";
    /**
     * KMS服务不可用返回错误码
     */
    private final static String SERVICE_UNAVAILABLE_TEMPORARY = "ServiceUnavailableTemporary";
    /**
     * KMS服务内部错误返回错误码
     */
    private final static String INTERNAL_FAILURE = "InternalFailure";

    private BackoffUtils() {
        // do noting
    }

    /**
     * 根据Client异常判断是否进行规避重试
     *
     * @param e 指定Client异常
     * @return
     */
    public static boolean judgeNeedBackoff(ClientException e) {
        return REJECTED_THROTTLING.equals(e.getErrCode()) || SERVICE_UNAVAILABLE_TEMPORARY.equals(e.getErrCode()) || INTERNAL_FAILURE.equals(e.getErrCode());
    }
}
