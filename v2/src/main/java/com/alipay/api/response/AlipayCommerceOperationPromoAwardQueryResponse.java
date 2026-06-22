package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promo.award.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-17 14:45:51
 */
public class AlipayCommerceOperationPromoAwardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4172147381228195441L;

	/** 
	 * 激励金额，单位：分
	 */
	@ApiField("award_amount")
	private Long awardAmount;

	/** 
	 * 报名记录id
	 */
	@ApiField("sign_up_id")
	private String signUpId;

	/** 
	 * 交易笔数
	 */
	@ApiField("trade_count")
	private Long tradeCount;

	public void setAwardAmount(Long awardAmount) {
		this.awardAmount = awardAmount;
	}
	public Long getAwardAmount( ) {
		return this.awardAmount;
	}

	public void setSignUpId(String signUpId) {
		this.signUpId = signUpId;
	}
	public String getSignUpId( ) {
		return this.signUpId;
	}

	public void setTradeCount(Long tradeCount) {
		this.tradeCount = tradeCount;
	}
	public Long getTradeCount( ) {
		return this.tradeCount;
	}

}
