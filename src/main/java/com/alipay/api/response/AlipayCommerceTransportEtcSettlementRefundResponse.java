package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.settlement.refund response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-17 15:46:45
 */
public class AlipayCommerceTransportEtcSettlementRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 3415888413118626219L;

	/** 
	 * 行程单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/** 
	 * 退款外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 交易支付时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/** 
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 支付宝收单： </br>
"I","未知，原请求单号需要重试"; </br>
"RI", "退款中，原请求单号需要重试"; </br>
"R", "已退款"; </br>
"F", "退款失败";</br>
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/** 
	 * 退款完成时间
	 */
	@ApiField("refund_time")
	private Date refundTime;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

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

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public Date getPayTime( ) {
		return this.payTime;
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

	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}
	public Date getRefundTime( ) {
		return this.refundTime;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
