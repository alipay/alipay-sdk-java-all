package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.tour.voucher.refund response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-09 15:27:04
 */
public class AlipayCommerceTransportTourVoucherRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 5852867864445469238L;

	/** 
	 * 外部退款请求流水号
	 */
	@ApiField("out_refund_id")
	private String outRefundId;

	/** 
	 * 退款金额：本次商户实际退回金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	public void setOutRefundId(String outRefundId) {
		this.outRefundId = outRefundId;
	}
	public String getOutRefundId( ) {
		return this.outRefundId;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

}
