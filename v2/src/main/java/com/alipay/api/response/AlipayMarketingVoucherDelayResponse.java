package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenVoucherDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.delay response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 02:11:54
 */
public class AlipayMarketingVoucherDelayResponse extends AlipayResponse {

	private static final long serialVersionUID = 5637119641821545894L;

	/** 
	 * 被延期的券
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
