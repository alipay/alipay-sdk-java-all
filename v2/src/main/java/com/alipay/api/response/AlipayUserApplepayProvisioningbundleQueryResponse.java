package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiProvisioningBundle;
import com.alipay.api.domain.OpenApiResponseHeader;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.applepay.provisioningbundle.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 02:48:20
 */
public class AlipayUserApplepayProvisioningbundleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2798877261141221324L;

	/** 
	 * 卡状态
	 */
	@ApiField("pass_state")
	private String passState;

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

	public void setPassState(String passState) {
		this.passState = passState;
	}
	public String getPassState( ) {
		return this.passState;
	}

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
