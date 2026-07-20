package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.pre.order response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-05 13:31:04
 */
public class AlipayInsSceneEcommercePreOrderResponse extends AlipayResponse {

	private static final long serialVersionUID = 1358455162591777441L;

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
