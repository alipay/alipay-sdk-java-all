package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.assetreverse.complete.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:36
 */
public class AntMerchantExpandAssetreverseCompleteSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6643779858435814721L;

	/** 
	 * 取消订单或者退货已经完成时，响应参数
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
