package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 是否需要退费
 *
 * @author auto create
 * @since 1.0, 2024-08-20 16:53:17
 */
public class AlipayCloudCloudbaseEnvRefundstatusGetModel extends AlipayObject {

	private static final long serialVersionUID = 2227467928865998831L;

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
