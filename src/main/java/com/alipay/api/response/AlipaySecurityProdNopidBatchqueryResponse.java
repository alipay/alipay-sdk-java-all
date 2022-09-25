package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.nopid.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-08 14:25:09
 */
public class AlipaySecurityProdNopidBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5278391197657766874L;

	/** 
	 * 111
	 */
	@ApiField("rthreemcc")
	private String rthreemcc;

	public void setRthreemcc(String rthreemcc) {
		this.rthreemcc = rthreemcc;
	}
	public String getRthreemcc( ) {
		return this.rthreemcc;
	}

}
