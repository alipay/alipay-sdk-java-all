package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家实例化小程序
 *
 * @author auto create
 * @since 1.0, 2023-11-23 17:30:27
 */
public class MiniInstantiateInfo extends AlipayObject {

	private static final long serialVersionUID = 2413498568753564778L;

	/**
	 * 小程序名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 版本号，一般为x.y.x格式，其中x、y、z都是数字
	 */
	@ApiField("latest_version")
	private String latestVersion;

	/**
	 * 版本状态
	 */
	@ApiField("latest_version_status")
	private String latestVersionStatus;

	/**
	 * 小程序logo图标
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 二维码图片链接地址
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	/**
	 * 小程序应用状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 小程序模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 小程序模板名称
	 */
	@ApiField("template_name")
	private String templateName;

	/**
	 * 实例化小程序模板版本号
	 */
	@ApiField("template_version")
	private String templateVersion;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getLatestVersion() {
		return this.latestVersion;
	}
	public void setLatestVersion(String latestVersion) {
		this.latestVersion = latestVersion;
	}

	public String getLatestVersionStatus() {
		return this.latestVersionStatus;
	}
	public void setLatestVersionStatus(String latestVersionStatus) {
		this.latestVersionStatus = latestVersionStatus;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getQrCodeUrl() {
		return this.qrCodeUrl;
	}
	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getTemplateVersion() {
		return this.templateVersion;
	}
	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}

}
