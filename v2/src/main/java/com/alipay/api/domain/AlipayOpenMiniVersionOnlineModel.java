package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序上架
 *
 * @author auto create
 * @since 1.0, 2022-12-04 22:26:51
 */
public class AlipayOpenMiniVersionOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 1659182534115595871L;

	/**
	 * 商家小程序版本号，需为审核通过状态或灰度中版本。
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
