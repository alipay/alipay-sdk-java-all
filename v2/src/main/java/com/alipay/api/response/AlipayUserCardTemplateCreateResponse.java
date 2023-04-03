package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.card.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 11:31:47
 */
public class AlipayUserCardTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2384446422546787777L;

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
