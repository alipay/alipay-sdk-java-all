package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.dapply.refund.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 07:43:23
 */
public class AlipayCommerceIotDapplyRefundCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8334389311144176919L;

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
