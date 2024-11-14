package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.card.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:14
 */
public class AlipayUserCardTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1466191895945753342L;

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
