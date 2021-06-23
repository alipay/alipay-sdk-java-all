package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.supplier.asset.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-21 19:51:42
 */
public class AlipayCommerceIotSupplierAssetCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2172784489217985177L;

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
