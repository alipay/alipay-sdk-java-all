package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.cancel.result.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-21 10:32:30
 */
public class AntMerchantExpandCancelResultSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6254286158427492275L;

	/** 
	 * 返回结果
	 */
	@ApiField("asset_result")
	private AssetResult assetResult;

	public void setAssetResult(AssetResult assetResult) {
		this.assetResult = assetResult;
	}
	public AssetResult getAssetResult( ) {
		return this.assetResult;
	}

}
