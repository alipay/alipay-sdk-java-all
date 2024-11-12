package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 副本活动耗卡
 *
 * @author auto create
 * @since 1.0, 2024-01-02 09:38:50
 */
public class AlipayUserGameopenpromoChallengeSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 4572258325658629381L;

	/**
	 * 用户维度的参与挑战业务号，发奖会以此业务号做幂等
	 */
	@ApiField("challenge_biz_no")
	private String challengeBizNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝唯一用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getChallengeBizNo() {
		return this.challengeBizNo;
	}
	public void setChallengeBizNo(String challengeBizNo) {
		this.challengeBizNo = challengeBizNo;
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
