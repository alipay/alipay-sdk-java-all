package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.sign.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:07:41
 */
public class AlipayFundJointaccountSignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8726927981684381418L;

	/** 
	 * 企业签约的账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/** 
	 * 企业授权平台的三方授权协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 账户状态，NORMAL-生效中，RELEASED-已销户
	 */
	@ApiField("status")
	private String status;

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountId( ) {
		return this.accountId;
	}

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
