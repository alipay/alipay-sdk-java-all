package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenVoucherDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.exchangevoucher.refund response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 11:22:36
 */
public class AlipayMarketingVoucherExchangevoucherRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 4535637818327363591L;

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
