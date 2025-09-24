package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.pointbalance.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-23 15:02:19
 */
public class ZhimaCustomerPointbalanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2167415616955474715L;

	/** 
	 * 芝麻粒余额
	 */
	@ApiField("point_balance")
	private Long pointBalance;

	public void setPointBalance(Long pointBalance) {
		this.pointBalance = pointBalance;
	}
	public Long getPointBalance( ) {
		return this.pointBalance;
	}

}
