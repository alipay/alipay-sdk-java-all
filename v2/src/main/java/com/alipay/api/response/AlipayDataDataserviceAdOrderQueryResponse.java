package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenOrderDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 23:36:12
 */
public class AlipayDataDataserviceAdOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7794567385221981311L;

	/** 
	 * 订单详情
	 */
	@ApiField("order_detail")
	private OpenOrderDetail orderDetail;

	public void setOrderDetail(OpenOrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}
	public OpenOrderDetail getOrderDetail( ) {
		return this.orderDetail;
	}

}
