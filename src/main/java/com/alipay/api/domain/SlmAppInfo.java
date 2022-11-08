package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应用信息（包括app名称+版本）
 *
 * @author auto create
 * @since 1.0, 2022-09-15 20:44:06
 */
public class SlmAppInfo extends AlipayObject {

	private static final long serialVersionUID = 2349748373117322219L;

	/**
	 * 应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 应用版本
	 */
	@ApiField("app_version")
	private String appVersion;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

}
