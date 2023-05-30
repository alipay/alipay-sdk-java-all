package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.contract.apply.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 10:06:58
 */
public class AlipayCommerceEcContractApplyUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 6186214868219598114L;

	/** 
	 * 解约链接
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
