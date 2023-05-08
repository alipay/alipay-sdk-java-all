package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.card.disburse response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:01:55
 */
public class AlipayAssetCardDisburseResponse extends AlipayResponse {

	private static final long serialVersionUID = 4277313487562127375L;

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
