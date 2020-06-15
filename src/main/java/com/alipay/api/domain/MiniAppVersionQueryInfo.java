package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 100
 *
 * @author auto create
 * @since 1.0, 2018-12-17 17:25:52
 */
public class MiniAppVersionQueryInfo extends AlipayObject {

	private static final long serialVersionUID = 2861383211547249459L;

	/**
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

}
