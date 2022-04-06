package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家促活活动报名
 *
 * @author auto create
 * @since 1.0, 2021-06-25 14:01:26
 */
public class AlipayMerchantMrchsurpActivitysignupCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2386268234745961948L;

	/**
	 * 活动名称
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 用户在客户端操作的umidToken，用户安全风控的校验
	 */
	@ApiField("umid_token")
	private String umidToken;

	/**
	 * 报名活动的用户ID，蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getUmidToken() {
		return this.umidToken;
	}
	public void setUmidToken(String umidToken) {
		this.umidToken = umidToken;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
