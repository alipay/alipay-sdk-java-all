package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiResponseHeader;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.applepay.provisioningbundle.effect response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:14
 */
public class AlipayUserApplepayProvisioningbundleEffectResponse extends AlipayResponse {

	private static final long serialVersionUID = 8243547278231558724L;

	/** 
	 * ApplePay公用响应头
	 */
	@ApiField("response_header")
	private OpenApiResponseHeader responseHeader;

	public void setResponseHeader(OpenApiResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	public OpenApiResponseHeader getResponseHeader( ) {
		return this.responseHeader;
	}

}
