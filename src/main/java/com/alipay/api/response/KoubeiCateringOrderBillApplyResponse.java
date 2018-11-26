package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.bill.apply response.
 * 
 * @author auto create
 * @since 1.0, 2018-05-28 13:30:38
 */
public class KoubeiCateringOrderBillApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3824789971225138986L;

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
