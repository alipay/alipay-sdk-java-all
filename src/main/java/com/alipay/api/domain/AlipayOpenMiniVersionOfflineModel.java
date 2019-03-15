package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序下架
 *
 * @author auto create
 * @since 1.0, 2018-12-25 14:15:52
 */
public class AlipayOpenMiniVersionOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 6174617926345971443L;

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
