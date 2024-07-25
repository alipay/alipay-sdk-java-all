package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MerchantCardTemplate;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.template.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-07 05:12:02
 */
public class AlipayCommerceMerchantcardTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7764588743135259441L;

	/** 
	 * 商品信息
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
