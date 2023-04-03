package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AdvanceOrder;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.mall.scanpurchase.preorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 03:01:10
 */
public class KoubeiMallScanpurchasePreorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4248257466463836571L;

	/** 
	 * 预订单信息
	 */
	@ApiField("advance_order")
	private AdvanceOrder advanceOrder;

	public void setAdvanceOrder(AdvanceOrder advanceOrder) {
		this.advanceOrder = advanceOrder;
	}
	public AdvanceOrder getAdvanceOrder( ) {
		return this.advanceOrder;
	}

}
