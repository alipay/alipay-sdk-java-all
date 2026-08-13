package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.crowd.good.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-07 14:57:48
 */
public class AlipaySecurityProdCrowdGoodCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1547413661763685124L;

	/** 
	 * 任务id
	 */
	@ApiField("good_id")
	private Long goodId;

	public void setGoodId(Long goodId) {
		this.goodId = goodId;
	}
	public Long getGoodId( ) {
		return this.goodId;
	}

}
