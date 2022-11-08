package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenOrderDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-10 20:25:48
 */
public class AlipayDataDataserviceAdOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3732397762469961899L;

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
