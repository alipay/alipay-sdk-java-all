package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.assetproduce.assign.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:35
 */
public class AntMerchantExpandAssetproduceAssignSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3462256929456614825L;

	/** 
	 * 供应商处理生产指令结果
	 */
	@ApiListField("asset_results")
	@ApiField("asset_result")
	private List<AssetResult> assetResults;

	public void setAssetResults(List<AssetResult> assetResults) {
		this.assetResults = assetResults;
	}
	public List<AssetResult> getAssetResults( ) {
		return this.assetResults;
	}

}
