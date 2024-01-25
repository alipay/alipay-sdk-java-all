package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.enterprise.address.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-17 16:18:08
 */
public class AlipayCommerceEcEnterpriseAddressModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7398396733647569281L;

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
