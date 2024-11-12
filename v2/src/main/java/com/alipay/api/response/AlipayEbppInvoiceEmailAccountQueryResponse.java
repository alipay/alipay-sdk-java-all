package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.email.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-20 11:02:03
 */
public class AlipayEbppInvoiceEmailAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7299823674119719332L;

	/** 
	 * 收票邮箱地址
	 */
	@ApiField("email_address")
	private String emailAddress;

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getEmailAddress( ) {
		return this.emailAddress;
	}

}
