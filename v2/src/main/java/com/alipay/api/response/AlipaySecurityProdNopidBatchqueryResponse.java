package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.nopid.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:10
 */
public class AlipaySecurityProdNopidBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8651877368594846427L;

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
