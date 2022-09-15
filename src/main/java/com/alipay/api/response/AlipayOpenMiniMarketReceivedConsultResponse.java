package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.market.received.consult response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-08 10:36:44
 */
public class AlipayOpenMiniMarketReceivedConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4146773355525993878L;

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
