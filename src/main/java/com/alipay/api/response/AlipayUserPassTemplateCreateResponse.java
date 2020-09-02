package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.pass.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-05 10:21:21
 */
public class AlipayUserPassTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6165428163583257291L;

	/** 
	 * 支付宝模版ID
	 */
	@ApiField("template_id")
	private String templateId;

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

}
