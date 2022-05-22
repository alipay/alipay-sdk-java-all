package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.xwbtestabcd.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-06 11:09:22
 */
public class AlipayOpenPublicXwbtestabcdBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4344271818557942533L;

	/** 
	 * 1111
	 */
	@ApiField("b")
	private String b;

	public void setB(String b) {
		this.b = b;
	}
	public String getB( ) {
		return this.b;
	}

}
