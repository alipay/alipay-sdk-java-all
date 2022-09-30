package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集点查询
 *
 * @author auto create
 * @since 1.0, 2022-09-28 11:41:19
 */
public class KoubeiMarketingToolPointsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5158194758857665346L;

	/**
	 * 活动积分帐户
	 */
	@ApiField("activity_account")
	private String activityAccount;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityAccount() {
		return this.activityAccount;
	}
	public void setActivityAccount(String activityAccount) {
		this.activityAccount = activityAccount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
