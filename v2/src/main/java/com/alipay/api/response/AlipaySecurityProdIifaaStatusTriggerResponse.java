package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.iifaa.status.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-08 19:37:42
 */
public class AlipaySecurityProdIifaaStatusTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 7569577188337954944L;

	/** 
	 * 响应数据
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
