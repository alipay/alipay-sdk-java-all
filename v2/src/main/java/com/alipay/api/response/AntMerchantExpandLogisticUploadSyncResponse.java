package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.logistic.upload.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-19 16:02:45
 */
public class AntMerchantExpandLogisticUploadSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5644568255781773691L;

	/** 
	 * 上门取件物流信息处理结果
	 */
	@ApiField("asset_results")
	private AssetResult assetResults;

	public void setAssetResults(AssetResult assetResults) {
		this.assetResults = assetResults;
	}
	public AssetResult getAssetResults( ) {
		return this.assetResults;
	}

}
