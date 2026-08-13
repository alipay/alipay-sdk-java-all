package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建订阅子模式
 *
 * @author auto create
 * @since 1.0, 2026-07-29 10:47:53
 */
public class AlipayTradeSubscriptionSubmodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5183982446568987825L;

	/**
	 * 客户创建接口返回的客户唯一标识
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 扣款模式：SUBSCRIBE_DEDUCT-支付宝托管扣款，MERCHANT_DEDUCT-商户主动扣款；不传默认为SUBSCRIBE_DEDUCT，试用期订阅不支持MERCHANT_DEDUCT
	 */
	@ApiField("deduct_type")
	private String deductType;

	/**
	 * null
	 */
	@ApiListField("items")
	@ApiField("subscription_submode_item")
	private List<SubscriptionSubmodeItem> items;

	/**
	 * 订阅扩展元数据，必须为JSON object字符串，且value必须为字符串
	 */
	@ApiField("metadata")
	private String metadata;

	/**
	 * 首笔支付金额，单位分；不传时按price_data.unit_amount计算，允许传0，0元时进入仅签约链路，负数不允许
	 */
	@ApiField("pay_amount")
	private Long payAmount;

	/**
	 * 试用期描述，用于签约页展示
	 */
	@ApiField("trial_desc")
	private String trialDesc;

	/**
	 * 试用期天数，取值范围3-365；若同时传price_data.recurring.trial_period_days，两者必须一致
	 */
	@ApiField("trial_period_days")
	private Long trialPeriodDays;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getDeductType() {
		return this.deductType;
	}
	public void setDeductType(String deductType) {
		this.deductType = deductType;
	}

	public List<SubscriptionSubmodeItem> getItems() {
		return this.items;
	}
	public void setItems(List<SubscriptionSubmodeItem> items) {
		this.items = items;
	}

	public String getMetadata() {
		return this.metadata;
	}
	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public Long getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public String getTrialDesc() {
		return this.trialDesc;
	}
	public void setTrialDesc(String trialDesc) {
		this.trialDesc = trialDesc;
	}

	public Long getTrialPeriodDays() {
		return this.trialPeriodDays;
	}
	public void setTrialPeriodDays(Long trialPeriodDays) {
		this.trialPeriodDays = trialPeriodDays;
	}

}
