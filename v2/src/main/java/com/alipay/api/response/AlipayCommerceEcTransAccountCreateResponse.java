package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.trans.account.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-11 21:23:03
 */
public class AlipayCommerceEcTransAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7578111143226276969L;

	/** 
	 * 资金专户账号ID
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}
	public String getAccountBookId( ) {
		return this.accountBookId;
	}

}
