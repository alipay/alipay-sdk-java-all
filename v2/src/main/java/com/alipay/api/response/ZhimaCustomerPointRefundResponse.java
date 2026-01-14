package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.point.refund response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-24 17:17:40
 */
public class ZhimaCustomerPointRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 6116472579673748841L;

	/** 
	 * 芝麻粒是否返还完成
	 */
	@ApiField("refund_finished")
	private Boolean refundFinished;

	public void setRefundFinished(Boolean refundFinished) {
		this.refundFinished = refundFinished;
	}
	public Boolean getRefundFinished( ) {
		return this.refundFinished;
	}

}
