package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过版本查询小程序发布
 *
 * @author auto create
 * @since 1.0, 2020-04-09 16:32:51
 */
public class AlipayOpenMiniAppdeployByappversionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4726713657429798557L;

	/**
	 * 小程序版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 端标识
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 租户
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

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

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}
