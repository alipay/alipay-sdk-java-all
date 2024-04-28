package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.xwbtestabcd.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:00:44
 */
public class AlipayOpenPublicXwbtestabcdBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8187935427343111257L;

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
