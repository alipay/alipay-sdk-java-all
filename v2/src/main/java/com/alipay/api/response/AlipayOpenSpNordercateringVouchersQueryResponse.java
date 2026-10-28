package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherView;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nordercatering.vouchers.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-12 13:45:14
 */
public class AlipayOpenSpNordercateringVouchersQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1857114272189625823L;

	/** 
	 * null
	 */
	@ApiListField("vouchers")
	@ApiField("voucher_view")
	private List<VoucherView> vouchers;

	public void setVouchers(List<VoucherView> vouchers) {
		this.vouchers = vouchers;
	}
	public List<VoucherView> getVouchers( ) {
		return this.vouchers;
	}

}
