package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序结束灰度
 *
 * @author auto create
 * @since 1.0, 2018-12-25 14:14:50
 */
public class AlipayOpenMiniVersionGrayCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1244499425219599329L;

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
