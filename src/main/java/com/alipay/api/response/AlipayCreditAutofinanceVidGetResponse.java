package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.credit.autofinance.vid.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-05-10 09:44:36
 */
public class AlipayCreditAutofinanceVidGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2656558712916615729L;

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
