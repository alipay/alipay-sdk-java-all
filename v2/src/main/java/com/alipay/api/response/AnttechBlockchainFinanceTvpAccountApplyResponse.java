package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.tvp.account.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 13:08:05
 */
public class AnttechBlockchainFinanceTvpAccountApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5531497134767117829L;

	/** 
	 * 账号ID
	 */
	@ApiField("account_no")
	private String accountNo;

	/** 
	 * 子户开立授权链接
	 */
	@ApiField("authorized_link")
	private String authorizedLink;

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNo( ) {
		return this.accountNo;
	}

	public void setAuthorizedLink(String authorizedLink) {
		this.authorizedLink = authorizedLink;
	}
	public String getAuthorizedLink( ) {
		return this.authorizedLink;
	}

}
