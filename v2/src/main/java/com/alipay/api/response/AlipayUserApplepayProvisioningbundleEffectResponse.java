package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiResponseHeader;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.applepay.provisioningbundle.effect response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 07:42:28
 */
public class AlipayUserApplepayProvisioningbundleEffectResponse extends AlipayResponse {

	private static final long serialVersionUID = 2345197195174954332L;

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
