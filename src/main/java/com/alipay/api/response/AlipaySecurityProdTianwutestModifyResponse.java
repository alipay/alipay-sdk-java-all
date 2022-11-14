package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.tianwutest.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-08 20:11:40
 */
public class AlipaySecurityProdTianwutestModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4899315936169726766L;

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
