package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.asiad.receipt.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 22:21:42
 */
public class AlipaySecurityProdAsiadReceiptCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3241355542931918327L;

	/** 
	 * 返回工单id
	 */
	@ApiField("id")
	private String id;

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

}
