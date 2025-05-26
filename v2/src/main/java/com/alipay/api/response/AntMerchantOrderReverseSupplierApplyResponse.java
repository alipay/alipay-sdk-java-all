package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.order.reverse.supplier.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-01 17:42:22
 */
public class AntMerchantOrderReverseSupplierApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6569795489844594997L;

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
