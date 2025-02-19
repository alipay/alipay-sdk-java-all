package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.tuitioncode.monitor.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:10
 */
public class AlipayCommerceEducateTuitioncodeMonitorCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7766467554488915675L;

	/** 
	 * 监管户名称
	 */
	@ApiField("account_name")
	private String accountName;

	/** 
	 * 监管户号
	 */
	@ApiField("account_no")
	private String accountNo;

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountName( ) {
		return this.accountName;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNo( ) {
		return this.accountNo;
	}

}
