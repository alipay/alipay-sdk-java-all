package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预发确认
 *
 * @author auto create
 * @since 1.0, 2018-12-17 17:26:27
 */
public class AlipayOpenMiniInnerversionPreonlineConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 3597588525776471856L;

	/**
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 小程序Id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}
