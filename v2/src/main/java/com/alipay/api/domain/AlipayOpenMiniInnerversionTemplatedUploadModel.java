package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基于模板构建版本
 *
 * @author auto create
 * @since 1.0, 2021-08-09 11:28:01
 */
public class AlipayOpenMiniInnerversionTemplatedUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4334553523496857234L;

	/**
	 * 来源类型，新接入方需要向支付宝申请专用来源，否则不予接入。
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 格式为: x.y.z，其中x、y、z均为整型数字，版本不能重复构建，且新版本号必须高于旧版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 端id
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 模板的配置参数，完整内容请参见：https://docs.alipay.com/mini/isv/ortga1
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 小程序ID，特殊场景专用，普通业务方无需关注该参数。
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 模板id，模板必须已经处于上架/下架状态
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板版本，必须处于上架/下架状态。如果为空，默认取当前在架，或者最新下架的版本。
	 */
	@ApiField("template_version")
	private String templateVersion;

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

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

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
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
