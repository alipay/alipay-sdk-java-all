package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.tradeorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-19 14:59:41
 */
public class AntMerchantExpandTradeorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8213537113873965872L;

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
