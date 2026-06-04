package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上门取件物流信息回传接口
 *
 * @author auto create
 * @since 1.0, 2026-05-19 15:58:43
 */
public class AntMerchantExpandLogisticUploadSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3576339322663612553L;

	/**
	 * 回收场景上门取件后回传上门取件状态以及上门取件物流信息
	 */
	@ApiField("asset_pickup_logistic_detail")
	private AssetPickupLogisticsDetail assetPickupLogisticDetail;

	public AssetPickupLogisticsDetail getAssetPickupLogisticDetail() {
		return this.assetPickupLogisticDetail;
	}
	public void setAssetPickupLogisticDetail(AssetPickupLogisticsDetail assetPickupLogisticDetail) {
		this.assetPickupLogisticDetail = assetPickupLogisticDetail;
	}

}
