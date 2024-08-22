package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.exrate.advice.accept response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:54:59
 */
public class AlipayAccountExrateAdviceAcceptResponse extends AlipayResponse {

	private static final long serialVersionUID = 6363492798727438244L;

	/** 
	 * 客户号：用于定义FX交易的客户，由外汇交易中心统一分配
	 */
	@ApiField("client_id")
	private String clientId;

	/** 
	 * 对应金额，选输项
	 */
	@ApiField("contra_amount")
	private String contraAmount;

	/** 
	 * 相应币种
	 */
	@ApiField("contra_ccy")
	private String contraCcy;

	/** 
	 * FX中心的处理序号
	 */
	@ApiField("deal_ref")
	private String dealRef;

	/** 
	 * 实际成交的汇率，原FXRateUsed。
	 */
	@ApiField("dealt_rate")
	private String dealtRate;

	/** 
	 * 是否重复消息
	 */
	@ApiField("duplicate")
	private Boolean duplicate;

	/** 
	 * 交易请求号
	 */
	@ApiField("messag_id")
	private String messagId;

	/** 
	 * 请求类型
字典：H - HedgeAdvise , T - TradeAdvise。锁价模式下先发送Hedge，在发送对应的Trade。非锁价模式下，可直接发送Trade
	 */
	@ApiField("msg_type")
	private String msgType;

	/** 
	 * 汇率使用状态
字典：QUALIFY, EXCEPTION。请求汇率是否被使用，QUALIFY - 与请求汇率一致，EXCEPTION - 未使用请求汇率
	 */
	@ApiField("requested_rate_status")
	private String requestedRateStatus;

	/** 
	 * 买卖方向：BUY,SELL。客户视角对交易货币的操作。该字段为必填，与原TransactionType的对应关系如下：
SALE - SELL
REFUND - BUY
CHARGEBACK - BUY
CHARGEBACK_RESEVSE - SELL
CANCELLATION - 使用原交易的side"
r1
	 */
	@ApiField("side")
	private String side;

	/** 
	 * 交易金额
	 */
	@ApiField("transaction_amount")
	private String transactionAmount;

	/** 
	 * 交易币种: 客户视角的交易买卖币种
	 */
	@ApiField("transaction_ccy")
	private String transactionCcy;

	/** 
	 * 起息日期 :  YYYYMMDD，客户期望的资金交割日期
	 */
	@ApiField("value_date")
	private String valueDate;

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientId( ) {
		return this.clientId;
	}

	public void setContraAmount(String contraAmount) {
		this.contraAmount = contraAmount;
	}
	public String getContraAmount( ) {
		return this.contraAmount;
	}

	public void setContraCcy(String contraCcy) {
		this.contraCcy = contraCcy;
	}
	public String getContraCcy( ) {
		return this.contraCcy;
	}

	public void setDealRef(String dealRef) {
		this.dealRef = dealRef;
	}
	public String getDealRef( ) {
		return this.dealRef;
	}

	public void setDealtRate(String dealtRate) {
		this.dealtRate = dealtRate;
	}
	public String getDealtRate( ) {
		return this.dealtRate;
	}

	public void setDuplicate(Boolean duplicate) {
		this.duplicate = duplicate;
	}
	public Boolean getDuplicate( ) {
		return this.duplicate;
	}

	public void setMessagId(String messagId) {
		this.messagId = messagId;
	}
	public String getMessagId( ) {
		return this.messagId;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getMsgType( ) {
		return this.msgType;
	}

	public void setRequestedRateStatus(String requestedRateStatus) {
		this.requestedRateStatus = requestedRateStatus;
	}
	public String getRequestedRateStatus( ) {
		return this.requestedRateStatus;
	}

	public void setSide(String side) {
		this.side = side;
	}
	public String getSide( ) {
		return this.side;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getTransactionAmount( ) {
		return this.transactionAmount;
	}

	public void setTransactionCcy(String transactionCcy) {
		this.transactionCcy = transactionCcy;
	}
	public String getTransactionCcy( ) {
		return this.transactionCcy;
	}

	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}
	public String getValueDate( ) {
		return this.valueDate;
	}

}
