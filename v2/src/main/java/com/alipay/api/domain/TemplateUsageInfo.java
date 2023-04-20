package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板使用信息
 *
 * @author auto create
 * @since 1.0, 2018-02-08 19:33:59
 */
public class TemplateUsageInfo extends AlipayObject {

	private static final long serialVersionUID = 2637814166795543358L;

	/**
	 * 商家小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 商家小程序appId
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
