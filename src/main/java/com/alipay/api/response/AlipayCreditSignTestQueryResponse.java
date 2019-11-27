package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.credit.sign.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCreditSignTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8225887553722193844L;

	/** 
	 * fasd
	 */
	@ApiField("aga")
	private Boolean aga;

	/** 
	 * fda
	 */
	@ApiField("gamskl")
	private String gamskl;

	public void setAga(Boolean aga) {
		this.aga = aga;
	}
	public Boolean getAga( ) {
		return this.aga;
	}

	public void setGamskl(String gamskl) {
		this.gamskl = gamskl;
	}
	public String getGamskl( ) {
		return this.gamskl;
	}

}
