package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.haha.nobizcontent.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-11 11:40:41
 */
public class AlipayMerchantOrderHahaNobizcontentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5247576587827695688L;

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
