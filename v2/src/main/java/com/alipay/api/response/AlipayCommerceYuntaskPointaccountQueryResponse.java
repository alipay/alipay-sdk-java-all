package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.pointaccount.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 12:36:40
 */
public class AlipayCommerceYuntaskPointaccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3673856923713844329L;

	/** 
	 * 积分余额
	 */
	@ApiField("available_amount")
	private Long availableAmount;

	public void setAvailableAmount(Long availableAmount) {
		this.availableAmount = availableAmount;
	}
	public Long getAvailableAmount( ) {
		return this.availableAmount;
	}

}
