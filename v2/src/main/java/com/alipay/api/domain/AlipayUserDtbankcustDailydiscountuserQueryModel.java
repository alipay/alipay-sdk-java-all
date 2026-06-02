package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字分行查询用户天天减活动参与进度
 *
 * @author auto create
 * @since 1.0, 2026-05-18 17:24:37
 */
public class AlipayUserDtbankcustDailydiscountuserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3741485369517112865L;

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
