package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiResponseHeader;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.provisioningbundle.effect response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-05 18:17:32
 */
public class AlipayUserProvisioningbundleEffectResponse extends AlipayResponse {

	private static final long serialVersionUID = 5411373139515128324L;

	/** 
	 * 响应头
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
