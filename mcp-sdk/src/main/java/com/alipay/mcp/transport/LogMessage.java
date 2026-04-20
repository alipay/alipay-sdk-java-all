package com.alipay.mcp.transport;

/**
 * SSE log 事件 - 日志输出
 *
 * @author alipay
 */
public class LogMessage {

    /** 日志级别：debug, info, warn, error */
    private String level;

    /** 日志记录器名称 */
    private String logger;

    /** 日志消息 */
    private String message;

    /** 时间戳 */
    private Long timestamp;

    // getters and setters
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLogger() {
        return logger;
    }

    public void setLogger(String logger) {
        this.logger = logger;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}