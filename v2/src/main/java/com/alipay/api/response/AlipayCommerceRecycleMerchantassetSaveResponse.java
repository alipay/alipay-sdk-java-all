package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.merchantasset.save response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-10 10:14:49
 */
public class AlipayCommerceRecycleMerchantassetSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 5188276374732354422L;

	/** 
	 * 商户授权链接，在pc打开该链接，并使用商户账号完成授权
	 */
	@ApiField("sign_url")
	private String signUrl;

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

}
