package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.groupmeal.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-29 15:37:39
 */
public class AlipayOfflineProviderGroupmealOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6834259984596914539L;

	/** 
	 * 订单同步成功后产生的支付宝订单号
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
