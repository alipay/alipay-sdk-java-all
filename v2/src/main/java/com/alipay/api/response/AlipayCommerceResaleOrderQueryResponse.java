package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ResaleOrderDetailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.resale.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-06 17:41:30
 */
public class AlipayCommerceResaleOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5792166729121937426L;

	/** 
	 * 订单详情
	 */
	@ApiField("data")
	private ResaleOrderDetailVO data;

	public void setData(ResaleOrderDetailVO data) {
		this.data = data;
	}
	public ResaleOrderDetailVO getData( ) {
		return this.data;
	}

}
