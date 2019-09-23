package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序体验版轮询接口
 *
 * @author auto create
 * @since 1.0, 2019-09-04 18:01:05
 */
public class AlipayOpenMiniExperienceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4897174992436222419L;

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
