package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.zcardprod.merchant.sign response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-07 17:12:36
 */
public class AlipayFundZcardprodMerchantSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 5562149186743281243L;

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
