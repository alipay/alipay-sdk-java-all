package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.charger.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-10 12:02:29
 */
public class AlipayCommerceTransportChargerRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8438187961544964413L;

	/** 
	 * 退款金额。单位为元，精确到小数点后两位
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 退款状态。REFUND_SUCCESS（退款成功）、REFUNDING（退款中）、REFUND_FAIL（退款失败）
	 */
	@ApiField("refund_status")
	private String refundStatus;

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundStatus( ) {
		return this.refundStatus;
	}

}
