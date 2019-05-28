package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基于模板构建小程序版本
 *
 * @author auto create
 * @since 1.0, 2019-05-06 10:43:41
 */
public class AlipayOpenMiniInnerversionTemplatebasedUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5141528472235572955L;

	/**
	 * 版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 构建拓展参数
	 */
	@ApiField("build_extra_info")
	private String buildExtraInfo;

	/**
	 * 淘宝：com.taobao.app
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
	 * 端标识
	 */
	@ApiField("template_bundle_id")
	private String templateBundleId;

	/**
	 * 模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 版本号
	 */
	@ApiField("template_version")
	private String templateVersion;

	/**
	 * 模板实例化后版本的状态，当前支持实例化后的版本为初始化状态（INIT），或直接上架（RELEASE），不传默认为INIT
	 */
	@ApiField("version_status")
	private String versionStatus;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getBuildExtraInfo() {
		return this.buildExtraInfo;
	}
	public void setBuildExtraInfo(String buildExtraInfo) {
		this.buildExtraInfo = buildExtraInfo;
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

	public String getTemplateBundleId() {
		return this.templateBundleId;
	}
	public void setTemplateBundleId(String templateBundleId) {
		this.templateBundleId = templateBundleId;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateVersion() {
		return this.templateVersion;
	}
	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}

	public String getVersionStatus() {
		return this.versionStatus;
	}
	public void setVersionStatus(String versionStatus) {
		this.versionStatus = versionStatus;
	}

}
