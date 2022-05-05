package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序构建状态查询
 *
 * @author auto create
 * @since 1.0, 2021-08-09 11:26:03
 */
public class AlipayOpenMiniVersionBuildQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2275742135988544397L;

	/**
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 小程序投放的端参数，默认为支付宝端。支持： 
com.alipay.alipaywallet：支付宝端。
com.alipay.iot.xpaas：IOT端。
例如：投放到支付宝钱包为支付宝端需传入 com.alipay.alipaywallet。
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
