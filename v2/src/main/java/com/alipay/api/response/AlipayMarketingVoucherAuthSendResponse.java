package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.auth.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 05:11:59
 */
public class AlipayMarketingVoucherAuthSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8763162574452959533L;

	/** 
	 * 券ID
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
