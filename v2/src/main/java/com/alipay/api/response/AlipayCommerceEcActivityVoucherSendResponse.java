package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.activity.voucher.send response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-10 10:17:25
 */
public class AlipayCommerceEcActivityVoucherSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3542494169949456344L;

	/** 
	 * 券id
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
