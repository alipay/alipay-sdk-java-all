package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.royalty.rate.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-14 19:39:09
 */
public class AlipayTradeRoyaltyRateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8153715817487917843L;

	/** 
	 * 最大分账比例，百分比整数，取值范围0～100
	 */
	@ApiField("max_ratio")
	private Long maxRatio;

	/** 
	 * 当前商户userId
	 */
	@ApiField("user_id")
	private String userId;

	public void setMaxRatio(Long maxRatio) {
		this.maxRatio = maxRatio;
	}
	public Long getMaxRatio( ) {
		return this.maxRatio;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
