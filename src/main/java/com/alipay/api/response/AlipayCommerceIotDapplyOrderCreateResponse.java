package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.dapply.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-24 13:56:07
 */
public class AlipayCommerceIotDapplyOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3369853469157564177L;

	/** 
	 * 物料申请单号，即SO单号
	 */
	@ApiField("asset_apply_order_id")
	private String assetApplyOrderId;

	public void setAssetApplyOrderId(String assetApplyOrderId) {
		this.assetApplyOrderId = assetApplyOrderId;
	}
	public String getAssetApplyOrderId( ) {
		return this.assetApplyOrderId;
	}

}
