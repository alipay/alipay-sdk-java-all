package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 计财账单受理请求模型
 *
 * @author auto create
 * @since 1.0, 2024-03-28 16:35:46
 */
public class ObfBillAcceptanceRequest extends AlipayObject {

	private static final long serialVersionUID = 2321833155478433733L;

	/**
	 * 分摊规则-一次性计收/按时长分摊
	 */
	@ApiField("amortization_rule")
	private String amortizationRule;

	/**
	 * 整数类型，单位分，支持负数 如-1000，122323
	 */
	@ApiField("bill_amount_cent")
	private String billAmountCent;

	/**
	 * 币种简称，如：CNY、USD
	 */
	@ApiField("bill_amount_currency_code")
	private String billAmountCurrencyCode;

	/**
	 * 订单结束时间时间戳
	 */
	@ApiField("bill_end_date")
	private String billEndDate;

	/**
	 * 业务账期
	 */
	@ApiField("bill_period")
	private String billPeriod;

	/**
	 * 订单生效时间对应时间戳
	 */
	@ApiField("bill_start_date")
	private String billStartDate;

	/**
	 * 渠道商品code
	 */
	@ApiField("channel_commodity_code")
	private String channelCommodityCode;

	/**
	 * 渠道商品名称
	 */
	@ApiField("channel_commodity_name")
	private String channelCommodityName;

	/**
	 * 多云传过来的供应商
	 */
	@ApiField("cloud_provider")
	private String cloudProvider;

	/**
	 * 用户名称，可能是公司，也可能是个人客户
	 */
	@ApiField("customer_name")
	private String customerName;

	/**
	 * 幂等键避免重复推送，由uid+orderId+来源类型组合而成
	 */
	@ApiField("idempotent_key")
	private String idempotentKey;

	/**
	 * 签约主体ou code
	 */
	@ApiField("ou_code")
	private String ouCode;

	/**
	 * 我方签约主体名称
	 */
	@ApiField("our_contract_entity")
	private String ourContractEntity;

	/**
	 * 外部订单ID
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 附加扩展信息，json串格式
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * 百分比，带小数的字符串，四舍五入截取2位
	 */
	@ApiField("settle_rate")
	private String settleRate;

	/**
	 * AWS_MP， SELF_DOMESTIC 自运营国内,
SELF_OVERSEAS 自运营海外
	 */
	@ApiField("source_type")
	private String sourceType;

	/**
	 * 来源的客户uid
	 */
	@ApiField("source_uid")
	private String sourceUid;

	/**
	 * 上下游依据业务场景约定的字符串
	 */
	@ApiField("strategy_identity")
	private String strategyIdentity;

	/**
	 * 商品税率百分比
	 */
	@ApiField("tax_rate")
	private String taxRate;

	public String getAmortizationRule() {
		return this.amortizationRule;
	}
	public void setAmortizationRule(String amortizationRule) {
		this.amortizationRule = amortizationRule;
	}

	public String getBillAmountCent() {
		return this.billAmountCent;
	}
	public void setBillAmountCent(String billAmountCent) {
		this.billAmountCent = billAmountCent;
	}

	public String getBillAmountCurrencyCode() {
		return this.billAmountCurrencyCode;
	}
	public void setBillAmountCurrencyCode(String billAmountCurrencyCode) {
		this.billAmountCurrencyCode = billAmountCurrencyCode;
	}

	public String getBillEndDate() {
		return this.billEndDate;
	}
	public void setBillEndDate(String billEndDate) {
		this.billEndDate = billEndDate;
	}

	public String getBillPeriod() {
		return this.billPeriod;
	}
	public void setBillPeriod(String billPeriod) {
		this.billPeriod = billPeriod;
	}

	public String getBillStartDate() {
		return this.billStartDate;
	}
	public void setBillStartDate(String billStartDate) {
		this.billStartDate = billStartDate;
	}

	public String getChannelCommodityCode() {
		return this.channelCommodityCode;
	}
	public void setChannelCommodityCode(String channelCommodityCode) {
		this.channelCommodityCode = channelCommodityCode;
	}

	public String getChannelCommodityName() {
		return this.channelCommodityName;
	}
	public void setChannelCommodityName(String channelCommodityName) {
		this.channelCommodityName = channelCommodityName;
	}

	public String getCloudProvider() {
		return this.cloudProvider;
	}
	public void setCloudProvider(String cloudProvider) {
		this.cloudProvider = cloudProvider;
	}

	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getIdempotentKey() {
		return this.idempotentKey;
	}
	public void setIdempotentKey(String idempotentKey) {
		this.idempotentKey = idempotentKey;
	}

	public String getOuCode() {
		return this.ouCode;
	}
	public void setOuCode(String ouCode) {
		this.ouCode = ouCode;
	}

	public String getOurContractEntity() {
		return this.ourContractEntity;
	}
	public void setOurContractEntity(String ourContractEntity) {
		this.ourContractEntity = ourContractEntity;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getSettleRate() {
		return this.settleRate;
	}
	public void setSettleRate(String settleRate) {
		this.settleRate = settleRate;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getSourceUid() {
		return this.sourceUid;
	}
	public void setSourceUid(String sourceUid) {
		this.sourceUid = sourceUid;
	}

	public String getStrategyIdentity() {
		return this.strategyIdentity;
	}
	public void setStrategyIdentity(String strategyIdentity) {
		this.strategyIdentity = strategyIdentity;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

}
