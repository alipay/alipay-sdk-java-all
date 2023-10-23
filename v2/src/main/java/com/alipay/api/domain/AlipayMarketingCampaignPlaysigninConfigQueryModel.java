package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签到配置查询
 *
 * @author auto create
 * @since 1.0, 2023-10-14 16:40:00
 */
public class AlipayMarketingCampaignPlaysigninConfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1218519555687314711L;

	/**
	 * openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 玩法ID
	 */
	@ApiField("signin_play_id")
	private String signinPlayId;

	/**
	 * 用户ID
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
