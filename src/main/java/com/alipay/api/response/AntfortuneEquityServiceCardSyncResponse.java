package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.equity.service.card.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-01 09:59:00
 */
public class AntfortuneEquityServiceCardSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2284212367361543824L;

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
