package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.templatestatus.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-02 09:32:05
 */
public class AlipayCommerceMerchantcardTemplatestatusModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6378966498477956614L;

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
