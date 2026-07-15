package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.balance.alert.check response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-08 14:27:44
 */
public class AlipayCommerceEcBalanceAlertCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 5835619821479789761L;

	/** 
	 * 余额是否充足（true: 充足, false: 不充足）
	 */
	@ApiField("sufficient")
	private Boolean sufficient;

	public void setSufficient(Boolean sufficient) {
		this.sufficient = sufficient;
	}
	public Boolean getSufficient( ) {
		return this.sufficient;
	}

}
