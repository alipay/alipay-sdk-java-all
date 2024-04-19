package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单个告警历史查询
 *
 * @author auto create
 * @since 1.0, 2024-04-11 09:46:29
 */
public class AlipayCloudCloudbaseMonitorAlarmhistoryGetModel extends AlipayObject {

	private static final long serialVersionUID = 5639762742245725411L;

	/**
	 * 小程序云app ID
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 小程序云环境ID
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 报警历史id
	 */
	@ApiField("id")
	private String id;

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

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
