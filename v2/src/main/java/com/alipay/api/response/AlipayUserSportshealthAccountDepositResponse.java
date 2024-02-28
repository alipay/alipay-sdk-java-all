package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.sportshealth.account.deposit response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-19 16:01:56
 */
public class AlipayUserSportshealthAccountDepositResponse extends AlipayResponse {

	private static final long serialVersionUID = 7148625733874286793L;

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
