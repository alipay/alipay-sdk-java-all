package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayOrderDataOpenapiResultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.consumer.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-19 15:02:12
 */
public class AlipayMerchantOrderConsumerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7488688737912373382L;

	/** 
	 * 订单信息
若订单号或业务号存在，则返回
	 */
	@ApiField("order_info")
	private AlipayOrderDataOpenapiResultInfo orderInfo;

	public void setOrderInfo(AlipayOrderDataOpenapiResultInfo orderInfo) {
		this.orderInfo = orderInfo;
	}
	public AlipayOrderDataOpenapiResultInfo getOrderInfo( ) {
		return this.orderInfo;
	}

}
