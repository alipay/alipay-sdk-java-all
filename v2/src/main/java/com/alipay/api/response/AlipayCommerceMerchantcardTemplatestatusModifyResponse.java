package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.templatestatus.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-29 11:17:30
 */
public class AlipayCommerceMerchantcardTemplatestatusModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8696444868596748662L;

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
