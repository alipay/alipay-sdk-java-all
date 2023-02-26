package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物料生产完成反馈接口
 *
 * @author auto create
 * @since 1.0, 2023-02-06 14:20:24
 */
public class AntMerchantExpandAssetproduceCompleteSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4253667817581397338L;

	/**
	 * 物料生产单完成后指定物流信息
	 */
	@ApiListField("asset_produce_details")
	@ApiField("item_delivery_detail")
	private List<ItemDeliveryDetail> assetProduceDetails;

	public List<ItemDeliveryDetail> getAssetProduceDetails() {
		return this.assetProduceDetails;
	}
	public void setAssetProduceDetails(List<ItemDeliveryDetail> assetProduceDetails) {
		this.assetProduceDetails = assetProduceDetails;
	}

}
