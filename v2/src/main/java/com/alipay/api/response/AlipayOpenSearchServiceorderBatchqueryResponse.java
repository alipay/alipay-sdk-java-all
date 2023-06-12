package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OrderPageQueryDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.serviceorder.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 20:21:00
 */
public class AlipayOpenSearchServiceorderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5432719638438623964L;

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
