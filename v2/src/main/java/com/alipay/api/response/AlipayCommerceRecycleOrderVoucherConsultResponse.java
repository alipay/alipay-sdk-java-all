package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RecycleVoucherInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.order.voucher.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-13 14:22:41
 */
public class AlipayCommerceRecycleOrderVoucherConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7144377929894565493L;

	/** 
	 * 券信息
	 */
	@ApiField("voucher_info")
	private RecycleVoucherInfo voucherInfo;

	public void setVoucherInfo(RecycleVoucherInfo voucherInfo) {
		this.voucherInfo = voucherInfo;
	}
	public RecycleVoucherInfo getVoucherInfo( ) {
		return this.voucherInfo;
	}

}
