package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.commercialization.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:53
 */
public class AlipayEcoMycarCommercializationOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 2524621436893481831L;

	/** 
	 * 退款单状态
	 */
	@ApiField("refund_status")
	private String refundStatus;

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundStatus( ) {
		return this.refundStatus;
	}

}
