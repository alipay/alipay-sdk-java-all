package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.iifaa.did.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-29 11:07:41
 */
public class AlipaySecurityProdIifaaDidTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 8678937729411171115L;

	/** 
	 * 数据
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
