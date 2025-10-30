package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板预览对象
 *
 * @author auto create
 * @since 1.0, 2023-05-08 14:53:22
 */
public class TemplatePreviewResponse extends AlipayObject {

	private static final long serialVersionUID = 7633715789593778541L;

	/**
	 * 模板预览地址
	 */
	@ApiField("preview_url")
	private String previewUrl;

	/**
	 * 模板编码
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 模板名称
	 */
	@ApiField("template_name")
	private String templateName;

	public String getPreviewUrl() {
		return this.previewUrl;
	}
	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
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

}
