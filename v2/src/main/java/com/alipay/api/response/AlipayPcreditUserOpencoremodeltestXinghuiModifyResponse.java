package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.user.opencoremodeltest.xinghui.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-14 14:31:38
 */
public class AlipayPcreditUserOpencoremodeltestXinghuiModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3631748838323361674L;

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
