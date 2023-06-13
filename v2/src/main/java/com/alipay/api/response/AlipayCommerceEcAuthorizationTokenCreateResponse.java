package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenAccessTokenDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.authorization.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:41:54
 */
public class AlipayCommerceEcAuthorizationTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2527938672363686675L;

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
