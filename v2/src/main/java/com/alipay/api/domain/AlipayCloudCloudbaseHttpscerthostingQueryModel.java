package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询Https证书托管列表
 *
 * @author auto create
 * @since 1.0, 2024-06-06 16:20:24
 */
public class AlipayCloudCloudbaseHttpscerthostingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1275541261166842135L;

	/**
	 * 小程序云应用ID
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 小程序云环境ID
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

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

}
