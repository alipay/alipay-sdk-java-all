package com.alipay.mcp.transport;

/**
 * SSE progress 事件 - 进度更新
 *
 * @author alipay
 */
public class ProgressUpdate {

    /** 进度令牌 */
    private String progressToken;

    /** 当前进度 */
    private Integer progress;

    /** 总进度 */
    private Integer total;

    // getters and setters
    public String getProgressToken() {
        return progressToken;
    }

    public void setProgressToken(String progressToken) {
        this.progressToken = progressToken;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}