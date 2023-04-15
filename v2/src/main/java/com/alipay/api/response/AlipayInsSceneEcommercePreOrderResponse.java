package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.pre.order response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 07:56:44
 */
public class AlipayInsSceneEcommercePreOrderResponse extends AlipayResponse {

	private static final long serialVersionUID = 8512325644844764972L;

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
