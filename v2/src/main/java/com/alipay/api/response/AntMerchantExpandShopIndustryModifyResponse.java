package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.shop.industry.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-19 17:42:00
 */
public class AntMerchantExpandShopIndustryModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6288253725788889669L;

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
