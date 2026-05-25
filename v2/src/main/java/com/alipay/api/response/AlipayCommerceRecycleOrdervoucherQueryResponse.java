package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecycleOrderVoucher;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.ordervoucher.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-21 17:52:49
 */
public class AlipayCommerceRecycleOrdervoucherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6551727437135391281L;

	/** 
	 * 券列表
	 */
	@ApiListField("voucher_list")
	@ApiField("recycle_order_voucher")
	private List<RecycleOrderVoucher> voucherList;

	public void setVoucherList(List<RecycleOrderVoucher> voucherList) {
		this.voucherList = voucherList;
	}
	public List<RecycleOrderVoucher> getVoucherList( ) {
		return this.voucherList;
	}

}
