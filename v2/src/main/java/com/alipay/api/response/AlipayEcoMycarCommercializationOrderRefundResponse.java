package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.commercialization.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 17:11:42
 */
public class AlipayEcoMycarCommercializationOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 5449971718473471625L;

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
