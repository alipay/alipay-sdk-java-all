package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序版本详情查询
 *
 * @author auto create
 * @since 1.0, 2023-06-20 17:28:14
 */
public class AlipayOpenMiniVersionDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8629573598977671839L;

	/**
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 小程序投放的端参数，支持：
com.alipay.iot.xpaas（IoT端）。
com.alipay.alipaywallet（支付宝钱包端）。
例如投放到支付宝钱包是支付宝端。该参数可选，默认支付宝端。
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
