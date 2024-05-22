package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.dapply.refund.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:02:06
 */
public class AlipayCommerceIotDapplyRefundConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 3352591411472746265L;

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
