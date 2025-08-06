package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ebikerental.discount.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-16 09:57:23
 */
public class AlipayCommerceTransportEbikerentalDiscountPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3757355454941347439L;

	/** 
	 * 订单优惠金额，单位元
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getDiscountAmount( ) {
		return this.discountAmount;
	}

}
