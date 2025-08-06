package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.activity.voucher.send response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-23 11:02:25
 */
public class AlipayCommerceEcActivityVoucherSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7155756863169946953L;

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
