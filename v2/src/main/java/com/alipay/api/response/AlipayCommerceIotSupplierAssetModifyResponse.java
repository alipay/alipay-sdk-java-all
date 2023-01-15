package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.supplier.asset.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 11:37:29
 */
public class AlipayCommerceIotSupplierAssetModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1684187738423652225L;

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
