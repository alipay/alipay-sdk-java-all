package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.exchangevoucher.use response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:16
 */
public class AlipayMarketingExchangevoucherUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 1229941194577672679L;

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
