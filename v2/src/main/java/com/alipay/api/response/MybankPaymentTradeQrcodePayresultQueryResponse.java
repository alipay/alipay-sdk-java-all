package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.qrcode.payresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:26:46
 */
public class MybankPaymentTradeQrcodePayresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1565228182522135639L;

	/** 
	 * 受理时间
	 */
	@ApiField("accept_time")
	private String acceptTime;

	/** 
	 * 关联业务单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 错误信息
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 业务完成时间
	 */
	@ApiField("finish_time")
	private String finishTime;

	/** 
	 * 操作单号
	 */
	@ApiField("operate_no")
	private String operateNo;

	/** 
	 * 操作状态
	 */
	@ApiField("operate_state")
	private String operateState;

	/** 
	 * 操作类型
	 */
	@ApiField("operate_type")
	private String operateType;

	/** 
	 * 订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/** 
	 * 付款方户名
	 */
	@ApiField("payer_card_name")
	private String payerCardName;

	/** 
	 * 付方卡号信息
	 */
	@ApiField("payer_card_no")
	private String payerCardNo;

	/** 
	 * 实际交易金额单位分
	 */
	@ApiField("real_trade_amt")
	private String realTradeAmt;

	/** 
	 * 请求流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	/** 
	 * 交易金额单位分
	 */
	@ApiField("trade_amt")
	private String tradeAmt;

	public void setAcceptTime(String acceptTime) {
		this.acceptTime = acceptTime;
	}
	public String getAcceptTime( ) {
		return this.acceptTime;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency( ) {
		return this.currency;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}
	public String getFinishTime( ) {
		return this.finishTime;
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

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderType( ) {
		return this.orderType;
	}

	public void setPayerCardName(String payerCardName) {
		this.payerCardName = payerCardName;
	}
	public String getPayerCardName( ) {
		return this.payerCardName;
	}

	public void setPayerCardNo(String payerCardNo) {
		this.payerCardNo = payerCardNo;
	}
	public String getPayerCardNo( ) {
		return this.payerCardNo;
	}

	public void setRealTradeAmt(String realTradeAmt) {
		this.realTradeAmt = realTradeAmt;
	}
	public String getRealTradeAmt( ) {
		return this.realTradeAmt;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}
	public String getRequestNo( ) {
		return this.requestNo;
	}

	public void setTradeAmt(String tradeAmt) {
		this.tradeAmt = tradeAmt;
	}
	public String getTradeAmt( ) {
		return this.tradeAmt;
	}

}
