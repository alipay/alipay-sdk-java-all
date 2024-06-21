package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.account.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-29 17:07:02
 */
public class AlipayEbppIndustrySupervisionAccountModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5377178326415166437L;

	/** 
	 * 商户子户户号
	 */
	@ApiField("account_no")
	private String accountNo;

	/** 
	 * 商户子户状态
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
