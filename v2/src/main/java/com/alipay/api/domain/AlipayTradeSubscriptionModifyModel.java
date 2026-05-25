package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订阅修改
 *
 * @author auto create
 * @since 1.0, 2026-05-23 15:17:48
 */
public class AlipayTradeSubscriptionModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5333888378361935742L;

	/**
	 * 是否在周期结束时取消订阅，仅用于取消/取消后恢复订阅，其他场景无需使用。
true：在当前计费周期结束时取消订阅；
false：立即取消并发起退款；null: CANCEL场景必须传true或false；具体使用方式详见接入指南。
	 */
	@ApiField("cancel_at_period_end")
	private Boolean cancelAtPeriodEnd;

	/**
	 * 更新描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 通用扩展参数
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
	 * UPGRADE：升级，DOWNGRADE：降级，
取消：CANCEL，
取消后恢复：REVERT_CANCEL，INCREASE_QUANTITY-商品数量扩容，DECREASE_QUANTITY-商品数量缩容，如若不传则视为UPGRADE，具体使用方式详见接入指南。

	 */
	@ApiField("modify_type")
	private String modifyType;

	/**
	 * 支付金额，单位分； 仅用于商户自定义金额，若传了该值，用户实际支付金额会以该值为准，目前仅用于普通订阅升级场景，具体使用方式详见接入指南。
	 */
	@ApiField("pay_amount")
	private Long payAmount;

	/**
	 * 是否保持计费周期不变，当前仅用于升级场景
true：周期不变
false：重置周期，具体使用方式详见接入指南。
	 */
	@ApiField("preserve_billing_cycle")
	private Boolean preserveBillingCycle;

	/**
	 * null: 系统计算残值作为退款金额;
>=0: 按商家指定的金额退款，0表示直接取消不退款;
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * 订单标题
	 */
	@ApiField("subscribe_title")
	private String subscribeTitle;

	/**
	 * 订阅id
	 */
	@ApiField("subscription_id")
	private String subscriptionId;

	public Boolean getCancelAtPeriodEnd() {
		return this.cancelAtPeriodEnd;
	}
	public void setCancelAtPeriodEnd(Boolean cancelAtPeriodEnd) {
		this.cancelAtPeriodEnd = cancelAtPeriodEnd;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
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

	public String getModifyType() {
		return this.modifyType;
	}
	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
	}

	public Long getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public Boolean getPreserveBillingCycle() {
		return this.preserveBillingCycle;
	}
	public void setPreserveBillingCycle(Boolean preserveBillingCycle) {
		this.preserveBillingCycle = preserveBillingCycle;
	}

	public Long getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
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

}
