package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.life.access.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 09:43:33
 */
public class AlipayInsMarketingLifeAccessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5415492115318215353L;

	/** 
	 * 是否准入
	 */
	@ApiField("access")
	private Boolean access;

	public void setAccess(Boolean access) {
		this.access = access;
	}
	public Boolean getAccess( ) {
		return this.access;
	}

}
