package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序基于模板上传版本
 *
 * @author auto create
 * @since 1.0, 2020-01-09 14:37:03
 */
public class AlipayOpenMiniVersionUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4698584561162573396L;

	/**
	 * 小程序版本号，版本号必须满足 x.y.z, 且均为数字。要求版本号比商户之前最新的版本号高。
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 小程序投放的端参数，例如投放到支付宝钱包是支付宝端。该参数可选，默认支付宝端 ，目前仅支持支付宝端，枚举列举：com.alipay.alipaywallet:支付宝端
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 模板的配置参数
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板版本号，版本号必须满足 x.y.z, 且均为数字。不传默认使用最新在架模板版本。
	 */
	@ApiField("template_version")
	private String templateVersion;

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

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
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

}
