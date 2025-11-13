package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.refund response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-24 14:20:14
 */
public class AlipayFundTransRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 4476576514433637137L;

	/** 
	 * 发红包时支付宝返回的支付宝订单号order_id。
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 标识一次资金退回请求，一笔资金退回失败后重新提交，要采用原来的资金退回单号。总退款金额不能超过用户实际支付金额。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 本次退款的金额，单位为元，支持两位小数
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 退款资金退回
	 */
	@ApiField("refund_date")
	private String refundDate;

	/** 
	 * 退款的支付宝系统内部单据id
	 */
	@ApiField("refund_order_id")
	private String refundOrderId;

	/** 
	 * SUCCESS：退款成功
	 */
	@ApiField("status")
	private String status;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setRefundDate(String refundDate) {
		this.refundDate = refundDate;
	}
	public String getRefundDate( ) {
		return this.refundDate;
	}

	public void setRefundOrderId(String refundOrderId) {
		this.refundOrderId = refundOrderId;
	}
	public String getRefundOrderId( ) {
		return this.refundOrderId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
