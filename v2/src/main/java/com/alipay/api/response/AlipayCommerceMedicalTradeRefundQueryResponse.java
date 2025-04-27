package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.trade.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-11 16:59:52
 */
public class AlipayCommerceMedicalTradeRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8114675716616372242L;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/** 
	 * 银行编码
	 */
	@ApiField("bank_id")
	private String bankId;

	/** 
	 * 银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/** 
	 * 银行订单ID
	 */
	@ApiField("bank_order_id")
	private String bankOrderId;

	/** 
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/** 
	 * 外部订单号需保证平台唯一
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 本次自费退款请求对应的退款金额，单位是元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 本次退款失败原因
	 */
	@ApiField("refund_msg")
	private String refundMsg;

	/** 
	 * 本次退款对应的退款请求流水号
	 */
	@ApiField("refund_request_no")
	private String refundRequestNo;

	/** 
	 * 自费退款状态
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/** 
	 * 退款成功时该字段有值
	 */
	@ApiField("refund_time")
	private String refundTime;

	/** 
	 * 逸康交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}
	public String getAlipayTradeNo( ) {
		return this.alipayTradeNo;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public String getBankId( ) {
		return this.bankId;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankName( ) {
		return this.bankName;
	}

	public void setBankOrderId(String bankOrderId) {
		this.bankOrderId = bankOrderId;
	}
	public String getBankOrderId( ) {
		return this.bankOrderId;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderType( ) {
		return this.orderType;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setRefundMsg(String refundMsg) {
		this.refundMsg = refundMsg;
	}
	public String getRefundMsg( ) {
		return this.refundMsg;
	}

	public void setRefundRequestNo(String refundRequestNo) {
		this.refundRequestNo = refundRequestNo;
	}
	public String getRefundRequestNo( ) {
		return this.refundRequestNo;
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

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
