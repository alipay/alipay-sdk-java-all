package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序删除版本
 *
 * @author auto create
 * @since 1.0, 2022-12-05 13:38:49
 */
public class AlipayOpenMiniVersionDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8389268472568546217L;

	/**
	 *  小程序版本号。只有状态为开发中的版本才能被删除。
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 小程序投放的端参数，例如投放到支付宝钱包是支付宝端。默认支付宝端。支持：
com.alipay.alipaywallet:支付宝端；
com.alipay.iot.xpaas：支付宝IoT端。
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
