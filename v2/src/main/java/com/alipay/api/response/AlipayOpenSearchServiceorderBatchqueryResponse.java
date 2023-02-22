package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OrderPageQueryDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.serviceorder.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 19:04:48
 */
public class AlipayOpenSearchServiceorderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7866388645887222236L;

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
