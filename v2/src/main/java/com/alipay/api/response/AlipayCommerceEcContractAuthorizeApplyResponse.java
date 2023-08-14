package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.contract.authorize.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-09 15:11:42
 */
public class AlipayCommerceEcContractAuthorizeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7652288698199534429L;

	/** 
	 * 签约授权地址
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
