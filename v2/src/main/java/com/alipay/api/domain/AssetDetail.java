package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资产基础信息
 *
 * @author auto create
 * @since 1.0, 2025-05-12 14:24:18
 */
public class AssetDetail extends AlipayObject {

	private static final long serialVersionUID = 7346433285972263179L;

	/**
	 * APPLET_ASSET
	 */
	@ApiField("asset")
	private String asset;

	/**
	 * 资产名称
	 */
	@ApiField("asset_name")
	private String assetName;

	/**
	 * 转化分层基础信息列表
	 */
	@ApiListField("converted_event_grp_detail_list")
	@ApiField("converted_event_grp_detail")
	private List<ConvertedEventGrpDetail> convertedEventGrpDetailList;

	public String getAsset() {
		return this.asset;
	}
	public void setAsset(String asset) {
		this.asset = asset;
	}

	public String getAssetName() {
		return this.assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public List<ConvertedEventGrpDetail> getConvertedEventGrpDetailList() {
		return this.convertedEventGrpDetailList;
	}
	public void setConvertedEventGrpDetailList(List<ConvertedEventGrpDetail> convertedEventGrpDetailList) {
		this.convertedEventGrpDetailList = convertedEventGrpDetailList;
	}

}
