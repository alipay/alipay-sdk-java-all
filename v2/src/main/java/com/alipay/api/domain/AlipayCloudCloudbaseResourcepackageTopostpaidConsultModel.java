package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 套餐转按量询价
 *
 * @author auto create
 * @since 1.0, 2025-03-12 16:05:57
 */
public class AlipayCloudCloudbaseResourcepackageTopostpaidConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7437939516794348261L;

	/**
	 * 小程序云应用APPID
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 小程序云应用ENVID
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
