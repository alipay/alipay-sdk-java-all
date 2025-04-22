package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.asiad.receipt.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:46:45
 */
public class AlipaySecurityProdAsiadReceiptCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7596316859699916439L;

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
