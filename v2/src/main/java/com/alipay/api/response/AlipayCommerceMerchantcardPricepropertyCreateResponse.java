package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.priceproperty.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-30 21:12:25
 */
public class AlipayCommerceMerchantcardPricepropertyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1753699411145751692L;

	/** 
	 * 卡属性ID
	 */
	@ApiField("card_property_id")
	private String cardPropertyId;

	/** 
	 * 卡模版ID
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	public void setCardPropertyId(String cardPropertyId) {
		this.cardPropertyId = cardPropertyId;
	}
	public String getCardPropertyId( ) {
		return this.cardPropertyId;
	}

	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}
	public String getCardTemplateId( ) {
		return this.cardTemplateId;
	}

}
