package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序基于模板上传版本
 *
 * @author auto create
 * @since 1.0, 2019-04-15 22:59:52
 */
public class AlipayOpenMiniVersionUploadModel extends AlipayObject {

	private static final long serialVersionUID = 8512614667998755179L;

	/**
	 * 小程序版本号，版本号必须满足 x.y.z, 且均为数字
	 */
	@ApiField("app_version")
	private String appVersion;

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
	 * 模板版本号，版本号必须满足 x.y.z, 且均为数字
	 */
	@ApiField("template_version")
	private String templateVersion;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
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
