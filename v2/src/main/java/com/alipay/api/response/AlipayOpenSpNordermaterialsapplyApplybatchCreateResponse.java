package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nordermaterialsapply.applybatch.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-25 11:17:41
 */
public class AlipayOpenSpNordermaterialsapplyApplybatchCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7736634323352279319L;

	/** 
	 * 组合单号：组合下单时需要申请单号，后续下单需要携带此单号
	 */
	@ApiField("combined_order_no")
	private String combinedOrderNo;

	public void setCombinedOrderNo(String combinedOrderNo) {
		this.combinedOrderNo = combinedOrderNo;
	}
	public String getCombinedOrderNo( ) {
		return this.combinedOrderNo;
	}

}
