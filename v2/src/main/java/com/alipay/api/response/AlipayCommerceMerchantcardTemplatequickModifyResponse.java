package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.templatequick.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-16 10:37:20
 */
public class AlipayCommerceMerchantcardTemplatequickModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5857246287572932935L;

	/** 
	 * 卡ID
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
