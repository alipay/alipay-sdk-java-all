package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.veh.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:16:47
 */
public class AlipayCommerceTransportVehOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 5261681995281832893L;

	/** 
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 分润金额
	 */
	@ApiField("refund_applets_service_amount")
	private String refundAppletsServiceAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setRefundAppletsServiceAmount(String refundAppletsServiceAmount) {
		this.refundAppletsServiceAmount = refundAppletsServiceAmount;
	}
	public String getRefundAppletsServiceAmount( ) {
		return this.refundAppletsServiceAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
