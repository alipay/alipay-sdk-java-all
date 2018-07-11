package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序构建状态查询
 *
 * @author auto create
 * @since 1.0, 2018-01-24 23:50:45
 */
public class AlipayOpenMiniVersionBuildQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5356524861791872722L;

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
