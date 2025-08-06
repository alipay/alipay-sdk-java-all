package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.scene.role.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-17 20:27:29
 */
public class AntMerchantExpandSceneRoleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3211951184641833814L;

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
