package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.zcardprod.merchant.sign response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-14 01:36:48
 */
public class AlipayFundZcardprodMerchantSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 5196659995288265322L;

	/** 
	 * 账户id
	 */
	@ApiField("account_id")
	private String accountId;

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountId( ) {
		return this.accountId;
	}

}
