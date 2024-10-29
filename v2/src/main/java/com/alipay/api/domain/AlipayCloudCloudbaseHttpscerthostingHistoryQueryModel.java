package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Https证书历史查询
 *
 * @author auto create
 * @since 1.0, 2024-07-09 14:52:14
 */
public class AlipayCloudCloudbaseHttpscerthostingHistoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7488342988985422377L;

	/**
	 * 小程序云应用APPID
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 小程序云环境ID
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * https证书ID
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
