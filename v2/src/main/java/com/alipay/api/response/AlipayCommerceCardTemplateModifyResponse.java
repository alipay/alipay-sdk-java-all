package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.card.template.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-28 13:49:16
 */
public class AlipayCommerceCardTemplateModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3643589975259319931L;

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
