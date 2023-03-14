package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.order.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 17:03:31
 */
public class AlipayBossOrderApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8772924584591814626L;

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
