package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.sportshealth.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-24 15:11:50
 */
public class AlipayUserSportshealthAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1446477167294888747L;

	/** 
	 * 用户运动币账户余额
	 */
	@ApiField("balance_amount")
	private Long balanceAmount;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setBalanceAmount(Long balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public Long getBalanceAmount( ) {
		return this.balanceAmount;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
