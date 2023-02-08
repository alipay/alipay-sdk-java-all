package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.pre.order response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 00:36:43
 */
public class AlipayInsSceneEcommercePreOrderResponse extends AlipayResponse {

	private static final long serialVersionUID = 7412718116725775246L;

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
