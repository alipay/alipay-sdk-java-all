package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 兑换请求对象
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class AdviceVO extends AlipayObject {

	private static final long serialVersionUID = 4579384177437169213L;

	/**
	 * 兑换请求发起时间
	 */
	@ApiField("client_advice_timestamp")
	private Date clientAdviceTimestamp;

	/**
	 * 客户号：用于定义FX交易的客户，由外汇交易中心统一分配
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 客户请求序号:  客户侧的流水号，由客户上送
	 */
	@ApiField("client_ref")
	private String clientRef;

	/**
	 * 对应金额，选输项
	 */
	@ApiField("contra_amount")
	private String contraAmount;

	/**
	 * 对应币种
	 */
	@ApiField("contra_ccy")
	private String contraCcy;

	/**
	 * 端对端流水号
原TransactionID，用于标识全局唯一序号
	 */
	@ApiField("end_to_end_id")
	private String endToEndId;

	/**
	 * 请求类型：H - HedgeAdvise , T - TradeAdvise。锁价模式下先发送Hedge，在发送对应的Trade。非锁价模式下，可直接发送Trade
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 是否部分成交：Y，N。是否可部分成交
默认为不可部分成交
	 */
	@ApiField("partial_trade")
	private String partialTrade;

	/**
	 * 支付渠道:  上送收单业务中的支付渠道，须提前约定。
	 */
	@ApiField("payment_provider")
	private String paymentProvider;

	/**
	 * 支付类型, 默认为DEFAULT
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 客户协议扩展号，用于支持同一客户在不同场景下所需的汇率
	 */
	@ApiField("profile_id")
	private String profileId;

	/**
	 * 汇率的唯一编码
	 */
	@ApiField("rate_ref")
	private String rateRef;

	/**
	 * 汇率请求模式 :  TA时必输，仅在TA时有效。
字典：REQ - 按客户请求(含滑点)成交，若该价格失效，则交易失败；ACP - 汇率失效或请求中不带汇率，接受该客户协议的最新汇率，实际成交汇率以GlobalFX为准；"
	 */
	@ApiField("rate_request_mode")
	private String rateRequestMode;

	/**
	 * 汇率类型：SPOT，FORWARD。送RateRef的情况下，以RateRef关联的汇率为准。
	 */
	@ApiField("rate_type")
	private String rateType;

	/**
	 * 备用字段1
	 */
	@ApiField("reference_field1")
	private String referenceField1;

	/**
	 * 备用字段2
	 */
	@ApiField("reference_field2")
	private String referenceField2;

	/**
	 * 备用字段3
	 */
	@ApiField("reference_field3")
	private String referenceField3;

	/**
	 * 关联交易请求号: "本次交易请求关联的原交易号。填写规范：
1）正向交易的TA，填写HA MessageId
2）REFUND，添加原SALE的TA MessageId
3）CHARGEBACK，填写原SALE的TA MessageId
4）CHARGEBACK_REVERSE，填写原CHARGEBACK的TA MessageId
5）CANCELLATION，填写被Cancel交易的TA MessageId"
	 */
	@ApiField("related_message_id")
	private String relatedMessageId;

	/**
	 * 交易请求号
	 */
	@ApiField("request_message_id")
	private String requestMessageId;

	/**
	 * 客户请求的汇率，送RateRef的情况下，以RateRef关联的汇率为准。
	 */
	@ApiField("requested_rate")
	private String requestedRate;

	/**
	 * NDF交割下，实际交割币种的金额
	 */
	@ApiField("settlement_amount")
	private String settlementAmount;

	/**
	 * NDF交割下，实际交割的币种
	 */
	@ApiField("settlement_ccy")
	private String settlementCcy;

	/**
	 * 买卖方向：BUY,SELL。客户视角对交易货币的操作。该字段为必填，与原TransactionType的对应关系如下：
SALE - SELL
REFUND - BUY
CHARGEBACK - BUY
CHARGEBACK_RESEVSE - SELL
CANCELLATION - 使用原交易的side"
	 */
	@ApiField("side")
	private String side;

	/**
	 * 汇率上浮滑点 : BP单位，即汇率单位的万分之一。仅在“请求汇率模式”为REQ时有效，在请求汇率/汇率编码对应的汇率的基础上，Side为BUY时上浮滑点，Side为SELL时下浮滑点
	 */
	@ApiField("slip_point")
	private Long slipPoint;

	/**
	 * 调用方事件码
	 */
	@ApiField("source_event_code")
	private String sourceEventCode;

	/**
	 * 调用方产品码
	 */
	@ApiField("source_product_code")
	private String sourceProductCode;

	/**
	 * 时间所在时区
	 */
	@ApiField("time_zone")
	private String timeZone;

	/**
	 * 上层业务发起时间
	 */
	@ApiField("trade_timestamp")
	private Date tradeTimestamp;

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
	 * 交易币种交割方式：DELIV，NDF。当Client的实际交割货币与交易币种不一致时，送NDF。
	 */
	@ApiField("transaction_ccy_type")
	private String transactionCcyType;

	/**
	 * 交易类型:   兼容收单业务兑换使用。字典：SALE，REFUND，CHARGEBACK，CHARGEBACK_REVERSE，CANCELLATION
	 */
	@ApiField("transaction_type")
	private String transactionType;

	/**
	 * 起息日期 :  YYYYMMDD，客户期望的资金交割日期
	 */
	@ApiField("value_date")
	private String valueDate;

	public Date getClientAdviceTimestamp() {
		return this.clientAdviceTimestamp;
	}
	public void setClientAdviceTimestamp(Date clientAdviceTimestamp) {
		this.clientAdviceTimestamp = clientAdviceTimestamp;
	}

	public String getClientId() {
		return this.clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientRef() {
		return this.clientRef;
	}
	public void setClientRef(String clientRef) {
		this.clientRef = clientRef;
	}

	public String getContraAmount() {
		return this.contraAmount;
	}
	public void setContraAmount(String contraAmount) {
		this.contraAmount = contraAmount;
	}

	public String getContraCcy() {
		return this.contraCcy;
	}
	public void setContraCcy(String contraCcy) {
		this.contraCcy = contraCcy;
	}

	public String getEndToEndId() {
		return this.endToEndId;
	}
	public void setEndToEndId(String endToEndId) {
		this.endToEndId = endToEndId;
	}

	public String getMsgType() {
		return this.msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getPartialTrade() {
		return this.partialTrade;
	}
	public void setPartialTrade(String partialTrade) {
		this.partialTrade = partialTrade;
	}

	public String getPaymentProvider() {
		return this.paymentProvider;
	}
	public void setPaymentProvider(String paymentProvider) {
		this.paymentProvider = paymentProvider;
	}

	public String getPaymentType() {
		return this.paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getProfileId() {
		return this.profileId;
	}
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getRateRef() {
		return this.rateRef;
	}
	public void setRateRef(String rateRef) {
		this.rateRef = rateRef;
	}

	public String getRateRequestMode() {
		return this.rateRequestMode;
	}
	public void setRateRequestMode(String rateRequestMode) {
		this.rateRequestMode = rateRequestMode;
	}

	public String getRateType() {
		return this.rateType;
	}
	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	public String getReferenceField1() {
		return this.referenceField1;
	}
	public void setReferenceField1(String referenceField1) {
		this.referenceField1 = referenceField1;
	}

	public String getReferenceField2() {
		return this.referenceField2;
	}
	public void setReferenceField2(String referenceField2) {
		this.referenceField2 = referenceField2;
	}

	public String getReferenceField3() {
		return this.referenceField3;
	}
	public void setReferenceField3(String referenceField3) {
		this.referenceField3 = referenceField3;
	}

	public String getRelatedMessageId() {
		return this.relatedMessageId;
	}
	public void setRelatedMessageId(String relatedMessageId) {
		this.relatedMessageId = relatedMessageId;
	}

	public String getRequestMessageId() {
		return this.requestMessageId;
	}
	public void setRequestMessageId(String requestMessageId) {
		this.requestMessageId = requestMessageId;
	}

	public String getRequestedRate() {
		return this.requestedRate;
	}
	public void setRequestedRate(String requestedRate) {
		this.requestedRate = requestedRate;
	}

	public String getSettlementAmount() {
		return this.settlementAmount;
	}
	public void setSettlementAmount(String settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	public String getSettlementCcy() {
		return this.settlementCcy;
	}
	public void setSettlementCcy(String settlementCcy) {
		this.settlementCcy = settlementCcy;
	}

	public String getSide() {
		return this.side;
	}
	public void setSide(String side) {
		this.side = side;
	}

	public Long getSlipPoint() {
		return this.slipPoint;
	}
	public void setSlipPoint(Long slipPoint) {
		this.slipPoint = slipPoint;
	}

	public String getSourceEventCode() {
		return this.sourceEventCode;
	}
	public void setSourceEventCode(String sourceEventCode) {
		this.sourceEventCode = sourceEventCode;
	}

	public String getSourceProductCode() {
		return this.sourceProductCode;
	}
	public void setSourceProductCode(String sourceProductCode) {
		this.sourceProductCode = sourceProductCode;
	}

	public String getTimeZone() {
		return this.timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public Date getTradeTimestamp() {
		return this.tradeTimestamp;
	}
	public void setTradeTimestamp(Date tradeTimestamp) {
		this.tradeTimestamp = tradeTimestamp;
	}

	public String getTransactionAmount() {
		return this.transactionAmount;
	}
	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionCcy() {
		return this.transactionCcy;
	}
	public void setTransactionCcy(String transactionCcy) {
		this.transactionCcy = transactionCcy;
	}

	public String getTransactionCcyType() {
		return this.transactionCcyType;
	}
	public void setTransactionCcyType(String transactionCcyType) {
		this.transactionCcyType = transactionCcyType;
	}

	public String getTransactionType() {
		return this.transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getValueDate() {
		return this.valueDate;
	}
	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

}
