package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.tradeorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 06:51:45
 */
public class AntMerchantExpandTradeorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3418494542373538932L;

	/** 
	 * 订单创建成功后返回的id
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
