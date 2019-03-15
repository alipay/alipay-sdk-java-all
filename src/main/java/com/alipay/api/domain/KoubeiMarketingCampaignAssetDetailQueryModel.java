package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询资产的详情信息
 *
 * @author auto create
 * @since 1.0, 2018-01-10 14:14:43
 */
public class KoubeiMarketingCampaignAssetDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4478778176687338672L;

	/**
	 * 用户资产id，配合《用户口碑优惠资产查询接口koubei.marketing.campaign.user.asset.query》使用，返回信息列表中的asset_id则为传递的入参值。
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 配合《用户口碑优惠资产查询接口koubei.marketing.campaign.user.asset.query》查询券列表数据使用，如果获取的是voucher_asset_list数据，则对应的枚举为：VOUCHER；（目前只支持该类型）
	 */
	@ApiField("asset_type")
	private String assetType;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

}
