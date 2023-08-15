package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云函数配置信息
 *
 * @author auto create
 * @since 1.0, 2023-08-08 22:17:36
 */
public class Config extends AlipayObject {

	private static final long serialVersionUID = 7394625644242646754L;

	/**
	 * 最大并发数
	 */
	@ApiField("max_concurrency")
	private Long maxConcurrency;

	/**
	 * 空闲等待时间
	 */
	@ApiField("max_idle_timeout")
	private Long maxIdleTimeout;

	/**
	 * 请求超时时间
	 */
	@ApiField("max_req_timeout")
	private Long maxReqTimeout;

	/**
	 * 最大重试次数
	 */
	@ApiField("max_retry_time")
	private Long maxRetryTime;

	public Long getMaxConcurrency() {
		return this.maxConcurrency;
	}
	public void setMaxConcurrency(Long maxConcurrency) {
		this.maxConcurrency = maxConcurrency;
	}

	public Long getMaxIdleTimeout() {
		return this.maxIdleTimeout;
	}
	public void setMaxIdleTimeout(Long maxIdleTimeout) {
		this.maxIdleTimeout = maxIdleTimeout;
	}

	public Long getMaxReqTimeout() {
		return this.maxReqTimeout;
	}
	public void setMaxReqTimeout(Long maxReqTimeout) {
		this.maxReqTimeout = maxReqTimeout;
	}

	public Long getMaxRetryTime() {
		return this.maxRetryTime;
	}
	public void setMaxRetryTime(Long maxRetryTime) {
		this.maxRetryTime = maxRetryTime;
	}

}
