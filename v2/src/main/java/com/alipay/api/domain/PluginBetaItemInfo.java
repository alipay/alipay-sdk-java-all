package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 邀测结果列表
 *
 * @author auto create
 * @since 1.0, 2021-05-18 11:09:08
 */
public class PluginBetaItemInfo extends AlipayObject {

	private static final long serialVersionUID = 1422716199642781255L;

	/**
	 * 小程序名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 被邀测状态，待确认WAITCHECK/确认CHECKED/拒绝REJECT
	 */
	@ApiField("beta_status")
	private String betaStatus;

	/**
	 * 拒绝原因
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 插件id
	 */
	@ApiField("plugin_id")
	private String pluginId;

	/**
	 * 插件版本
	 */
	@ApiField("plugin_version")
	private String pluginVersion;

	/**
	 * 邀测二维码
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getBetaStatus() {
		return this.betaStatus;
	}
	public void setBetaStatus(String betaStatus) {
		this.betaStatus = betaStatus;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPluginId() {
		return this.pluginId;
	}
	public void setPluginId(String pluginId) {
		this.pluginId = pluginId;
	}

	public String getPluginVersion() {
		return this.pluginVersion;
	}
	public void setPluginVersion(String pluginVersion) {
		this.pluginVersion = pluginVersion;
	}

	public String getQrCodeUrl() {
		return this.qrCodeUrl;
	}
	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}

}
