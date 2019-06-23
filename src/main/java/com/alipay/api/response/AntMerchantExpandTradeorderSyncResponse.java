package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.tradeorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-18 16:10:00
 */
public class AntMerchantExpandTradeorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3644972375118658827L;

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
