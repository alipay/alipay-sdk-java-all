package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.card.disburse response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 02:26:41
 */
public class AlipayAssetCardDisburseResponse extends AlipayResponse {

	private static final long serialVersionUID = 3529655745729573779L;

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
