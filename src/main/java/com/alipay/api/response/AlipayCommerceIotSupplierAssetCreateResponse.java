package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.supplier.asset.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-22 14:49:29
 */
public class AlipayCommerceIotSupplierAssetCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2125552344752791199L;

	/** 
	 * 记录id
	 */
	@ApiField("id")
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

}
