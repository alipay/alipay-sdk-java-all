package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.assetinfo.correction.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 06:35:35
 */
public class AntMerchantExpandAssetinfoCorrectionSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4419838346276457634L;

	/** 
	 * 物料更正请求响应。
	 */
	@ApiListField("correction_results")
	@ApiField("asset_result")
	private List<AssetResult> correctionResults;

	public void setCorrectionResults(List<AssetResult> correctionResults) {
		this.correctionResults = correctionResults;
	}
	public List<AssetResult> getCorrectionResults( ) {
		return this.correctionResults;
	}

}
