package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.baina.prize.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-16 11:02:29
 */
public class AlipayPayAppBainaPrizeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4757814756247333895L;

	/** 
	 * 用户兑奖资格数量
	 */
	@ApiField("eligible_count")
	private Long eligibleCount;

	public void setEligibleCount(Long eligibleCount) {
		this.eligibleCount = eligibleCount;
	}
	public Long getEligibleCount( ) {
		return this.eligibleCount;
	}

}
