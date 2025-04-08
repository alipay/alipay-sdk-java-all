package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.haha.nobizcontent.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-30 11:15:05
 */
public class AlipayMerchantOrderHahaNobizcontentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1691265643575988773L;

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
