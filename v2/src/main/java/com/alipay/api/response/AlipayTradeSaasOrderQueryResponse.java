package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-03 11:57:50
 */
public class AlipayTradeSaasOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2258834971466883342L;

	/** 
	 * 买家实付金额，单位为元。
	 */
	@ApiField("buyer_pay_amount")
	private String buyerPayAmount;

	/** 
	 * SaaS交易订单号。单号已形成时返回。
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 商户订单号。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 商户创建收款单时传入的透传参数。
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/** 
	 * 实际支付渠道。尚未形成支付渠道时不返回。
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/** 
	 * 商户实收金额，单位为元。
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/** 
	 * 支付成功时间，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("send_pay_date")
	private String sendPayDate;

	/** 
	 * 订单标题。
	 */
	@ApiField("subject")
	private String subject;

	/** 
	 * 订单总金额，单位为元。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 下游支付渠道交易号。尚未形成真实渠道交易号或多渠道无法唯一表达时不返回。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 交易状态。WAIT_BUYER_PAY表示等待买家付款，TRADE_SUCCESS表示支付成功，TRADE_CLOSED表示交易关闭。
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	public void setBuyerPayAmount(String buyerPayAmount) {
		this.buyerPayAmount = buyerPayAmount;
	}
	public String getBuyerPayAmount( ) {
		return this.buyerPayAmount;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setPassbackParams(String passbackParams) {
		this.passbackParams = passbackParams;
	}
	public String getPassbackParams( ) {
		return this.passbackParams;
	}

	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}
	public String getPayChannel( ) {
		return this.payChannel;
	}

	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}
	public String getReceiptAmount( ) {
		return this.receiptAmount;
	}

	public void setSendPayDate(String sendPayDate) {
		this.sendPayDate = sendPayDate;
	}
	public String getSendPayDate( ) {
		return this.sendPayDate;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject( ) {
		return this.subject;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getTradeStatus( ) {
		return this.tradeStatus;
	}

}
