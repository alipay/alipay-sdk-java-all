package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建 Access Key
 *
 * @author auto create
 * @since 1.0, 2023-08-09 11:02:20
 */
public class AlipayCloudCloudbaseEnvAkCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2297554854522153364L;

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
	 * 描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 是否开启
	 */
	@ApiField("enable")
	private Boolean enable;

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

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getEnable() {
		return this.enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

}
