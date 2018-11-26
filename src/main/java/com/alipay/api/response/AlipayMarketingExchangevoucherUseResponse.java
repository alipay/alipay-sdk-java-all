package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.exchangevoucher.use response.
 * 
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayMarketingExchangevoucherUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 7553745912638745238L;

	/** 
	 * 被核销的券ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
