package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.experience.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:39:09
 */
public class AlipayInsMarketingExperienceAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4239683659518887855L;

	/** 
	 * 剩余可提现收益
	 */
	@ApiField("remaining_profit")
	private String remainingProfit;

	/** 
	 * 体验金总额
	 */
	@ApiField("total_experience_amount")
	private String totalExperienceAmount;

	public void setRemainingProfit(String remainingProfit) {
		this.remainingProfit = remainingProfit;
	}
	public String getRemainingProfit( ) {
		return this.remainingProfit;
	}

	public void setTotalExperienceAmount(String totalExperienceAmount) {
		this.totalExperienceAmount = totalExperienceAmount;
	}
	public String getTotalExperienceAmount( ) {
		return this.totalExperienceAmount;
	}

}
