package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.card.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-28 09:49:29
 */
public class AlipayCommerceCardTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3174471898866187651L;

	/** 
	 * 卡模版ID
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}
	public String getCardTemplateId( ) {
		return this.cardTemplateId;
	}

}
