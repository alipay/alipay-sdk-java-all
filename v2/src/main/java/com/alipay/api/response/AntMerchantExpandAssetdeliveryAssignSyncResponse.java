package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.assetdelivery.assign.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-02-06 14:18:27
 */
public class AntMerchantExpandAssetdeliveryAssignSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5644318671344699577L;

	/** 
	 * 配送指令反馈处理结果.
	 */
	@ApiListField("delivery_results")
	@ApiField("asset_result")
	private List<AssetResult> deliveryResults;

	public void setDeliveryResults(List<AssetResult> deliveryResults) {
		this.deliveryResults = deliveryResults;
	}
	public List<AssetResult> getDeliveryResults( ) {
		return this.deliveryResults;
	}

}
