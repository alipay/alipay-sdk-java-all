package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiResponseHeader;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.provisioningbundle.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-12 11:50:16
 */
public class AlipayUserProvisioningbundleModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1756313357943183186L;

	/** 
	 * 暂无
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
