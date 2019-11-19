package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.equity.service.card.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-28 20:33:29
 */
public class AntfortuneEquityServiceCardSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3673698329616494168L;

	/** 
	 * 是否同步成功
	 */
	@ApiField("syn_result")
	private Boolean synResult;

	public void setSynResult(Boolean synResult) {
		this.synResult = synResult;
	}
	public Boolean getSynResult( ) {
		return this.synResult;
	}

}
