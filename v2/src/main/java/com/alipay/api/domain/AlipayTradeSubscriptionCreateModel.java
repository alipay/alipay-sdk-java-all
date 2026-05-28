package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订阅创建
 *
 * @author auto create
 * @since 1.0, 2026-05-27 19:20:48
 */
public class AlipayTradeSubscriptionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5828483542659219577L;

	/**
	 * 客户id，客户创建接口（alipay.trade.customer.create）返回的客户id
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 扩展参数，用于订阅特殊能力的传参，使用方式详见具体场景接入指南
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * null
	 */
	@ApiListField("items")
	@ApiField("subscription_item")
	private List<SubscriptionItem> items;

	/**
	 * 商户可通过此字段进行订阅信息的自定义传参，订阅生效后不可修改，将在全链路通知或查询中返回
	 */
	@ApiField("metadata")
	private String metadata;

	/**
	 * 支付金额，单位分；
仅用于商户自定义金额，若传了该值，用户实际支付金额会以该值为准
	 */
	@ApiField("pay_amount")
	private Long payAmount;

	/**
	 * 订单标题，若无特殊需求，无需使用该字段，默认使用商品名称
	 */
	@ApiField("subscribe_title")
	private String subscribeTitle;

	/**
	 * 用于签约页展示，若不传该字段，则展示默认文案。
低价试用场景文案："{pay_amount}元试用{trial_period_days}天"；免费试用场景文案："免费试用{trial_period_days}天
	 */
	@ApiField("trial_desc")
	private String trialDesc;

	/**
	 * 试用期天数：试用期天数设置为正整数，通常建议试用期天数3-7天
	 */
	@ApiField("trial_period_days")
	private Long trialPeriodDays;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public List<SubscriptionItem> getItems() {
		return this.items;
	}
	public void setItems(List<SubscriptionItem> items) {
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

	public String getSubscribeTitle() {
		return this.subscribeTitle;
	}
	public void setSubscribeTitle(String subscribeTitle) {
		this.subscribeTitle = subscribeTitle;
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
