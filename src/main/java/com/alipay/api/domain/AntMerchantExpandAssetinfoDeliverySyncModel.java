package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 配送物料信息反馈接口
 *
 * @author auto create
 * @since 1.0, 2019-02-28 15:51:17
 */
public class AntMerchantExpandAssetinfoDeliverySyncModel extends AlipayObject {

	private static final long serialVersionUID = 6325467925747414226L;

	/**
	 * 传入需要反馈的物料信息对象列表。
	 */
	@ApiListField("asset_infos")
	@ApiField("asset_info_item")
	private List<AssetInfoItem> assetInfos;

	public List<AssetInfoItem> getAssetInfos() {
		return this.assetInfos;
	}
	public void setAssetInfos(List<AssetInfoItem> assetInfos) {
		this.assetInfos = assetInfos;
	}

}
