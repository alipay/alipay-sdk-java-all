package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.enterprise.address.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-21 16:01:53
 */
public class AlipayCommerceEcEnterpriseAddressModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4321784722827438693L;

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
