package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 非标汽车售卖模式订单信息回传
 *
 * @author auto create
 * @since 1.0, 2025-12-26 09:57:42
 */
public class AlipayEcoMycarSubscriptionOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7145733862441938161L;

	/**
	 * 业务状态
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 扣款信息
	 */
	@ApiField("deduction_info")
	private CarSubscriptionDeduction deductionInfo;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

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
	 * 车生活订单号，在首次同步订单时生成并返回
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单信息
	 */
	@ApiField("order_info")
	private CarSubscriptionOrder orderInfo;

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
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizStatus() {
		return this.bizStatus;
	}
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public CarSubscriptionDeduction getDeductionInfo() {
		return this.deductionInfo;
	}
	public void setDeductionInfo(CarSubscriptionDeduction deductionInfo) {
		this.deductionInfo = deductionInfo;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
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

	public CarSubscriptionOrder getOrderInfo() {
		return this.orderInfo;
	}
	public void setOrderInfo(CarSubscriptionOrder orderInfo) {
		this.orderInfo = orderInfo;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
