package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.voucher.send response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-19 20:59:55
 */
public class AlipayMarketingActivityVoucherSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6431914182477552812L;

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
