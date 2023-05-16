package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.supplier.asset.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 20:32:40
 */
public class AlipayCommerceIotSupplierAssetModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1479258614613486435L;

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
