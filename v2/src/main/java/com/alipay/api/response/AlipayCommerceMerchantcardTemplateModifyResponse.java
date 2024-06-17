package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.template.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-29 15:52:03
 */
public class AlipayCommerceMerchantcardTemplateModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5677219313738112313L;

	/** 
	 * 商品ID
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
