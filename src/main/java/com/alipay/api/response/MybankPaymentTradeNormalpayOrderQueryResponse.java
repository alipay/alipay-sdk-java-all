package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.normalpay.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-02-25 19:20:05
 */
public class MybankPaymentTradeNormalpayOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7295338565293863639L;

	/** 
	 * 订单金额
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 渠道类型，表示请求的来源
	 */
	@ApiField("biz_channel")
	private String bizChannel;

	/** 
	 * 外部平台的单据号，网商订单与外部平台订单一一对应
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 币种
	 */
	@ApiField("currency_value")
	private String currencyValue;

	/** 
	 * 扩展参数，内容是JSON格式，并用urlconde编码，按场景约定具体字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 创建订单的订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/** 
	 * 已支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 在途支付金额，表示已受理但未达到终态的金额，这部分金额，成功时转化为已支付金额，失败时归零
	 */
	@ApiField("paying_amount")
	private String payingAmount;

	/** 
	 * 已打款金额
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/** 
	 * 在途打款金额，表示已受理但未达到终态的金额，这部分金额，成功时转化为已打款金额，失败时归零
	 */
	@ApiField("receipting_amount")
	private String receiptingAmount;

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
