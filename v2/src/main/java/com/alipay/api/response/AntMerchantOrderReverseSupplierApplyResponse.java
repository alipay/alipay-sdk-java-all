package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.order.reverse.supplier.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-24 17:27:33
 */
public class AntMerchantOrderReverseSupplierApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4363218116899277115L;

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
