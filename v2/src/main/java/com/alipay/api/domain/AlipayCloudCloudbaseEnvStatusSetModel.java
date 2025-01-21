package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设置停服、复机
 *
 * @author auto create
 * @since 1.0, 2023-08-08 22:44:52
 */
public class AlipayCloudCloudbaseEnvStatusSetModel extends AlipayObject {

	private static final long serialVersionUID = 6445454183395991547L;

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
	 * 环境状态
 - ENABLE
 - MANUAL_DISABLE
	 */
	@ApiField("status")
	private String status;

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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
