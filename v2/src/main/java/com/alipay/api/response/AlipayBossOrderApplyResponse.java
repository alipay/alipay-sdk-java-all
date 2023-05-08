package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.order.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 01:15:51
 */
public class AlipayBossOrderApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1427898491821266627L;

	/** 
	 * 订单信息
	 */
	@ApiField("order_info")
	private String orderInfo;

	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}
	public String getOrderInfo( ) {
		return this.orderInfo;
	}

}
