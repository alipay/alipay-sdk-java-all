package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.dfesf.def.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:14:31
 */
public class AlipaySecurityProdDfesfDefBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2478489245856335717L;

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
