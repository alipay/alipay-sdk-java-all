package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.shop.industry.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-02 13:48:12
 */
public class AntMerchantExpandShopIndustryModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5337384326748421251L;

	/** 
	 * 申请单ID
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
