package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.template.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-10 11:42:58
 */
public class AlipayCommerceMerchantcardTemplateModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3845744935664734525L;

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
