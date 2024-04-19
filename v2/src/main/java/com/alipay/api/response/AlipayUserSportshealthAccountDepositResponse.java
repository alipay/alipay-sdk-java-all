package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.sportshealth.account.deposit response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-28 00:46:59
 */
public class AlipayUserSportshealthAccountDepositResponse extends AlipayResponse {

	private static final long serialVersionUID = 7846111943891873953L;

	/** 
	 * 账户实际发放运动币数量
	 */
	@ApiField("award_amount")
	private Long awardAmount;

	public void setAwardAmount(Long awardAmount) {
		this.awardAmount = awardAmount;
	}
	public Long getAwardAmount( ) {
		return this.awardAmount;
	}

}
