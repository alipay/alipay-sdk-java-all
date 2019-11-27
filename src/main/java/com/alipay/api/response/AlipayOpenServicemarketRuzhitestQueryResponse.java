package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.servicemarket.ruzhitest.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenServicemarketRuzhitestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6883347763514684171L;

	/** 
	 * app是否健康
	 */
	@ApiField("health")
	private Boolean health;

	public void setHealth(Boolean health) {
		this.health = health;
	}
	public Boolean getHealth( ) {
		return this.health;
	}

}
