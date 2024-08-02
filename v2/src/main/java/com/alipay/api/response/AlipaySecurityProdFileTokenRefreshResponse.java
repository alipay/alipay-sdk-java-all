package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RefreshWebofficeTokenResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.file.token.refresh response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-11 19:52:04
 */
public class AlipaySecurityProdFileTokenRefreshResponse extends AlipayResponse {

	private static final long serialVersionUID = 1283634531349421571L;

	/** 
	 * token刷新结果
	 */
	@ApiField("refresh_weboffice_token_response")
	private RefreshWebofficeTokenResponse refreshWebofficeTokenResponse;

	public void setRefreshWebofficeTokenResponse(RefreshWebofficeTokenResponse refreshWebofficeTokenResponse) {
		this.refreshWebofficeTokenResponse = refreshWebofficeTokenResponse;
	}
	public RefreshWebofficeTokenResponse getRefreshWebofficeTokenResponse( ) {
		return this.refreshWebofficeTokenResponse;
	}

}
