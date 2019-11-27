package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.tool.capital.pool.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingToolCapitalPoolCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6273731459425135944L;

	/** 
	 * 奖金池ID
	 */
	@ApiField("pool_id")
	private String poolId;

	public void setPoolId(String poolId) {
		this.poolId = poolId;
	}
	public String getPoolId( ) {
		return this.poolId;
	}

}
