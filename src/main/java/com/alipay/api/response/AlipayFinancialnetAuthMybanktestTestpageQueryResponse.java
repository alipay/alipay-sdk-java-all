package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.mybanktest.testpage.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-26 18:59:29
 */
public class AlipayFinancialnetAuthMybanktestTestpageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4829762375779166465L;

	/** 
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

}
