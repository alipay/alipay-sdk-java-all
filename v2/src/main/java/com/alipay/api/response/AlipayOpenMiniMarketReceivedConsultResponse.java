package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.market.received.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:35
 */
public class AlipayOpenMiniMarketReceivedConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6765277841773349977L;

	/** 
	 * true为已经领过券，false为未领取
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
