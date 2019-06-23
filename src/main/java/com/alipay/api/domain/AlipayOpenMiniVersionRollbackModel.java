package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序回滚
 *
 * @author auto create
 * @since 1.0, 2019-04-11 19:55:48
 */
public class AlipayOpenMiniVersionRollbackModel extends AlipayObject {

	private static final long serialVersionUID = 7675289162938172666L;

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
