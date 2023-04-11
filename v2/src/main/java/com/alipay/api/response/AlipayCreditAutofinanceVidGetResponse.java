package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.credit.autofinance.vid.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 00:48:08
 */
public class AlipayCreditAutofinanceVidGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7576225135187577996L;

	/** 
	 * 核身VID
	 */
	@ApiField("verifyid")
	private String verifyid;

	public void setVerifyid(String verifyid) {
		this.verifyid = verifyid;
	}
	public String getVerifyid( ) {
		return this.verifyid;
	}

}
