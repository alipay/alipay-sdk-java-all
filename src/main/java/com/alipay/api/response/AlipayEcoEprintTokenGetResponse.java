package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.eprint.token.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-06 17:56:38
 */
public class AlipayEcoEprintTokenGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3631439883342579748L;

	/** 
	 * 易联云token
	 */
	@ApiField("eprint_token")
	private String eprintToken;

	public void setEprintToken(String eprintToken) {
		this.eprintToken = eprintToken;
	}
	public String getEprintToken( ) {
		return this.eprintToken;
	}

}
