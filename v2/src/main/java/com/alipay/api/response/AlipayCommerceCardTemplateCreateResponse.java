package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.card.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-04 15:01:53
 */
public class AlipayCommerceCardTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4852629534682865256L;

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
