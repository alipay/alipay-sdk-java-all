package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.user.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:12
 */
public class AlipayCommerceLogisticsUserOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2714246721211269159L;

	/** 
	 * 格式 : json , 目前 json 的 key 有 biz_unique_no
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
