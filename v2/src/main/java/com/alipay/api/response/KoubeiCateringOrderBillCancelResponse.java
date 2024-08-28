package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.bill.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:36:26
 */
public class KoubeiCateringOrderBillCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6479111389493623182L;

	/** 
	 * 是否需要重试
	 */
	@ApiField("retry")
	private Boolean retry;

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

}
