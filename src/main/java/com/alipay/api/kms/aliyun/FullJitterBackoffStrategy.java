package com.alipay.api.kms.aliyun;

public class FullJitterBackoffStrategy implements BackoffStrategy {
    private static final Integer DEFAULT_RETRY_MAX_ATTEMPTS = 3;
    private static final Long DEFAULT_RETRY_INITIAL_INTERVAL_MILLS = 2000L;
    private static final Long DEFAULT_CAPACITY = 10000L;

    /**
     * 重试最大尝试次数
     */
    private final Integer retryMaxAttempts;

    /**
     * 重试时间间隔，单位ms
     */
    private final Long retryInitialIntervalMills;

    /**
     * 最大等待时间，单位ms
     */
    private final Long capacity;

    public FullJitterBackoffStrategy() {
        this.retryMaxAttempts = DEFAULT_RETRY_MAX_ATTEMPTS;
        this.retryInitialIntervalMills = DEFAULT_RETRY_INITIAL_INTERVAL_MILLS;
        this.capacity = DEFAULT_CAPACITY;
    }

    public FullJitterBackoffStrategy(Integer retryMaxAttempts, Long retryInitialIntervalMills, Long capacity) {
        this.retryMaxAttempts = retryMaxAttempts;
        this.retryInitialIntervalMills = retryInitialIntervalMills;
        this.capacity = capacity;
    }

    @Override
    public Long getWaitTimeExponential(int retryTimes) {
        if (retryTimes > retryMaxAttempts) {
            return -1L;
        }
        return Math.min(capacity, (long) (Math.pow(2, retryTimes) * retryInitialIntervalMills));
    }
}
