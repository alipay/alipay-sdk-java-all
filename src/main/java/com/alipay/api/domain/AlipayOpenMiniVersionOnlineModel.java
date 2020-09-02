package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序上架
 *
 * @author auto create
 * @since 1.0, 2020-03-25 11:36:33
 */
public class AlipayOpenMiniVersionOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 1139876777686284184L;

	/**
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 端参数，可不选，默认支付宝端
	 */
	@ApiField("bundle_id")
	private String bundleId;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

}
