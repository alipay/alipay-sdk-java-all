package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenVoucherDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.exchangevoucher.refund response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:21:46
 */
public class AlipayMarketingVoucherExchangevoucherRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 7234787344326929594L;

	/** 
	 * 被冲正的券
	 */
	@ApiField("voucher")
	private OpenVoucherDTO voucher;

	public void setVoucher(OpenVoucherDTO voucher) {
		this.voucher = voucher;
	}
	public OpenVoucherDTO getVoucher( ) {
		return this.voucher;
	}

}
