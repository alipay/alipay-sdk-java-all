package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.contract.apply.sign response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-26 15:16:36
 */
public class AlipayCommerceEcContractApplySignResponse extends AlipayResponse {

	private static final long serialVersionUID = 4644374858355393128L;

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
