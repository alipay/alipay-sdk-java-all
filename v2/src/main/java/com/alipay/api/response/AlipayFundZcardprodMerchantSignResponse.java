package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.zcardprod.merchant.sign response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 09:01:39
 */
public class AlipayFundZcardprodMerchantSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 5411545783382312565L;

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
