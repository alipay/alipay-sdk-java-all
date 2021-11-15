package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.normalpay.operate.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-23 13:00:28
 */
public class MybankPaymentTradeNormalpayOperateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4823573595219632798L;

	/** 
	 * 预期交易金额，交易请求时的金额，单位:分
	 */
	@ApiField("amount")
	private String amount;

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
	 * 网商支付、退款、打款等交易的流水号
	 */
	@ApiField("operate_no")
	private String operateNo;

	/** 
	 * 操作状态，ACCEPT：已受理，PROCESSING：处理中，SUCCESS：处理成功，FAIL：处理失败
	 */
	@ApiField("operate_state")
	private String operateState;

	/** 
	 * 操作类型，PAYMENT=支付，REFUND=退款，REMITANCE=打款
	 */
	@ApiField("operate_type")
	private String operateType;

	/** 
	 * 网商订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 真实交易金额，交易达到成功或者失败时，该字段有值，单位:分
	 */
	@ApiField("real_amount")
	private String realAmount;

	/** 
	 * 请求受理时间，格式是yyyyMMddHHmmss
	 */
	@ApiField("request_accept_time")
	private String requestAcceptTime;

	/** 
	 * 请求流水号，外部平台在请求支付、退款、打款等操作时传入的流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	/** 
	 * 交易达到成功、失败的时间，格式是yyyyMMddHHmmss
	 */
	@ApiField("trans_time")
	private String transTime;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
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

	public void setOperateNo(String operateNo) {
		this.operateNo = operateNo;
	}
	public String getOperateNo( ) {
		return this.operateNo;
	}

	public void setOperateState(String operateState) {
		this.operateState = operateState;
	}
	public String getOperateState( ) {
		return this.operateState;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}
	public String getOperateType( ) {
		return this.operateType;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}
	public String getRealAmount( ) {
		return this.realAmount;
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

	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}
	public String getTransTime( ) {
		return this.transTime;
	}

}
