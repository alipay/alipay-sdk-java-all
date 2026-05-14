package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字分行天天减报名资格发放接口
 *
 * @author auto create
 * @since 1.0, 2026-04-17 10:01:57
 */
public class AlipayUserDtbankcustDailydiscountuserSignupModel extends AlipayObject {

	private static final long serialVersionUID = 1619597672773352156L;

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

}
