package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.iotdevice.apply.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 23:16:30
 */
public class AntMerchantExpandIotdeviceApplyUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2768574147978451938L;

	/** 
	 * 蚂蚁订单号
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
