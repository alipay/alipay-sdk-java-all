package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.logistic.upload.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-29 11:25:52
 */
public class AntMerchantExpandLogisticUploadSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5764895292513689231L;

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
