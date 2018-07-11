package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序删除版本
 *
 * @author auto create
 * @since 1.0, 2018-01-18 11:16:19
 */
public class AlipayOpenMiniVersionDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3695883193588966322L;

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
