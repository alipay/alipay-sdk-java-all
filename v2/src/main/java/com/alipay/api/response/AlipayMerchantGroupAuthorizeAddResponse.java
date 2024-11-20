package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.authorize.add response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-11 15:36:38
 */
public class AlipayMerchantGroupAuthorizeAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 2334422113178146999L;

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
