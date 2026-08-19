package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改订阅子模式
 *
 * @author auto create
 * @since 1.0, 2026-07-29 10:42:49
 */
public class AlipayTradeSubscriptionSubmodeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7167182752716776328L;

	/**
	 * 是否在周期结束时取消，仅用于取消/取消后恢复订阅：CANCEL传true表示周期末取消，传false表示立即取消并发起退款；REVERT_CANCEL需传false
	 */
	@ApiField("cancel_at_period_end")
	private Boolean cancelAtPeriodEnd;

	/**
	 * 客户创建接口返回的客户唯一标识
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 更新描述，若无特殊需求无需使用
	 */
	@ApiField("description")
	private String description;

	/**
	 * 扩展参数，用于订阅特殊能力的传参，使用方式详见具体场景接入指南
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * null
	 */
	@ApiListField("items")
	@ApiField("subscription_submode_item")
	private List<SubscriptionSubmodeItem> items;

	/**
	 * UPGRADE-升级，DOWNGRADE-降级，CANCEL-取消，REVERT_CANCEL-取消后恢复；不传视为UPGRADE。Submode不支持INCREASE_QUANTITY/DECREASE_QUANTITY，容量变化请提交完整价格商品对象并使用UPGRADE/DOWNGRADE
	 */
	@ApiField("modify_type")
	private String modifyType;

	/**
	 * 升级自定义支付金额，单位分；仅UPGRADE场景有效，不传时按price_data.unit_amount计算差价，传入时不能小于0，与coupon_id互斥
	 */
	@ApiField("pay_amount")
	private Long payAmount;

	/**
	 * 是否保持计费周期不变，当前仅用于升级场景：true-周期不变，false-重置周期
	 */
	@ApiField("preserve_billing_cycle")
	private Boolean preserveBillingCycle;

	/**
	 * 自定义退款金额，单位分；仅CANCEL立即取消(cancel_at_period_end=false)场景可传，不传时系统按时间规则计算残值，传入0表示直接取消不退款
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * 订单标题，若无特殊需求无需使用，默认使用商品名称
	 */
	@ApiField("subscribe_title")
	private String subscribeTitle;

	/**
	 * 订阅ID，订阅唯一标识
	 */
	@ApiField("subscription_id")
	private String subscriptionId;

	public Boolean getCancelAtPeriodEnd() {
		return this.cancelAtPeriodEnd;
	}
	public void setCancelAtPeriodEnd(Boolean cancelAtPeriodEnd) {
		this.cancelAtPeriodEnd = cancelAtPeriodEnd;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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

	public List<SubscriptionSubmodeItem> getItems() {
		return this.items;
	}
	public void setItems(List<SubscriptionSubmodeItem> items) {
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
