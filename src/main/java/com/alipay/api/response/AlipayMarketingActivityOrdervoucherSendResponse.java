package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.ordervoucher.send response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-30 20:48:16
 */
public class AlipayMarketingActivityOrdervoucherSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4543416495274876965L;

	/** 
	 * 本次发放的券码
	 */
	@ApiField("voucher_code")
	private String voucherCode;

	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}
	public String getVoucherCode( ) {
		return this.voucherCode;
	}

}
