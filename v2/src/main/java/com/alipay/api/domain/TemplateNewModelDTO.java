package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板对象
 *
 * @author auto create
 * @since 1.0, 2023-05-08 15:37:48
 */
public class TemplateNewModelDTO extends AlipayObject {

	private static final long serialVersionUID = 2813544157465637668L;

	/**
	 * 描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 模板状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 模板编码code
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 模板名称
	 */
	@ApiField("template_name")
	private String templateName;

	/**
	 * 版本
	 */
	@ApiField("version_no")
	private String versionNo;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getVersionNo() {
		return this.versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

}
