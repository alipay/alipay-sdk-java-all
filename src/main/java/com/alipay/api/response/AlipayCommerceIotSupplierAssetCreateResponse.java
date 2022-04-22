package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.supplier.asset.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-21 11:28:50
 */
public class AlipayCommerceIotSupplierAssetCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5211636848999583554L;

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
