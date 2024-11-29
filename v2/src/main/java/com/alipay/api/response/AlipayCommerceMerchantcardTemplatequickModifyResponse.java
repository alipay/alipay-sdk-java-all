package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.templatequick.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-15 17:07:20
 */
public class AlipayCommerceMerchantcardTemplatequickModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2188728481152753124L;

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
