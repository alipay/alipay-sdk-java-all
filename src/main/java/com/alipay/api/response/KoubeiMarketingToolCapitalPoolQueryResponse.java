package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CapitalPoolInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.tool.capital.pool.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingToolCapitalPoolQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7232232751973616695L;

	/** 
	 * 奖金池列表
	 */
	@ApiField("capital_pools")
	private CapitalPoolInfo capitalPools;

	public void setCapitalPools(CapitalPoolInfo capitalPools) {
		this.capitalPools = capitalPools;
	}
	public CapitalPoolInfo getCapitalPools( ) {
		return this.capitalPools;
	}

}
