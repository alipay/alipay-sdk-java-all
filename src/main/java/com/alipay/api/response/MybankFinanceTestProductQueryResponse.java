package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.finance.test.product.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class MybankFinanceTestProductQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3249146521931737386L;

	/** 
	 * 3
	 */
	@ApiField("ret")
	private String ret;

	public void setRet(String ret) {
		this.ret = ret;
	}
	public String getRet( ) {
		return this.ret;
	}

}
