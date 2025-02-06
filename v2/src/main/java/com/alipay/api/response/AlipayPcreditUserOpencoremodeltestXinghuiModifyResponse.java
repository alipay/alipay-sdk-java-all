package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.user.opencoremodeltest.xinghui.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 02:36:39
 */
public class AlipayPcreditUserOpencoremodeltestXinghuiModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2298769989123178212L;

	/** 
	 * 12
	 */
	@ApiField("c")
	private String c;

	public void setC(String c) {
		this.c = c;
	}
	public String getC( ) {
		return this.c;
	}

}
