package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.normalpay.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-09 11:42:56
 */
public class MybankPaymentTradeNormalpayOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7212585215994822136L;

	/** 
	 * 订单金额，单位:分
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 渠道类型，表示请求的来源，ANT_OPEN=蚂蚁开放平台
	 */
	@ApiField("biz_channel")
	private String bizChannel;

	/** 
	 * 外部平台的单据号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 币种，156=人民币
	 */
	@ApiField("currency_value")
	private String currencyValue;

	/** 
	 * 扩展参数，内容是JSON格式，并用urlconde编码
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 网商订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 订单状态，PAYED=支付成功，CLOSED=关闭，INIT=待支付，FINISH=完结(不允许发起任何交易)，FAIL=支付失败
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 订单类型，NORMAL_PAY=通用支付
	 */
	@ApiField("order_type")
	private String orderType;

	/** 
	 * 已支付金额，单位:分
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 支付时间，格式是yyyyMMddHHmmss
	 */
	@ApiField("pay_time")
	private String payTime;

	/** 
	 * 在途支付金额，表示已受理但未达到终态的金额，这部分金额，成功时转化为已支付金额，失败时归零，单位:分
	 */
	@ApiField("paying_amount")
	private String payingAmount;

	/** 
	 * 已打款金额，单位:分
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/** 
	 * 在途打款金额，表示已受理但未达到终态的金额，这部分金额，成功时转化为已打款金额，失败时归零，单位:分
	 */
	@ApiField("receipting_amount")
	private String receiptingAmount;

	/** 
	 * 已退款金额，单位:分
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 请求受理时间，格式是yyyyMMddHHmmss
	 */
	@ApiField("request_accept_time")
	private String requestAcceptTime;

	/** 
	 * 请求流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setBizChannel(String bizChannel) {
		this.bizChannel = bizChannel;
	}
	public String getBizChannel( ) {
		return this.bizChannel;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setCurrencyValue(String currencyValue) {
		this.currencyValue = currencyValue;
	}
	public String getCurrencyValue( ) {
		return this.currencyValue;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderType( ) {
		return this.orderType;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount( ) {
		return this.payAmount;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getPayTime( ) {
		return this.payTime;
	}

	public void setPayingAmount(String payingAmount) {
		this.payingAmount = payingAmount;
	}
	public String getPayingAmount( ) {
		return this.payingAmount;
	}

	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}
	public String getReceiptAmount( ) {
		return this.receiptAmount;
	}

	public void setReceiptingAmount(String receiptingAmount) {
		this.receiptingAmount = receiptingAmount;
	}
	public String getReceiptingAmount( ) {
		return this.receiptingAmount;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setRequestAcceptTime(String requestAcceptTime) {
		this.requestAcceptTime = requestAcceptTime;
	}
	public String getRequestAcceptTime( ) {
		return this.requestAcceptTime;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}
	public String getRequestNo( ) {
		return this.requestNo;
	}

}
