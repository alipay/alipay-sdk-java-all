package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.indirectmerchant.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-13 11:11:50
 */
public class AlipayCommerceIndirectmerchantCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3236638231451588661L;

	/** 
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}
	public String getMerchantPid( ) {
		return this.merchantPid;
	}

}
