package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签到玩法签到
 *
 * @author auto create
 * @since 1.0, 2023-10-14 16:37:14
 */
public class AlipayMarketingCampaignPlaysigninSigninModel extends AlipayObject {

	private static final long serialVersionUID = 7136911934478128269L;

	/**
	 * openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务单号，用作幂等控制，相同单号会返回上一次的结果，接入方需保证单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 签到玩法ID
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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
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
