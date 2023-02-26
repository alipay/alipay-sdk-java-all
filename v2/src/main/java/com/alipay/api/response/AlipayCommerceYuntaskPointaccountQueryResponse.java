package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.pointaccount.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 09:31:39
 */
public class AlipayCommerceYuntaskPointaccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3141118962868146319L;

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
