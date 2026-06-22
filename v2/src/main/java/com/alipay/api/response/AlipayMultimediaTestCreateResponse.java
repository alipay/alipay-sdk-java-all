package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.multimedia.test.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-17 10:54:00
 */
public class AlipayMultimediaTestCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3419997998365429816L;

	/** 
	 * 基础参数
	 */
	@ApiField("tc_case")
	private String tcCase;

	public void setTcCase(String tcCase) {
		this.tcCase = tcCase;
	}
	public String getTcCase( ) {
		return this.tcCase;
	}

}
