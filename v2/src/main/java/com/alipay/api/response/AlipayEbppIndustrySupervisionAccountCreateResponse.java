package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.account.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-19 16:22:08
 */
public class AlipayEbppIndustrySupervisionAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4378612538173649511L;

	/** 
	 * 基于请求参数创建的子户账户户号
	 */
	@ApiField("merchant_account_no")
	private String merchantAccountNo;

	/** 
	 * 子户账户状态
	 */
	@ApiField("merchant_account_status")
	private String merchantAccountStatus;

	public void setMerchantAccountNo(String merchantAccountNo) {
		this.merchantAccountNo = merchantAccountNo;
	}
	public String getMerchantAccountNo( ) {
		return this.merchantAccountNo;
	}

	public void setMerchantAccountStatus(String merchantAccountStatus) {
		this.merchantAccountStatus = merchantAccountStatus;
	}
	public String getMerchantAccountStatus( ) {
		return this.merchantAccountStatus;
	}

}
