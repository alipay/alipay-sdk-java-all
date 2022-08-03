package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生产物料信息反馈接口
 *
 * @author auto create
 * @since 1.0, 2021-11-19 16:02:51
 */
public class AntMerchantExpandAssetinfoProduceSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1485498739584128792L;

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
