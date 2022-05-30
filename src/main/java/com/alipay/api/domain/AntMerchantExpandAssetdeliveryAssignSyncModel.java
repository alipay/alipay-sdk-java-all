package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 配送指令接收反馈接口
 *
 * @author auto create
 * @since 1.0, 2021-11-19 16:01:32
 */
public class AntMerchantExpandAssetdeliveryAssignSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4578612548875525984L;

	/**
	 * 配送指令接收反馈，最多200条
	 */
	@ApiListField("delivery_results")
	@ApiField("asset_result")
	private List<AssetResult> deliveryResults;

	public List<AssetResult> getDeliveryResults() {
		return this.deliveryResults;
	}
	public void setDeliveryResults(List<AssetResult> deliveryResults) {
		this.deliveryResults = deliveryResults;
	}

}
