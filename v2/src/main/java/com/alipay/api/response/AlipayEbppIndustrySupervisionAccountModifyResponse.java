package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.account.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-13 14:42:34
 */
public class AlipayEbppIndustrySupervisionAccountModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6452848932543513552L;

	/** 
	 * 子户账户户号
	 */
	@ApiField("account_no")
	private String accountNo;

	/** 
	 * 子户账户状态
	 */
	@ApiField("account_status")
	private String accountStatus;

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNo( ) {
		return this.accountNo;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getAccountStatus( ) {
		return this.accountStatus;
	}

}
