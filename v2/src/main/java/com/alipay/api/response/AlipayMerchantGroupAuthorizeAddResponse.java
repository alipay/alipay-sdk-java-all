package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.authorize.add response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-12 18:17:03
 */
public class AlipayMerchantGroupAuthorizeAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 8767478453317891745L;

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
