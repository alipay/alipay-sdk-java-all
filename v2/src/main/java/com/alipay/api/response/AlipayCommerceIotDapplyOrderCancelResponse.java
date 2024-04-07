package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.dapply.order.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:46:18
 */
public class AlipayCommerceIotDapplyOrderCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 5445425464534371537L;

	/** 
	 * 物料申请单号
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
