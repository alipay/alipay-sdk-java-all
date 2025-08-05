package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 闪蝶侧小程序类型应用的源数据
 *
 * @author auto create
 * @since 1.0, 2019-12-10 16:02:33
 */
public class MorphoMiniMeta extends AlipayObject {

	private static final long serialVersionUID = 2544726491373134616L;

	/**
	 * 小程序的名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 最新构建版本
	 */
	@ApiField("builded_version")
	private String buildedVersion;

	/**
	 * 小程序LOGO
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 当前线上版本
	 */
	@ApiField("online_version")
	private String onlineVersion;

	/**
	 * 小程序状态
	 */
	@ApiField("status")
	private String status;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getBuildedVersion() {
		return this.buildedVersion;
	}
	public void setBuildedVersion(String buildedVersion) {
		this.buildedVersion = buildedVersion;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getOnlineVersion() {
		return this.onlineVersion;
	}
	public void setOnlineVersion(String onlineVersion) {
		this.onlineVersion = onlineVersion;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
