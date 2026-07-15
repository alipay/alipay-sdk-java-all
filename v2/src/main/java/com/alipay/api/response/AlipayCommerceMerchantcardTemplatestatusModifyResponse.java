package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.templatestatus.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-13 15:42:43
 */
public class AlipayCommerceMerchantcardTemplatestatusModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4621972983596944752L;

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
