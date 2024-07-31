package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云函数配置信息
 *
 * @author auto create
 * @since 1.0, 2023-12-21 19:59:49
 */
public class Config extends AlipayObject {

	private static final long serialVersionUID = 2545628721175136912L;

	/**
	 * 异步配置
	 */
	@ApiField("async_config")
	private FunctionAsyncConfig asyncConfig;

	/**
	 * 是否开启异步
	 */
	@ApiField("async_enable")
	private Boolean asyncEnable;

	/**
	 * 异步请求超时时间（毫秒）
	 */
	@ApiField("async_max_req_timeout")
	private Long asyncMaxReqTimeout;

	/**
	 * 异步最大重试次数
	 */
	@ApiField("async_max_retry_time")
	private Long asyncMaxRetryTime;

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

	public FunctionAsyncConfig getAsyncConfig() {
		return this.asyncConfig;
	}
	public void setAsyncConfig(FunctionAsyncConfig asyncConfig) {
		this.asyncConfig = asyncConfig;
	}

	public Boolean getAsyncEnable() {
		return this.asyncEnable;
	}
	public void setAsyncEnable(Boolean asyncEnable) {
		this.asyncEnable = asyncEnable;
	}

	public Long getAsyncMaxReqTimeout() {
		return this.asyncMaxReqTimeout;
	}
	public void setAsyncMaxReqTimeout(Long asyncMaxReqTimeout) {
		this.asyncMaxReqTimeout = asyncMaxReqTimeout;
	}

	public Long getAsyncMaxRetryTime() {
		return this.asyncMaxRetryTime;
	}
	public void setAsyncMaxRetryTime(Long asyncMaxRetryTime) {
		this.asyncMaxRetryTime = asyncMaxRetryTime;
	}

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
