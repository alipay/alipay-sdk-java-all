package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.dapply.refund.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-21 19:50:46
 */
public class AlipayCommerceIotDapplyRefundCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8426472598264832185L;

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
