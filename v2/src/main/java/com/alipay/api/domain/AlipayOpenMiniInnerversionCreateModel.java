package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内部小程序 - 版本创建
 *
 * @author auto create
 * @since 1.0, 2020-09-01 22:15:17
 */
public class AlipayOpenMiniInnerversionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8483819355153382484L;

	/**
	 * 创建的版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 一个端的标识，用于区分不同的客户端，每接入一个客户端，都需要向小程序应用中心申请bundelId入驻
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 租户code，alipay or taobao
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 一个端的标识，用于区分不同的客户端，每接入一个客户端，都需要向小程序应用中心申请bundelId入驻
	 */
	@ApiField("target_bundle_id")
	private String targetBundleId;

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

	public String getTargetBundleId() {
		return this.targetBundleId;
	}
	public void setTargetBundleId(String targetBundleId) {
		this.targetBundleId = targetBundleId;
	}

}
