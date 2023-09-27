package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.contract.apply.sign response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 22:41:45
 */
public class AlipayCommerceEcContractApplySignResponse extends AlipayResponse {

	private static final long serialVersionUID = 7769867276923632339L;

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
