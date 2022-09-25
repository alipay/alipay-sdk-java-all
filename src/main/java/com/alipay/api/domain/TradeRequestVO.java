package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外汇交易请求对象
 *
 * @author auto create
 * @since 1.0, 2018-04-13 17:35:02
 */
public class TradeRequestVO extends AlipayObject {

	private static final long serialVersionUID = 3156269481193171377L;

	/**
	 * globalnet收单机构
	 */
	@ApiField("acquirer")
	private String acquirer;

	/**
	 * 收单成员id(gn站点成员编号）
	 */
	@ApiField("acquirer_mem_id")
	private String acquirerMemId;

	/**
	 * 反洗钱处理标志
	 */
	@ApiField("aml_status")
	private String amlStatus;

	/**
	 * 业务事件码
	 */
	@ApiField("biz_ev_code")
	private String bizEvCode;

	/**
	 * 业务产品码
	 */
	@ApiField("biz_pd_code")
	private String bizPdCode;

	/**
	 * 交易请求发起时间
	 */
	@ApiField("client_advice_timestamp")
	private Date clientAdviceTimestamp;

	/**
	 * 接入平台业务订单号
	 */
	@ApiField("client_business_id")
	private String clientBusinessId;

	/**
	 * 用于定义FX交易的客户，由购结汇中心统一分配
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 接入平台唯一序列号
	 */
	@ApiField("client_message_id")
	private String clientMessageId;

	/**
	 * 客户请求序号:  客户侧的流水号，由客户上送
	 */
	@ApiField("client_ref")
	private String clientRef;

	/**
	 * 接入平台
	 */
	@ApiField("client_system")
	private String clientSystem;

	/**
	 * 端到端传递的事件代码
	 */
	@ApiField("cnl_ev_code")
	private String cnlEvCode;

	/**
	 * 端到端流水号
	 */
	@ApiField("cnl_no")
	private String cnlNo;

	/**
	 * 端到端传递的产品代码
	 */
	@ApiField("cnl_pd_code")
	private String cnlPdCode;

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
	 * 扩展字段
	 */
	@ApiField("extension")
	private String extension;

	/**
	 * 机构实体
	 */
	@ApiField("inst_entity")
	private String instEntity;

	/**
	 * 是否锁价,字典N否，Y是
	 */
	@ApiField("is_locked")
	private String isLocked;

	/**
	 * globalnet发卡机构
	 */
	@ApiField("issuer")
	private String issuer;

	/**
	 * 发卡成员id(gn站点成员编号）
	 */
	@ApiField("issuer_mem_id")
	private String issuerMemId;

	/**
	 * 商户MCC代码
	 */
	@ApiField("merchant_mcc")
	private String merchantMcc;

	/**
	 * 请求类型： T - TradeAdvise。
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 操作动作类型
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 是否可部分成交,字典：Y，N。
	 */
	@ApiField("partial_trade")
	private String partialTrade;

	/**
	 * 交易商户id
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 支付渠道
	 */
	@ApiField("payment_provider")
	private String paymentProvider;

	/**
	 * 支付类型
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 对客产品ID
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 客户协议扩展号，用于支持同一客户在不同场景下所需的汇率模式
	 */
	@ApiField("profile_id")
	private String profileId;

	/**
	 * 请求汇率基准币种
	 */
	@ApiField("rate_base_ccy")
	private String rateBaseCcy;

	/**
	 * 汇率的唯一编码
	 */
	@ApiField("rate_ref")
	private String rateRef;

	/**
	 * 汇率请求模式,字典：
REQ - 按客户请求(含滑点)成交，若该价格失效，则交易失败；
ACP - 汇率失效或请求中不带汇率，接受该客户协议的最新汇率，实际成交汇率以GlobalFX为准；
MAN- 无论如何都受理请求汇率
	 */
	@ApiField("rate_request_mode")
	private String rateRequestMode;

	/**
	 * 汇率类型，字典：SPOT，FORWARD，SWAP。
	 */
	@ApiField("rate_type")
	private String rateType;

	/**
	 * 备用字段
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
	 * 本次交易请求关联的原交易号。
	 */
	@ApiField("related_message_id")
	private String relatedMessageId;

	/**
	 * 业务唯一单据号
	 */
	@ApiField("request_message_id")
	private String requestMessageId;

	/**
	 * 请求交易汇率
	 */
	@ApiField("requested_rate")
	private String requestedRate;

	/**
	 * NDF交割下，实际交割币种的金额
	 */
	@ApiField("settlement_amount")
	private String settlementAmount;

	/**
	 * 交割币种
	 */
	@ApiField("settlement_ccy")
	private String settlementCcy;

	/**
	 * 交易方向
	 */
	@ApiField("side")
	private String side;

	/**
	 * 汇率上浮滑点 : BP单位，即汇率单位的万分之一。仅在“请求汇率模式”为REQ时有效，在请求汇率/汇率编码对应的汇率的基础上，Side为BUY时上浮滑点，Side为SELL时下浮滑点
	 */
	@ApiField("slip_point")
	private String slipPoint;

	/**
	 * 客户所在的时区，按照标准时区。
	 */
	@ApiField("time_zone")
	private String timeZone;

	/**
	 * 租户信息
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 上层业务应用发起交易时间
	 */
	@ApiField("trade_timestamp")
	private Date tradeTimestamp;

	/**
	 * 成交模式,按成交价格产生方式，起息日是否明确，交易日期是否明确，交易金额是否部分成交等维度产生的标识组合出的模式
	 */
	@ApiField("trade_type")
	private String tradeType;

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
	 * 交易币种交割方式,字典：DELIV，NDF。当Client的实际交割货币与交易币种不一致时，送NDF。
	 */
	@ApiField("transaction_ccy_type")
	private String transactionCcyType;

	/**
	 * 交易类型使用。字典：SALE，REFUND，CHARGEBACK，CHARGEBACK_REVERSE，CANCELLATION等
	 */
	@ApiField("transaction_type")
	private String transactionType;

	/**
	 * 发起交易的用户或商户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 起息日期YYYYMMDD
	 */
	@ApiField("value_date")
	private String valueDate;

	public String getAcquirer() {
		return this.acquirer;
	}
	public void setAcquirer(String acquirer) {
		this.acquirer = acquirer;
	}

	public String getAcquirerMemId() {
		return this.acquirerMemId;
	}
	public void setAcquirerMemId(String acquirerMemId) {
		this.acquirerMemId = acquirerMemId;
	}

	public String getAmlStatus() {
		return this.amlStatus;
	}
	public void setAmlStatus(String amlStatus) {
		this.amlStatus = amlStatus;
	}

	public String getBizEvCode() {
		return this.bizEvCode;
	}
	public void setBizEvCode(String bizEvCode) {
		this.bizEvCode = bizEvCode;
	}

	public String getBizPdCode() {
		return this.bizPdCode;
	}
	public void setBizPdCode(String bizPdCode) {
		this.bizPdCode = bizPdCode;
	}

	public Date getClientAdviceTimestamp() {
		return this.clientAdviceTimestamp;
	}
	public void setClientAdviceTimestamp(Date clientAdviceTimestamp) {
		this.clientAdviceTimestamp = clientAdviceTimestamp;
	}

	public String getClientBusinessId() {
		return this.clientBusinessId;
	}
	public void setClientBusinessId(String clientBusinessId) {
		this.clientBusinessId = clientBusinessId;
	}

	public String getClientId() {
		return this.clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientMessageId() {
		return this.clientMessageId;
	}
	public void setClientMessageId(String clientMessageId) {
		this.clientMessageId = clientMessageId;
	}

	public String getClientRef() {
		return this.clientRef;
	}
	public void setClientRef(String clientRef) {
		this.clientRef = clientRef;
	}

	public String getClientSystem() {
		return this.clientSystem;
	}
	public void setClientSystem(String clientSystem) {
		this.clientSystem = clientSystem;
	}

	public String getCnlEvCode() {
		return this.cnlEvCode;
	}
	public void setCnlEvCode(String cnlEvCode) {
		this.cnlEvCode = cnlEvCode;
	}

	public String getCnlNo() {
		return this.cnlNo;
	}
	public void setCnlNo(String cnlNo) {
		this.cnlNo = cnlNo;
	}

	public String getCnlPdCode() {
		return this.cnlPdCode;
	}
	public void setCnlPdCode(String cnlPdCode) {
		this.cnlPdCode = cnlPdCode;
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

	public String getExtension() {
		return this.extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getInstEntity() {
		return this.instEntity;
	}
	public void setInstEntity(String instEntity) {
		this.instEntity = instEntity;
	}

	public String getIsLocked() {
		return this.isLocked;
	}
	public void setIsLocked(String isLocked) {
		this.isLocked = isLocked;
	}

	public String getIssuer() {
		return this.issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getIssuerMemId() {
		return this.issuerMemId;
	}
	public void setIssuerMemId(String issuerMemId) {
		this.issuerMemId = issuerMemId;
	}

	public String getMerchantMcc() {
		return this.merchantMcc;
	}
	public void setMerchantMcc(String merchantMcc) {
		this.merchantMcc = merchantMcc;
	}

	public String getMsgType() {
		return this.msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getPartialTrade() {
		return this.partialTrade;
	}
	public void setPartialTrade(String partialTrade) {
		this.partialTrade = partialTrade;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
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

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProfileId() {
		return this.profileId;
	}
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getRateBaseCcy() {
		return this.rateBaseCcy;
	}
	public void setRateBaseCcy(String rateBaseCcy) {
		this.rateBaseCcy = rateBaseCcy;
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

	public String getSlipPoint() {
		return this.slipPoint;
	}
	public void setSlipPoint(String slipPoint) {
		this.slipPoint = slipPoint;
	}

	public String getTimeZone() {
		return this.timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public Date getTradeTimestamp() {
		return this.tradeTimestamp;
	}
	public void setTradeTimestamp(Date tradeTimestamp) {
		this.tradeTimestamp = tradeTimestamp;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getValueDate() {
		return this.valueDate;
	}
	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

}
