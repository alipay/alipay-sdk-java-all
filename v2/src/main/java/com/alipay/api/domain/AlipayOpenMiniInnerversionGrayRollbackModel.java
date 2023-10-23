package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内部小程序-回滚
 *
 * @author auto create
 * @since 1.0, 2019-05-06 10:37:31
 */
public class AlipayOpenMiniInnerversionGrayRollbackModel extends AlipayObject {

	private static final long serialVersionUID = 4342522126879597256L;

	/**
	 * 回滚灰度版本号
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
	 * 回滚灰度的目标版本
	 */
	@ApiField("target_version")
	private String targetVersion;

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

	public String getTargetVersion() {
		return this.targetVersion;
	}
	public void setTargetVersion(String targetVersion) {
		this.targetVersion = targetVersion;
	}

}
