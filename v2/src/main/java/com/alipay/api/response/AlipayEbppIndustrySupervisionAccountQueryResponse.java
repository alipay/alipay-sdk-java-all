package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:34
 */
public class AlipayEbppIndustrySupervisionAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5382583353789224327L;

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
