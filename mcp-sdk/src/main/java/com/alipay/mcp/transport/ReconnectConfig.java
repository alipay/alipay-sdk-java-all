package com.alipay.mcp.transport;

/**
 * 重连配置
 */
public class ReconnectConfig {

    /**
     * 是否启用自动重连
     */
    private boolean enabled = true;

    /**
     * 最大重连次数（-1 表示无限重连）
     */
    private int maxRetries = 5;

    /**
     * 初始重连间隔（毫秒）
     */
    private long initialDelayMs = 1000;

    /**
     * 最大重连间隔（毫秒）
     */
    private long maxDelayMs = 30000;

    /**
     * 重连间隔乘数（指数退避）
     */
    private double multiplier = 2.0;

    /**
     * 重连监听器
     */
    private ReconnectListener listener;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public long getInitialDelayMs() {
        return initialDelayMs;
    }

    public void setInitialDelayMs(long initialDelayMs) {
        this.initialDelayMs = initialDelayMs;
    }

    public long getMaxDelayMs() {
        return maxDelayMs;
    }

    public void setMaxDelayMs(long maxDelayMs) {
        this.maxDelayMs = maxDelayMs;
    }

    public double getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }

    public ReconnectListener getListener() {
        return listener;
    }

    public void setListener(ReconnectListener listener) {
        this.listener = listener;
    }

    /**
     * 计算下一次重连延迟（指数退避）
     */
    public long calculateDelay(int retryCount) {
        long delay = (long) (initialDelayMs * Math.pow(multiplier, retryCount));
        return Math.min(delay, maxDelayMs);
    }

    /**
     * 重连监听器接口
     */
    public interface ReconnectListener {
        /**
         * 重连开始前回调
         *
         * @param retryCount 当前重试次数
         * @param delayMs 延迟毫秒数
         * @param cause 断开原因
         */
        default void onReconnecting(int retryCount, long delayMs, Throwable cause) {}

        /**
         * 重连成功回调
         */
        default void onReconnected() {}

        /**
         * 重连失败回调（达到最大重试次数）
         *
         * @param cause 最后一次失败原因
         */
        default void onReconnectFailed(Throwable cause) {}
    }

    /**
     * 创建默认配置
     */
    public static ReconnectConfig defaultConfig() {
        return new ReconnectConfig();
    }

    /**
     * 创建禁用重连的配置
     */
    public static ReconnectConfig disabled() {
        ReconnectConfig config = new ReconnectConfig();
        config.setEnabled(false);
        return config;
    }

    /**
     * Builder 模式
     */
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final ReconnectConfig config = new ReconnectConfig();

        public Builder enabled(boolean enabled) {
            config.setEnabled(enabled);
            return this;
        }

        public Builder maxRetries(int maxRetries) {
            config.setMaxRetries(maxRetries);
            return this;
        }

        public Builder initialDelayMs(long initialDelayMs) {
            config.setInitialDelayMs(initialDelayMs);
            return this;
        }

        public Builder maxDelayMs(long maxDelayMs) {
            config.setMaxDelayMs(maxDelayMs);
            return this;
        }

        public Builder multiplier(double multiplier) {
            config.setMultiplier(multiplier);
            return this;
        }

        public Builder listener(ReconnectListener listener) {
            config.setListener(listener);
            return this;
        }

        public ReconnectConfig build() {
            return config;
        }
    }
}