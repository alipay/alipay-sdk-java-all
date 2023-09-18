package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 云函数版本信息
 *
 * @author auto create
 * @since 1.0, 2023-08-08 22:26:44
 */
public class Version extends AlipayObject {

	private static final long serialVersionUID = 4881575255989178654L;

	/**
	 * 版本描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 环境变量集合
	 */
	@ApiListField("env_vars")
	@ApiField("env_var")
	private List<EnvVar> envVars;

	/**
	 * 版本列表
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 是否为最新版本
	 */
	@ApiField("latest")
	private Boolean latest;

	/**
	 * 空闲等待时间
	 */
	@ApiField("max_idle_timeout")
	private Long maxIdleTimeout;

	/**
	 * 超时时间
	 */
	@ApiField("max_req_timeout")
	private Long maxReqTimeout;

	/**
	 * 重试次数
	 */
	@ApiField("max_retry_time")
	private Long maxRetryTime;

	/**
	 * 版本名称
	 */
	@ApiField("name")
	private String name;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public List<EnvVar> getEnvVars() {
		return this.envVars;
	}
	public void setEnvVars(List<EnvVar> envVars) {
		this.envVars = envVars;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getLatest() {
		return this.latest;
	}
	public void setLatest(Boolean latest) {
		this.latest = latest;
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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
