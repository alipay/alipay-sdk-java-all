package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiProvisioningBundle;
import com.alipay.api.domain.OpenApiResponseHeader;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.provisioningbundle.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-05 18:18:13
 */
public class AlipayUserProvisioningbundleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6392679443572828141L;

	/** 
	 * 卡模型
	 */
	@ApiField("provisioning_bundle")
	private OpenApiProvisioningBundle provisioningBundle;

	/** 
	 * 响应头
	 */
	@ApiField("response_header")
	private OpenApiResponseHeader responseHeader;

	public void setProvisioningBundle(OpenApiProvisioningBundle provisioningBundle) {
		this.provisioningBundle = provisioningBundle;
	}
	public OpenApiProvisioningBundle getProvisioningBundle( ) {
		return this.provisioningBundle;
	}

	public void setResponseHeader(OpenApiResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	public OpenApiResponseHeader getResponseHeader( ) {
		return this.responseHeader;
	}

}
