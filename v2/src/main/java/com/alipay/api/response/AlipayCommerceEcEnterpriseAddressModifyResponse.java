package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.enterprise.address.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-14 16:25:43
 */
public class AlipayCommerceEcEnterpriseAddressModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1829511571559236435L;

	/** 
	 * 地址id
	 */
	@ApiField("address_id")
	private String addressId;

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getAddressId( ) {
		return this.addressId;
	}

}
