package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.yiyiyiwu.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenAppYiyiyiwuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6137262426729928862L;

	/** 
	 * 12
	 */
	@ApiField("chucan")
	private String chucan;

	public void setChucan(String chucan) {
		this.chucan = chucan;
	}
	public String getChucan( ) {
		return this.chucan;
	}

}
