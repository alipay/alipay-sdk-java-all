package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-24 20:46:41
 */
public class AlipayCommerceTransportEtcRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4671235394243146786L;

	/** 
	 * 商户侧唯一的行程号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/** 
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 退款状态：
"I","未知，原请求单号需要重试"; 
"RI", "退款中，原请求单号需要重试"; 
"R", "已退款"; 
"PR", "部分退款";
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/** 
	 * 退款完成时间
	 */
	@ApiField("refund_time")
	private String refundTime;

	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}
	public String getOutOrderId( ) {
		return this.outOrderId;
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

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundStatus( ) {
		return this.refundStatus;
	}

	public void setRefundTime(String refundTime) {
		this.refundTime = refundTime;
	}
	public String getRefundTime( ) {
		return this.refundTime;
	}

}
