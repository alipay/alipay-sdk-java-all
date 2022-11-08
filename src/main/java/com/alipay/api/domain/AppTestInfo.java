package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应用信息
 *
 * @author auto create
 * @since 1.0, 2021-10-23 19:36:22
 */
public class AppTestInfo extends AlipayObject {

	private static final long serialVersionUID = 8188482823522883577L;

	/**
	 * 应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 应用版本
	 */
	@ApiField("app_version")
	private Long appVersion;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public Long getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(Long appVersion) {
		this.appVersion = appVersion;
	}

}
