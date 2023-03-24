package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.pre.order response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-23 20:21:41
 */
public class AlipayInsSceneEcommercePreOrderResponse extends AlipayResponse {

	private static final long serialVersionUID = 6448127235571471598L;

	/** 
	 * 预下单ID
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

	public void setPreOrderId(String preOrderId) {
		this.preOrderId = preOrderId;
	}
	public String getPreOrderId( ) {
		return this.preOrderId;
	}

}
