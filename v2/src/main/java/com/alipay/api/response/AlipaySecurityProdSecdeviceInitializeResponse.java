package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.secdevice.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-21 11:27:46
 */
public class AlipaySecurityProdSecdeviceInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 7874488365159816415L;

	/** 
	 * 验证令牌
	 */
	@ApiField("ifaa_token")
	private String ifaaToken;

	/** 
	 * 响应结果
	 */
	@ApiField("server_response")
	private String serverResponse;

	public void setIfaaToken(String ifaaToken) {
		this.ifaaToken = ifaaToken;
	}
	public String getIfaaToken( ) {
		return this.ifaaToken;
	}

	public void setServerResponse(String serverResponse) {
		this.serverResponse = serverResponse;
	}
	public String getServerResponse( ) {
		return this.serverResponse;
	}

}
