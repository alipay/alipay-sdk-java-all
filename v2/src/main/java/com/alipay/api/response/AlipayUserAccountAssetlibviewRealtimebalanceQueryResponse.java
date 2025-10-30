package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.assetlibview.realtimebalance.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-29 14:02:39
 */
public class AlipayUserAccountAssetlibviewRealtimebalanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4546781751187818886L;

	/** 
	 * 资金账户实时可用余额，人民币，单位元
	 */
	@ApiField("available_amount")
	private String availableAmount;

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}
	public String getAvailableAmount( ) {
		return this.availableAmount;
	}

}
