package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.priceproperty.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-13 12:37:06
 */
public class AlipayCommerceMerchantcardPricepropertyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5565527161492581463L;

	/** 
	 * 卡属性ID
	 */
	@ApiField("card_property_id")
	private String cardPropertyId;

	public void setCardPropertyId(String cardPropertyId) {
		this.cardPropertyId = cardPropertyId;
	}
	public String getCardPropertyId( ) {
		return this.cardPropertyId;
	}

}
