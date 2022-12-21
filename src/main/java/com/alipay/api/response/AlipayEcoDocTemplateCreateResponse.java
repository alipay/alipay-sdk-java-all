package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.doc.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 19:04:25
 */
public class AlipayEcoDocTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1392794714247711632L;

	/** 
	 * 模板id（请记录模板ID（templateId），后续发起合同签署需要使用到）
	 */
	@ApiField("template_id")
	private String templateId;

	/** 
	 * 文件直传地址，需要用此上传地址使用PUT方式上传文件，只有文件上传后模板才可用
	 */
	@ApiField("upload_url")
	private String uploadUrl;

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

	public void setUploadUrl(String uploadUrl) {
		this.uploadUrl = uploadUrl;
	}
	public String getUploadUrl( ) {
		return this.uploadUrl;
	}

}
