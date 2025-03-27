package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.tvp.accountprogress.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-24 16:42:21
 */
public class AnttechBlockchainFinanceTvpAccountprogressQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6554614395933836895L;

	/** 
	 * 账号，开户成功后返回
	 */
	@ApiField("account_no")
	private String accountNo;

	/** 
	 * 账号开立状态
	 */
	@ApiField("status")
	private String status;

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNo( ) {
		return this.accountNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
