package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.scene.role.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 10:47:36
 */
public class AntMerchantExpandSceneRoleModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1187853685299985742L;

	/** 
	 * 申请单id
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
