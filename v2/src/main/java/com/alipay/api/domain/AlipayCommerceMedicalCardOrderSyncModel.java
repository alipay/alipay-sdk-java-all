package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员开卡订单同步
 *
 * @author auto create
 * @since 1.0, 2026-04-20 16:57:45
 */
public class AlipayCommerceMedicalCardOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7129717517591234181L;

	/**
	 * 实际激活的时间
	 */
	@ApiField("activation_time")
	private String activationTime;

	/**
	 * 开卡/退卡的时间
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 业务类型开卡和激活时传open，退（卡）款时传refund
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 所开会员卡ID，取开卡时id
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 固定枚举值，荣耀-HONOR,小米-XIAOMI,OPPO-OPPO
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 客户系统中的用户id,每个用户唯一,由客户系统生成并传入
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 客户订单流水号，值唯一，由客户系统生成并传入
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 客户系统下单时间
	 */
	@ApiField("order_time")
	private String orderTime;

	/**
	 * 非必传，但是手机号和UID必须二选一，在客户系统汇总，用户下单开通对应服务的手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 商家pid,商家侧传入2088格式
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 非必传，但是手机号和UID必须二选一，用户在支付宝侧的UID账号（UID必须存在）
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * 用户user_id，唯一映射用户uid，用于唯一标识用户
	 */
	@ApiField("user_open_id")
	private String userOpenId;

	public String getActivationTime() {
		return this.activationTime;
	}
	public void setActivationTime(String activationTime) {
		this.activationTime = activationTime;
	}

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUserOpenId() {
		return this.userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}

}
