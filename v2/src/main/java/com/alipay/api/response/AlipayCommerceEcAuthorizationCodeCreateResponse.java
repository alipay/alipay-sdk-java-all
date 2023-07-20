package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenAccessCodeDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.authorization.code.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 06:11:52
 */
public class AlipayCommerceEcAuthorizationCodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7641392995322466443L;

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
