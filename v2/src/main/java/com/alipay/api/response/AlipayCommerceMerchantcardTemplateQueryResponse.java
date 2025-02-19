package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MerchantCardTemplate;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.template.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-23 10:02:25
 */
public class AlipayCommerceMerchantcardTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4587625811268561557L;

	/** 
	 * 卡信息
	 */
	@ApiField("card_template")
	private MerchantCardTemplate cardTemplate;

	public void setCardTemplate(MerchantCardTemplate cardTemplate) {
		this.cardTemplate = cardTemplate;
	}
	public MerchantCardTemplate getCardTemplate( ) {
		return this.cardTemplate;
	}

}
