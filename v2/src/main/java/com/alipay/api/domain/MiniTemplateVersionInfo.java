package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序模板应用版本
 *
 * @author auto create
 * @since 1.0, 2023-05-25 15:44:04
 */
public class MiniTemplateVersionInfo extends AlipayObject {

	private static final long serialVersionUID = 3159562161789264149L;

	/**
	 * 小程序模板版本号
	 */
	@ApiField("template_version")
	private String templateVersion;

	/**
	 * 模板小程序版本状态
	 */
	@ApiField("version_status")
	private String versionStatus;

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
