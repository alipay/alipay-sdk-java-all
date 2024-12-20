package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 版本子状态修改
 *
 * @author auto create
 * @since 1.0, 2024-04-23 10:23:06
 */
public class AlipayOpenMiniInnerversionSubstatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3788965979122871238L;

	/**
	 * 小程序开发版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 端标识
淘宝：com.taobao.app
支付宝：com.alipay.alipaywallet
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 租户编码
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 子状态
	 */
	@ApiField("sub_status")
	private String subStatus;

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

	public String getSubStatus() {
		return this.subStatus;
	}
	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}

}
