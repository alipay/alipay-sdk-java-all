package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.haha.nobizcontent.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 00:50:47
 */
public class AlipayMerchantOrderHahaNobizcontentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5622458571538261681L;

	/** 
	 * 出参
	 */
	@ApiField("out")
	private String out;

	public void setOut(String out) {
		this.out = out;
	}
	public String getOut( ) {
		return this.out;
	}

}
