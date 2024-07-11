package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenAccessCodeDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.authorization.code.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-31 09:40:38
 */
public class AlipayCommerceEcAuthorizationCodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4723196657739547459L;

	/** 
	 * 授权码authCode信息
	 */
	@ApiField("open_access_code_dto")
	private OpenAccessCodeDTO openAccessCodeDto;

	public void setOpenAccessCodeDto(OpenAccessCodeDTO openAccessCodeDto) {
		this.openAccessCodeDto = openAccessCodeDto;
	}
	public OpenAccessCodeDTO getOpenAccessCodeDto( ) {
		return this.openAccessCodeDto;
	}

}
