package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.bill.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 10:42:29
 */
public class KoubeiCateringOrderBillApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5752353128745656749L;

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
