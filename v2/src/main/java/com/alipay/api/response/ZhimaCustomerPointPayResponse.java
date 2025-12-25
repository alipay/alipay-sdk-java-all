package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.point.pay response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-23 15:07:40
 */
public class ZhimaCustomerPointPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 7829572148632389487L;

	/** 
	 * 芝麻粒是否扣减完成
	 */
	@ApiField("pay_finished")
	private Boolean payFinished;

	public void setPayFinished(Boolean payFinished) {
		this.payFinished = payFinished;
	}
	public Boolean getPayFinished( ) {
		return this.payFinished;
	}

}
