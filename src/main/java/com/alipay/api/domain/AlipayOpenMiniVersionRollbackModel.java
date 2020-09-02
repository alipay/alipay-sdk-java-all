package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序回滚
 *
 * @author auto create
 * @since 1.0, 2019-11-13 16:54:57
 */
public class AlipayOpenMiniVersionRollbackModel extends AlipayObject {

	private static final long serialVersionUID = 5866441836467556895L;

	/**
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 端参数，可不传。默认支付宝端
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
