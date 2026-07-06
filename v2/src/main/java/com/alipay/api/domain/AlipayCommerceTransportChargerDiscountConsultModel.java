package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新能源充电立减活动咨询
 *
 * @author auto create
 * @since 1.0, 2026-04-29 14:47:45
 */
public class AlipayCommerceTransportChargerDiscountConsultModel extends AlipayObject {

	private static final long serialVersionUID = 8394884662113758951L;

	/**
	 * 活动类型
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId，与open_id二选一。
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
