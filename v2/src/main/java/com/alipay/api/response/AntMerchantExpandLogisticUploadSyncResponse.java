package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.logistic.upload.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-29 10:52:28
 */
public class AntMerchantExpandLogisticUploadSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6484394343418457815L;

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
