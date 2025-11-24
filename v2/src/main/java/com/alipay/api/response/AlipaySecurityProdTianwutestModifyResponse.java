package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.tianwutest.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 04:42:40
 */
public class AlipaySecurityProdTianwutestModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1699427324298653598L;

	/** 
	 * 测试
	 */
	@ApiField("ceshi")
	private String ceshi;

	public void setCeshi(String ceshi) {
		this.ceshi = ceshi;
	}
	public String getCeshi( ) {
		return this.ceshi;
	}

}
