package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiResponseHeader;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.applepay.merchantauthtoken.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:17:56
 */
public class AlipayUserApplepayMerchantauthtokenGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4316864595164966364L;

	/** 
	 * 商户授权token
	 */
	@ApiField("merchant_auth_token")
	private String merchantAuthToken;

	/** 
	 * 响应头
	 */
	@ApiField("response_header")
	private OpenApiResponseHeader responseHeader;

	public void setMerchantAuthToken(String merchantAuthToken) {
		this.merchantAuthToken = merchantAuthToken;
	}
	public String getMerchantAuthToken( ) {
		return this.merchantAuthToken;
	}

	public void setResponseHeader(OpenApiResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	public OpenApiResponseHeader getResponseHeader( ) {
		return this.responseHeader;
	}

}
