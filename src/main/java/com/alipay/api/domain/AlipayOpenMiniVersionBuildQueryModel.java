package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序构建状态查询
 *
 * @author auto create
 * @since 1.0, 2018-12-24 16:51:07
 */
public class AlipayOpenMiniVersionBuildQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4821867495811414778L;

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
