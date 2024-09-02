package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.templatequick.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-29 19:02:09
 */
public class AlipayCommerceMerchantcardTemplatequickModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6142337359138995513L;

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
