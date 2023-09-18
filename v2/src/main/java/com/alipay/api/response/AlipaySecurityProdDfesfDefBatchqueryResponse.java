package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.dfesf.def.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 16:44:20
 */
public class AlipaySecurityProdDfesfDefBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3795489173592511337L;

	/** 
	 * 1
	 */
	@ApiField("ded")
	private String ded;

	public void setDed(String ded) {
		this.ded = ded;
	}
	public String getDed( ) {
		return this.ded;
	}

}
