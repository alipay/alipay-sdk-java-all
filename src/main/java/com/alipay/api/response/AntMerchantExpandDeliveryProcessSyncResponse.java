package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.delivery.process.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-14 20:32:18
 */
public class AntMerchantExpandDeliveryProcessSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3182349557683664317L;

	/** 
	 * 响应参数
	 */
	@ApiField("result")
	private AssetResult result;

	public void setResult(AssetResult result) {
		this.result = result;
	}
	public AssetResult getResult( ) {
		return this.result;
	}

}
