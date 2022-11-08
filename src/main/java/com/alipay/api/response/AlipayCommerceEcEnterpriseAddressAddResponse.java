package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.enterprise.address.add response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-18 15:41:51
 */
public class AlipayCommerceEcEnterpriseAddressAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5797776444978532411L;

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
