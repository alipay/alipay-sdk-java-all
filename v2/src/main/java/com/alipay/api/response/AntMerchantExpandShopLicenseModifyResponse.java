package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.shop.license.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-19 17:47:00
 */
public class AntMerchantExpandShopLicenseModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6267434249699173695L;

	/** 
	 * 2018011900502000000005124744
	 */
	@ApiField("order_id")
	private String orderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
