package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序构建状态查询
 *
 * @author auto create
 * @since 1.0, 2020-03-17 17:08:55
 */
public class AlipayOpenMiniVersionBuildQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6472715636815218462L;

	/**
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 小程序投放的端参数，例如投放到支付宝钱包是支付宝端。该参数可选，默认支付宝端 com.alipay.alipaywallet:支付宝端，com.alipay.iot.xpaas:IOT端
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
