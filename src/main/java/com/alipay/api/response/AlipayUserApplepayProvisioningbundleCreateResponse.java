package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiResponseHeader;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.applepay.provisioningbundle.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-29 10:22:53
 */
public class AlipayUserApplepayProvisioningbundleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3726349235662762511L;

	/** 
	 * 卡id(由固定前缀+32位数字构成)
	 */
	@ApiField("provisioning_bundle_identifier")
	private String provisioningBundleIdentifier;

	/** 
	 * ApplePay公用响应头
	 */
	@ApiField("response_header")
	private OpenApiResponseHeader responseHeader;

	public void setProvisioningBundleIdentifier(String provisioningBundleIdentifier) {
		this.provisioningBundleIdentifier = provisioningBundleIdentifier;
	}
	public String getProvisioningBundleIdentifier( ) {
		return this.provisioningBundleIdentifier;
	}

	public void setResponseHeader(OpenApiResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	public OpenApiResponseHeader getResponseHeader( ) {
		return this.responseHeader;
	}

}
