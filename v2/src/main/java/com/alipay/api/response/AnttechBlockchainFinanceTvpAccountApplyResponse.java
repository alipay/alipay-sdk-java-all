package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.tvp.account.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-30 11:56:43
 */
public class AnttechBlockchainFinanceTvpAccountApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3567315971572176721L;

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
