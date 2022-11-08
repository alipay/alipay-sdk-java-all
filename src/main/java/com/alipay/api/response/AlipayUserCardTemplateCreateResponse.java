package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.card.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-04 10:36:32
 */
public class AlipayUserCardTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4493713979644134779L;

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
