package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.exrate.traderequest.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 02:07:34
 */
public class AlipayAccountExrateTraderequestCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6837677857675234582L;

	/** 
	 * 成交汇率的基准币种
	 */
	@ApiField("base_ccy")
	private String baseCcy;

	/** 
	 * 原请求客户号
	 */
	@ApiField("client_id")
	private String clientId;

	/** 
	 * 对应金额
	 */
	@ApiField("contra_amount")
	private String contraAmount;

	/** 
	 * 对应币种
	 */
	@ApiField("contra_ccy")
	private String contraCcy;

	/** 
	 * FX返回关联该笔业务单据的交易号
	 */
	@ApiField("deal_ref")
	private String dealRef;

	/** 
	 * 成交汇率
	 */
	@ApiField("dealt_rate")
	private String dealtRate;

	/** 
	 * 该请求是否为重复发送。当为true时，结果码和结果描述，为该交易当前的处理情况。
	 */
	@ApiField("duplicate")
	private String duplicate;

	/** 
	 * 请求类型
字典：H - HedgeAdvise , T - TradeAdvise。
	 */
	@ApiField("msg_type")
	private String msgType;

	/** 
	 * 业务唯一单据号
	 */
	@ApiField("requested_message_id")
	private String requestedMessageId;

	/** 
	 * 汇率使用状态,字典：QUALIFY, EXCEPTION。请求汇率是否被使用，QUALIFY - 与请求汇率一致，EXCEPTION - 未使用请求汇率
	 */
	@ApiField("requested_rate_status")
	private String requestedRateStatus;

	/** 
	 * 请求返回类型，字典，同步受理返回 acknowledge：ACK ;  异步成交回执 executtion  report：EXEC
	 */
	@ApiField("response_type")
	private String responseType;

	/** 
	 * 交易方向
	 */
	@ApiField("side")
	private String side;

	/** 
	 * 交易金额
	 */
	@ApiField("transaction_amount")
	private String transactionAmount;

	/** 
	 * 交易币种
	 */
	@ApiField("transaction_ccy")
	private String transactionCcy;

	/** 
	 * 起息日
	 */
	@ApiField("value_date")
	private String valueDate;

	public void setBaseCcy(String baseCcy) {
		this.baseCcy = baseCcy;
	}
	public String getBaseCcy( ) {
		return this.baseCcy;
	}

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

	public void setDuplicate(String duplicate) {
		this.duplicate = duplicate;
	}
	public String getDuplicate( ) {
		return this.duplicate;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getMsgType( ) {
		return this.msgType;
	}

	public void setRequestedMessageId(String requestedMessageId) {
		this.requestedMessageId = requestedMessageId;
	}
	public String getRequestedMessageId( ) {
		return this.requestedMessageId;
	}

	public void setRequestedRateStatus(String requestedRateStatus) {
		this.requestedRateStatus = requestedRateStatus;
	}
	public String getRequestedRateStatus( ) {
		return this.requestedRateStatus;
	}

	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}
	public String getResponseType( ) {
		return this.responseType;
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
