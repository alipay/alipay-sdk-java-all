package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序版本详情查询
 *
 * @author auto create
 * @since 1.0, 2018-12-27 11:44:23
 */
public class AlipayOpenMiniVersionDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6664851374337888331L;

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
