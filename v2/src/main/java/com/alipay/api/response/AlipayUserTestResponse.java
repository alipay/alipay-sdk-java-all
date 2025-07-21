package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.test response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:13
 */
public class AlipayUserTestResponse extends AlipayResponse {

	private static final long serialVersionUID = 2124641975519261345L;

	/** 
	 * 返回值
	 */
	@ApiField("ret1")
	private String ret1;

	public void setRet1(String ret1) {
		this.ret1 = ret1;
	}
	public String getRet1( ) {
		return this.ret1;
	}

}
