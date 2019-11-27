package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.close response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-29 18:28:07
 */
public class AlipayMerchantOrderCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 6188372863326532752L;

	/** 
	 * 业务订单编号
	 */
	@ApiField("order_id")
	private String orderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
