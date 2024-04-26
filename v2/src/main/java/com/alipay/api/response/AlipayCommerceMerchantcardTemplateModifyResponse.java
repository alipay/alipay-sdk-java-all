package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.template.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-18 18:07:02
 */
public class AlipayCommerceMerchantcardTemplateModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1339524119753233684L;

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
