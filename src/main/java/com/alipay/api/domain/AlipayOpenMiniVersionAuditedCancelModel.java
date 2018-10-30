package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序退回开发
 *
 * @author auto create
 * @since 1.0, 2017-12-20 11:05:40
 */
public class AlipayOpenMiniVersionAuditedCancelModel extends AlipayObject {

	private static final long serialVersionUID = 4674283348343672712L;

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
