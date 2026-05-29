package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.educertify.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-28 10:07:49
 */
public class AlipayEbppIndustryEducertifyTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6145274879972978297L;

	/** 
	 * 学历认证票据,有效期2小时
	 */
	@ApiField("certify_token")
	private String certifyToken;

	public void setCertifyToken(String certifyToken) {
		this.certifyToken = certifyToken;
	}
	public String getCertifyToken( ) {
		return this.certifyToken;
	}

}
