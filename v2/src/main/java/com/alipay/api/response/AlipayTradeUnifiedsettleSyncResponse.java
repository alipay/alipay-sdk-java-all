package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.unifiedsettle.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-25 23:12:18
 */
public class AlipayTradeUnifiedsettleSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1158646898913963385L;

	/** 
	 * 订单同步受理单号
	 */
	@ApiField("order_sync_id")
	private String orderSyncId;

	public void setOrderSyncId(String orderSyncId) {
		this.orderSyncId = orderSyncId;
	}
	public String getOrderSyncId( ) {
		return this.orderSyncId;
	}

}
