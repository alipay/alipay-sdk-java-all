package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 铁路优惠活动实时标签介入
 *
 * @author auto create
 * @since 1.0, 2026-07-06 17:57:58
 */
public class AlipayCommerceTransportRailwayMarketuvSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2176197122363757254L;

	/**
	 * 支付宝活动 ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 订单金额，单位：分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝侧订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部商户订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 第三方请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
