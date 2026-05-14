package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订阅创建
 *
 * @author auto create
 * @since 1.0, 2026-05-12 01:17:48
 */
public class AlipayTradeSubscriptionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7824948543786219441L;

	/**
	 * 客户id，客户创建接口（alipay.trade.customer.create）返回的客户id
	 */
	@ApiField("customer_id")
	private String customerId;

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
	 * 用于自定义展示购买时的标题，若不传，默认使用商品名称作为标题
	 */
	@ApiField("subscribe_title")
	private String subscribeTitle;

	/**
	 * 用于签约页展示，不传时系统拼装，格式："{金额}元试用{天数}天"，0元替换为"免费"
	 */
	@ApiField("trial_desc")
	private String trialDesc;

	/**
	 * 试用期天数，正整数，最大 365
	 */
	@ApiField("trial_period_days")
	private Long trialPeriodDays;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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
