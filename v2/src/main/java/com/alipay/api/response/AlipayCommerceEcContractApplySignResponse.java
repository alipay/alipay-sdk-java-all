package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.contract.apply.sign response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 22:11:55
 */
public class AlipayCommerceEcContractApplySignResponse extends AlipayResponse {

	private static final long serialVersionUID = 1345913394359343973L;

	/** 
	 * 签约链接
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
