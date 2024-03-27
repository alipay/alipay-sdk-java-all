package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.voucher.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-25 20:32:02
 */
public class AlipayMarketingActivityVoucherSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7768855891936591741L;

	/** 
	 * 本次发放的支付券id
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
