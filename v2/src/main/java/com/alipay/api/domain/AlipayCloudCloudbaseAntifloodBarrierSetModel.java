package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设置防刷门槛配置
 *
 * @author auto create
 * @since 1.0, 2023-09-14 17:42:04
 */
public class AlipayCloudCloudbaseAntifloodBarrierSetModel extends AlipayObject {

	private static final long serialVersionUID = 8266521172151927879L;

	/**
	 * 封禁时长（秒） [60, 3*86400]
	 */
	@ApiField("ban_duration")
	private Long banDuration;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 请求量上限 [100, 99999999]
	 */
	@ApiField("request_limit")
	private Long requestLimit;

	/**
	 * 时间窗口（秒） [60, 86400]
	 */
	@ApiField("time_window")
	private Long timeWindow;

	public Long getBanDuration() {
		return this.banDuration;
	}
	public void setBanDuration(Long banDuration) {
		this.banDuration = banDuration;
	}

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public Long getRequestLimit() {
		return this.requestLimit;
	}
	public void setRequestLimit(Long requestLimit) {
		this.requestLimit = requestLimit;
	}

	public Long getTimeWindow() {
		return this.timeWindow;
	}
	public void setTimeWindow(Long timeWindow) {
		this.timeWindow = timeWindow;
	}

}
