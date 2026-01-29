package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设置HTTP访问开关状态
 *
 * @author auto create
 * @since 1.0, 2023-08-08 23:35:47
 */
public class AlipayCloudCloudbaseHttpaccessSwitchSetModel extends AlipayObject {

	private static final long serialVersionUID = 3675394288137677161L;

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
	 * HTTP访问开关状态
	 */
	@ApiField("enabled")
	private Boolean enabled;

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

	public Boolean getEnabled() {
		return this.enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

}
