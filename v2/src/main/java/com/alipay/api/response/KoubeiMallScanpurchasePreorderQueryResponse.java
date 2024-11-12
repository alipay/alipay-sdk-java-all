package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AdvanceOrder;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.mall.scanpurchase.preorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:34
 */
public class KoubeiMallScanpurchasePreorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1262978813358899349L;

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
