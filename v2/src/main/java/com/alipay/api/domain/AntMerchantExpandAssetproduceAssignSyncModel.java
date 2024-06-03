package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生产指令接收反馈接口
 *
 * @author auto create
 * @since 1.0, 2023-02-06 14:22:07
 */
public class AntMerchantExpandAssetproduceAssignSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5898358226775764628L;

	/**
	 * 生产指令接收情况，最多200条
	 */
	@ApiListField("asset_results")
	@ApiField("asset_result")
	private List<AssetResult> assetResults;

	public List<AssetResult> getAssetResults() {
		return this.assetResults;
	}
	public void setAssetResults(List<AssetResult> assetResults) {
		this.assetResults = assetResults;
	}

}
