package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序撤销审核
 *
 * @author auto create
 * @since 1.0, 2019-10-18 14:29:06
 */
public class AlipayOpenMiniVersionAuditCancelModel extends AlipayObject {

	private static final long serialVersionUID = 4443456679952323775L;

	/**
	 * 小程序版本号, 可不选, 默认撤消正在审核中的版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 端参数，可不选，默认支付宝端(com.alipay.alipaywallet:支付宝端)
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
