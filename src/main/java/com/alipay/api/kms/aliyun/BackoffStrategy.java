package com.alipay.api.kms.aliyun;

/**
 * 规避重试策略接口
 */
public interface BackoffStrategy {
    /**
     * 获取规避等待时间
     *
     * @param retryTimes 规避重试次数
     * @return 规避等待时间，时间单位MS
     */
    Long getWaitTimeExponential(int retryTimes);
}
