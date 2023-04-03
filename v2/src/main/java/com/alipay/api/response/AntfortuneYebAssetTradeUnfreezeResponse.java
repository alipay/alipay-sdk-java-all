package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.yeb.asset.trade.unfreeze response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 05:16:46
 */
public class AntfortuneYebAssetTradeUnfreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1154254967428772282L;

	/** 
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
