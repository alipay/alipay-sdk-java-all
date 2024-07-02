package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenAccessTokenDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.authorization.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-31 09:40:27
 */
public class AlipayCommerceEcAuthorizationTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7592227654424148988L;

	/** 
	 * 授权令牌信息
	 */
	@ApiField("open_access_token_dto")
	private OpenAccessTokenDTO openAccessTokenDto;

	public void setOpenAccessTokenDto(OpenAccessTokenDTO openAccessTokenDto) {
		this.openAccessTokenDto = openAccessTokenDto;
	}
	public OpenAccessTokenDTO getOpenAccessTokenDto( ) {
		return this.openAccessTokenDto;
	}

}
