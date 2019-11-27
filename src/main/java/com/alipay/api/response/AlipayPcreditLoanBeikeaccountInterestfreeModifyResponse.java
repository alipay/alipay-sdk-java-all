package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BeikeAccountResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.beikeaccount.interestfree.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-14 11:47:04
 */
public class AlipayPcreditLoanBeikeaccountInterestfreeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2546957452798872418L;

	/** 
	 * 呗壳额度返回结果
	 */
	@ApiField("beike_account_response")
	private BeikeAccountResponse beikeAccountResponse;

	public void setBeikeAccountResponse(BeikeAccountResponse beikeAccountResponse) {
		this.beikeAccountResponse = beikeAccountResponse;
	}
	public BeikeAccountResponse getBeikeAccountResponse( ) {
		return this.beikeAccountResponse;
	}

}
