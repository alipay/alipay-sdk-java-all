package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 配送完成反馈接口
 *
 * @author auto create
 * @since 1.0, 2019-06-04 15:11:18
 */
public class AntMerchantExpandAssetdeliveryCompleteSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2773687752237139823L;

	/**
	 * 配送完成反馈信息
	 */
	@ApiListField("asset_delivery_details")
	@ApiField("asset_delivery_detail")
	private List<AssetDeliveryDetail> assetDeliveryDetails;

	public List<AssetDeliveryDetail> getAssetDeliveryDetails() {
		return this.assetDeliveryDetails;
	}
	public void setAssetDeliveryDetails(List<AssetDeliveryDetail> assetDeliveryDetails) {
		this.assetDeliveryDetails = assetDeliveryDetails;
	}

}
