package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.yeb.asset.trade.unfreeze response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 02:56:50
 */
public class AntfortuneYebAssetTradeUnfreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6386592176867234125L;

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
