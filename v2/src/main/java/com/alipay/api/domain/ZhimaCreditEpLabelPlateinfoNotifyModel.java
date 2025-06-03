package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步印鸽订单节点状态信息
 *
 * @author auto create
 * @since 1.0, 2024-01-08 10:18:14
 */
public class ZhimaCreditEpLabelPlateinfoNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8398735381484542112L;

	/**
	 * 下单渠道-触发推送的下单渠道-印鸽订单-商户传入
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 订单佣金-触发推送的订单佣金-印鸽订单-商户传入
	 */
	@ApiField("commission")
	private Long commission;

	/**
	 * 订单创建时间时间戳-触发推送的订单创建时间时间戳-印鸽订单-商户传入
	 */
	@ApiField("created_at")
	private String createdAt;

	/**
	 * 订单支付时间-触发推送的订单订单支付时间-印鸽订单-商户传入
	 */
	@ApiField("delivered_at")
	private String deliveredAt;

	/**
	 * 最近签收时间-触发推送的最近签收时间-印鸽订单-商户传入
	 */
	@ApiField("delivered_signed_at")
	private String deliveredSignedAt;

	/**
	 * 佣金发放时间-触发推送的佣金发放时间-印鸽订单-商户传入
	 */
	@ApiField("granted_at")
	private String grantedAt;

	/**
	 * 外部业务号 outUserId
	 */
	@ApiField("inner_biz_no")
	private String innerBizNo;

	/**
	 * 扩展信息-触发推送的扩展信息-印鸽订单-商户传入
	 */
	@ApiField("order_extends")
	private String orderExtends;

	/**
	 * 订单实付金额-触发推送的订单实付金额-印鸽订单-商户传入-单位（分）
	 */
	@ApiField("pay_amount")
	private Long payAmount;

	/**
	 * 订单支付时间-触发推送的订单订单支付时间-印鸽订单-商户传入
	 */
	@ApiField("pay_at")
	private String payAt;

	/**
	 * 邮费金额-触发推送的邮费金额-印鸽订单-商户传入 单位（分）
	 */
	@ApiField("postage_amount")
	private Long postageAmount;

	/**
	 * 商品金额-触发推送的商品金额-印鸽订单-商户传入 单位（分）
	 */
	@ApiField("product_amount")
	private Long productAmount;

	/**
	 * 退款金额-触发推送的退款金额-印鸽订单-商户传入 单位（分）
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * 最近退款时间-触发推送的最近退款时间-印鸽订单-商户传入
	 */
	@ApiField("refund_at")
	private String refundAt;

	/**
	 * 订单状态-触发推送的订单状态-印鸽订单-商户传入
	 */
	@ApiField("status")
	private String status;

	/**
	 * 节点标识-触发推送的节点标识-印鸽订单-商户传入
	 */
	@ApiField("trigger_event_flag")
	private Long triggerEventFlag;

	/**
	 * 外部订单号-触发推送的具体订单号-印鸽订单-商户传入
	 */
	@ApiField("trigger_order_sn")
	private String triggerOrderSn;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Long getCommission() {
		return this.commission;
	}
	public void setCommission(Long commission) {
		this.commission = commission;
	}

	public String getCreatedAt() {
		return this.createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getDeliveredAt() {
		return this.deliveredAt;
	}
	public void setDeliveredAt(String deliveredAt) {
		this.deliveredAt = deliveredAt;
	}

	public String getDeliveredSignedAt() {
		return this.deliveredSignedAt;
	}
	public void setDeliveredSignedAt(String deliveredSignedAt) {
		this.deliveredSignedAt = deliveredSignedAt;
	}

	public String getGrantedAt() {
		return this.grantedAt;
	}
	public void setGrantedAt(String grantedAt) {
		this.grantedAt = grantedAt;
	}

	public String getInnerBizNo() {
		return this.innerBizNo;
	}
	public void setInnerBizNo(String innerBizNo) {
		this.innerBizNo = innerBizNo;
	}

	public String getOrderExtends() {
		return this.orderExtends;
	}
	public void setOrderExtends(String orderExtends) {
		this.orderExtends = orderExtends;
	}

	public Long getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayAt() {
		return this.payAt;
	}
	public void setPayAt(String payAt) {
		this.payAt = payAt;
	}

	public Long getPostageAmount() {
		return this.postageAmount;
	}
	public void setPostageAmount(Long postageAmount) {
		this.postageAmount = postageAmount;
	}

	public Long getProductAmount() {
		return this.productAmount;
	}
	public void setProductAmount(Long productAmount) {
		this.productAmount = productAmount;
	}

	public Long getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundAt() {
		return this.refundAt;
	}
	public void setRefundAt(String refundAt) {
		this.refundAt = refundAt;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTriggerEventFlag() {
		return this.triggerEventFlag;
	}
	public void setTriggerEventFlag(Long triggerEventFlag) {
		this.triggerEventFlag = triggerEventFlag;
	}

	public String getTriggerOrderSn() {
		return this.triggerOrderSn;
	}
	public void setTriggerOrderSn(String triggerOrderSn) {
		this.triggerOrderSn = triggerOrderSn;
	}

}
