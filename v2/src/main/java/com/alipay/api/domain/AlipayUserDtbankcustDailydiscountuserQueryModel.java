package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字分行查询用户天天减活动参与进度
 *
 * @author auto create
 * @since 1.0, 2026-08-06 14:25:48
 */
public class AlipayUserDtbankcustDailydiscountuserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6277987157279171874L;

	/**
	 * 用户在支付宝实名认证过的支付宝账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 天天减活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 指定主体appId
	 */
	@ApiField("daily_discount_app_id_specify")
	private String dailyDiscountAppIdSpecify;

	/**
	 * 用户在指定主体的openId
	 */
	@ApiField("daily_discount_open_id_specify")
	private String dailyDiscountOpenIdSpecify;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getDailyDiscountAppIdSpecify() {
		return this.dailyDiscountAppIdSpecify;
	}
	public void setDailyDiscountAppIdSpecify(String dailyDiscountAppIdSpecify) {
		this.dailyDiscountAppIdSpecify = dailyDiscountAppIdSpecify;
	}

	public String getDailyDiscountOpenIdSpecify() {
		return this.dailyDiscountOpenIdSpecify;
	}
	public void setDailyDiscountOpenIdSpecify(String dailyDiscountOpenIdSpecify) {
		this.dailyDiscountOpenIdSpecify = dailyDiscountOpenIdSpecify;
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
