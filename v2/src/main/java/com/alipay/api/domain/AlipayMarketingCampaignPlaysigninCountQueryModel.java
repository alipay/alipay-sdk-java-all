package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签到次数查询（包含连续签到次数和累积签到次数）
 *
 * @author auto create
 * @since 1.0, 2025-03-13 16:34:39
 */
public class AlipayMarketingCampaignPlaysigninCountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2629413778451766373L;

	/**
	 * openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 签到玩法ID
	 */
	@ApiField("signin_play_id")
	private String signinPlayId;

	/**
	 * 出资的支付宝用户id 限制: 1、登录账号和用户ID必须且只能二选一
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSigninPlayId() {
		return this.signinPlayId;
	}
	public void setSigninPlayId(String signinPlayId) {
		this.signinPlayId = signinPlayId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
