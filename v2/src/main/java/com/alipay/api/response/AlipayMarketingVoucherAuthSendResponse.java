package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.auth.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 00:21:44
 */
public class AlipayMarketingVoucherAuthSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6815479575639735823L;

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
