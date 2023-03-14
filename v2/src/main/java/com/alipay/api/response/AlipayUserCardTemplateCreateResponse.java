package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.card.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 23:06:45
 */
public class AlipayUserCardTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7562982744851656852L;

	/** 
	 * template_id：卡模版id
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
