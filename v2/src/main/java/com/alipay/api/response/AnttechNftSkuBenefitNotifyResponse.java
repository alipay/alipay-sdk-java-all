package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.sku.benefit.notify response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-03 17:02:44
 */
public class AnttechNftSkuBenefitNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1562123442481985186L;

	/** 
	 * 已处理
	 */
	@ApiField("state")
	private Boolean state;

	public void setState(Boolean state) {
		this.state = state;
	}
	public Boolean getState( ) {
		return this.state;
	}

}
