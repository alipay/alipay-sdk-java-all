package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OrderPageQueryDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.serviceorder.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-23 21:51:00
 */
public class AlipayOpenSearchServiceorderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2384981633767992911L;

	/** 
	 * 申请单列表
	 */
	@ApiField("data")
	private OrderPageQueryDTO data;

	public void setData(OrderPageQueryDTO data) {
		this.data = data;
	}
	public OrderPageQueryDTO getData( ) {
		return this.data;
	}

}
