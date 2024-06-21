package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.order.reverse.supplier.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-03 14:42:03
 */
public class AntMerchantOrderReverseSupplierApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5615869622395489276L;

	/** 
	 * 未妥投反馈处理结果
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
