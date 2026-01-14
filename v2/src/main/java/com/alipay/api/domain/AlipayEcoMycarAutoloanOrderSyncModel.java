package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 非标汽车售卖订单同步
 *
 * @author auto create
 * @since 1.0, 2026-01-04 16:54:57
 */
public class AlipayEcoMycarAutoloanOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8277371111985563485L;

	/**
	 * 业务状态
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 租购订单信息
	 */
	@ApiField("leasing_order_info")
	private CarLeasingOrder leasingOrderInfo;

	/**
	 * 业务发生时间
	 */
	@ApiField("occur_time")
	private Date occurTime;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 车生活订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商家业务流水号，即商家订单多次业务变更的流水号，用于接口请求幂等
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 商家订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 来源渠道
	 */
	@ApiField("source_channel")
	private String sourceChannel;

	/**
	 * 订阅扣款信息
	 */
	@ApiField("subscription_deduction_info")
	private CarSubscriptionDeduction subscriptionDeductionInfo;

	/**
	 * 订单信息
	 */
	@ApiField("subscription_order_info")
	private CarSubscriptionOrder subscriptionOrderInfo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizStatus() {
		return this.bizStatus;
	}
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public CarLeasingOrder getLeasingOrderInfo() {
		return this.leasingOrderInfo;
	}
	public void setLeasingOrderInfo(CarLeasingOrder leasingOrderInfo) {
		this.leasingOrderInfo = leasingOrderInfo;
	}

	public Date getOccurTime() {
		return this.occurTime;
	}
	public void setOccurTime(Date occurTime) {
		this.occurTime = occurTime;
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

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getSourceChannel() {
		return this.sourceChannel;
	}
	public void setSourceChannel(String sourceChannel) {
		this.sourceChannel = sourceChannel;
	}

	public CarSubscriptionDeduction getSubscriptionDeductionInfo() {
		return this.subscriptionDeductionInfo;
	}
	public void setSubscriptionDeductionInfo(CarSubscriptionDeduction subscriptionDeductionInfo) {
		this.subscriptionDeductionInfo = subscriptionDeductionInfo;
	}

	public CarSubscriptionOrder getSubscriptionOrderInfo() {
		return this.subscriptionOrderInfo;
	}
	public void setSubscriptionOrderInfo(CarSubscriptionOrder subscriptionOrderInfo) {
		this.subscriptionOrderInfo = subscriptionOrderInfo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
