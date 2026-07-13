package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.yiyiyiwu.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-17 10:53:47
 */
public class AlipayOpenAppYiyiyiwuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1843629961651134459L;

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
