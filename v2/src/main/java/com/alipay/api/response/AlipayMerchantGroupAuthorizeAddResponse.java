package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.authorize.add response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-13 10:14:46
 */
public class AlipayMerchantGroupAuthorizeAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 3668194132566772491L;

	/** 
	 * 授权记录id
	 */
	@ApiField("authorize_id")
	private String authorizeId;

	public void setAuthorizeId(String authorizeId) {
		this.authorizeId = authorizeId;
	}
	public String getAuthorizeId( ) {
		return this.authorizeId;
	}

}
