package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.deduct.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-18 22:36:56
 */
public class AlipayMarketingActivityDeductConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4778936836769839935L;

	/** 
	 * 最优券叠加总优惠金额，单位为元
	 */
	@ApiField("optimal_total_promo_amount")
	private String optimalTotalPromoAmount;

	public void setOptimalTotalPromoAmount(String optimalTotalPromoAmount) {
		this.optimalTotalPromoAmount = optimalTotalPromoAmount;
	}
	public String getOptimalTotalPromoAmount( ) {
		return this.optimalTotalPromoAmount;
	}

}
