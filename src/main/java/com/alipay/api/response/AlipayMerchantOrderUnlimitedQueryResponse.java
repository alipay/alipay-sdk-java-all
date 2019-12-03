package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayOrderDataOpenapiResultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.unlimited.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-02 10:36:51
 */
public class AlipayMerchantOrderUnlimitedQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5195727589461213357L;

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
