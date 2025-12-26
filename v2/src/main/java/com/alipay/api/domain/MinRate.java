package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-11-13 14:02:41
 */
public class MinRate extends AlipayObject {

	private static final long serialVersionUID = 2588774265918724812L;

	/**
	 * 支付宝酒店原始价，有效正数，单位为元，默认为人名币
	 */
	@ApiField("basis")
	private String basis;

	/**
	 * 早餐份数，有限整数，无早餐为0
	 */
	@ApiField("breakfast_meal_count")
	private String breakfastMealCount;

	/**
	 * 取消政策描述
	 */
	@ApiField("cancel_policy")
	private String cancelPolicy;

	/**
	 * 确认时长，单位分钟，立即确认为0
	 */
	@ApiField("confirm_minutes")
	private String confirmMinutes;

	/**
	 * 支付宝酒店会员价，有效正数，单位为元，默认为人名币
	 */
	@ApiField("member")
	private String member;

	/**
	 * 酒店下单方式，在线付 or 到店付
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 支付宝聚合房型id，有效正整数
	 */
	@ApiField("room_id")
	private String roomId;

	public String getBasis() {
		return this.basis;
	}
	public void setBasis(String basis) {
		this.basis = basis;
	}

	public String getBreakfastMealCount() {
		return this.breakfastMealCount;
	}
	public void setBreakfastMealCount(String breakfastMealCount) {
		this.breakfastMealCount = breakfastMealCount;
	}

	public String getCancelPolicy() {
		return this.cancelPolicy;
	}
	public void setCancelPolicy(String cancelPolicy) {
		this.cancelPolicy = cancelPolicy;
	}

	public String getConfirmMinutes() {
		return this.confirmMinutes;
	}
	public void setConfirmMinutes(String confirmMinutes) {
		this.confirmMinutes = confirmMinutes;
	}

	public String getMember() {
		return this.member;
	}
	public void setMember(String member) {
		this.member = member;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getRoomId() {
		return this.roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

}
