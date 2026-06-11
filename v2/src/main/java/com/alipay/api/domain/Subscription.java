package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-08 21:57:53
 */
public class Subscription extends AlipayObject {

	private static final long serialVersionUID = 2877274178726641782L;

	/**
	 * true - 周期结束状态生效
false - 周期结束依旧生效
	 */
	@ApiField("cancel_at_period_end")
	private Boolean cancelAtPeriodEnd;

	/**
	 * 订阅取消时间
	 */
	@ApiField("canceled_date")
	private String canceledDate;

	/**
	 * 创建时间
	 */
	@ApiField("created")
	private String created;

	/**
	 * 最近一个扣款周期结束时间
	 */
	@ApiField("current_period_end")
	private String currentPeriodEnd;

	/**
	 * 最近一个扣款周期开始时间
	 */
	@ApiField("current_period_start")
	private String currentPeriodStart;

	/**
	 * 支付宝客户id
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 有限枚举，托管扣款类型。1.SUBSCRIBE_DEDUCT：托管模式（支付宝自动扣款，默认）；2.MERCHANT_DEDUCT：非托管模式（商户自助扣款）
	 */
	@ApiField("deduct_type")
	private String deductType;

	/**
	 * null
	 */
	@ApiListField("items")
	@ApiField("subscription_query_item")
	private List<SubscriptionQueryItem> items;

	/**
	 * 订阅元数据，订阅创建时传入
	 */
	@ApiField("metadata")
	private String metadata;

	/**
	 * null
	 */
	@ApiListField("pending_items")
	@ApiField("subscription_query_pending_item")
	private List<SubscriptionQueryPendingItem> pendingItems;

	/**
	 * 订阅开始日期
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 订阅标题
	 */
	@ApiField("subscribe_title")
	private String subscribeTitle;

	/**
	 * 订阅id
	 */
	@ApiField("subscription_id")
	private String subscriptionId;

	/**
	 * 订阅状态，例如INCOMPLETE（未完成），ACTIVE（活跃），INCOMPLETE_EXPIRED（未完成已过期），CANCELED（已取消）等
	 */
	@ApiField("subscription_status")
	private String subscriptionStatus;

	/**
	 * 试用期结束时间
	 */
	@ApiField("trial_end")
	private String trialEnd;

	/**
	 * 试用期开始时间
	 */
	@ApiField("trial_start")
	private String trialStart;

	public Boolean getCancelAtPeriodEnd() {
		return this.cancelAtPeriodEnd;
	}
	public void setCancelAtPeriodEnd(Boolean cancelAtPeriodEnd) {
		this.cancelAtPeriodEnd = cancelAtPeriodEnd;
	}

	public String getCanceledDate() {
		return this.canceledDate;
	}
	public void setCanceledDate(String canceledDate) {
		this.canceledDate = canceledDate;
	}

	public String getCreated() {
		return this.created;
	}
	public void setCreated(String created) {
		this.created = created;
	}

	public String getCurrentPeriodEnd() {
		return this.currentPeriodEnd;
	}
	public void setCurrentPeriodEnd(String currentPeriodEnd) {
		this.currentPeriodEnd = currentPeriodEnd;
	}

	public String getCurrentPeriodStart() {
		return this.currentPeriodStart;
	}
	public void setCurrentPeriodStart(String currentPeriodStart) {
		this.currentPeriodStart = currentPeriodStart;
	}

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

	public List<SubscriptionQueryItem> getItems() {
		return this.items;
	}
	public void setItems(List<SubscriptionQueryItem> items) {
		this.items = items;
	}

	public String getMetadata() {
		return this.metadata;
	}
	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public List<SubscriptionQueryPendingItem> getPendingItems() {
		return this.pendingItems;
	}
	public void setPendingItems(List<SubscriptionQueryPendingItem> pendingItems) {
		this.pendingItems = pendingItems;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getSubscribeTitle() {
		return this.subscribeTitle;
	}
	public void setSubscribeTitle(String subscribeTitle) {
		this.subscribeTitle = subscribeTitle;
	}

	public String getSubscriptionId() {
		return this.subscriptionId;
	}
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getSubscriptionStatus() {
		return this.subscriptionStatus;
	}
	public void setSubscriptionStatus(String subscriptionStatus) {
		this.subscriptionStatus = subscriptionStatus;
	}

	public String getTrialEnd() {
		return this.trialEnd;
	}
	public void setTrialEnd(String trialEnd) {
		this.trialEnd = trialEnd;
	}

	public String getTrialStart() {
		return this.trialStart;
	}
	public void setTrialStart(String trialStart) {
		this.trialStart = trialStart;
	}

}
