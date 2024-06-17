package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-27 10:28:39
 */
public class AlipayMarketingVoucherDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 3668321975953174583L;

	/** 
	 * 本张券的原始面额，单位元
	 */
	@ApiField("amount")
	private String amount;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

}
