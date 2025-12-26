package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.multimedia.test.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-14 11:17:40
 */
public class AlipayMultimediaTestCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3164824222285311152L;

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
