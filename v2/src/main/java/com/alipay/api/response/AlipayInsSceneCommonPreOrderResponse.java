package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.common.pre.order response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-27 15:32:04
 */
public class AlipayInsSceneCommonPreOrderResponse extends AlipayResponse {

	private static final long serialVersionUID = 1274659956865988249L;

	/** 
	 * 预下单ID
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

	/** 
	 * 产品方案ID
	 */
	@ApiField("product_plan_id")
	private String productPlanId;

	public void setPreOrderId(String preOrderId) {
		this.preOrderId = preOrderId;
	}
	public String getPreOrderId( ) {
		return this.preOrderId;
	}

	public void setProductPlanId(String productPlanId) {
		this.productPlanId = productPlanId;
	}
	public String getProductPlanId( ) {
		return this.productPlanId;
	}

}
