package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.activity.voucher.send response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-20 10:44:09
 */
public class AlipayCommerceEcActivityVoucherSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8371356417454494898L;

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
