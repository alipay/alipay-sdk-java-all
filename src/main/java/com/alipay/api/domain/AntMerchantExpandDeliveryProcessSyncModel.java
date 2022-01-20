package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料发货计划反馈接口
 *
 * @author auto create
 * @since 1.0, 2021-11-19 16:01:54
 */
public class AntMerchantExpandDeliveryProcessSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7355953131625745514L;

	/**
	 * 发货计划反馈信息
	 */
	@ApiField("asset_delivery_process_info")
	private AssetDeliveryProcessInfo assetDeliveryProcessInfo;

	public AssetDeliveryProcessInfo getAssetDeliveryProcessInfo() {
		return this.assetDeliveryProcessInfo;
	}
	public void setAssetDeliveryProcessInfo(AssetDeliveryProcessInfo assetDeliveryProcessInfo) {
		this.assetDeliveryProcessInfo = assetDeliveryProcessInfo;
	}

}
