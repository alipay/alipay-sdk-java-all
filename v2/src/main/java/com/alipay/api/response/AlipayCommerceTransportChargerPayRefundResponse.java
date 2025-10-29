package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.charger.pay.refund response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-25 19:37:28
 */
public class AlipayCommerceTransportChargerPayRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 6141689236655944397L;

	/** 
	 * 行业退款业务流水号
	 */
	@ApiField("refund_id")
	private String refundId;

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}
	public String getRefundId( ) {
		return this.refundId;
	}

}
