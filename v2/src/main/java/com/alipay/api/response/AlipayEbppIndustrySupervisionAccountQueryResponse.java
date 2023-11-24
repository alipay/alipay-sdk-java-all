package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:21:48
 */
public class AlipayEbppIndustrySupervisionAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2389339555457186318L;

	/** 
	 * 账户余额（单位分）
	 */
	@ApiField("account_balance")
	private Long accountBalance;

	/** 
	 * 脱敏商户子户账号
	 */
	@ApiField("masking_account_no")
	private String maskingAccountNo;

	/** 
	 * 账户状态
可用、冻结
	 */
	@ApiField("merchant_account_status")
	private String merchantAccountStatus;

	public void setAccountBalance(Long accountBalance) {
		this.accountBalance = accountBalance;
	}
	public Long getAccountBalance( ) {
		return this.accountBalance;
	}

	public void setMaskingAccountNo(String maskingAccountNo) {
		this.maskingAccountNo = maskingAccountNo;
	}
	public String getMaskingAccountNo( ) {
		return this.maskingAccountNo;
	}

	public void setMerchantAccountStatus(String merchantAccountStatus) {
		this.merchantAccountStatus = merchantAccountStatus;
	}
	public String getMerchantAccountStatus( ) {
		return this.merchantAccountStatus;
	}

}
