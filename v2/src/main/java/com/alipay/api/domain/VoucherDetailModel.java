package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券详情信息
 *
 * @author auto create
 * @since 1.0, 2026-05-15 20:02:48
 */
public class VoucherDetailModel extends AlipayObject {

	private static final long serialVersionUID = 2449211514743494396L;

	/**
	 * 可用渠道信息，可用于指定渠道优先展示
	 */
	@ApiListField("can_use_asset_channel_infos")
	@ApiField("asset_channel_info")
	private List<AssetChannelInfo> canUseAssetChannelInfos;

	public List<AssetChannelInfo> getCanUseAssetChannelInfos() {
		return this.canUseAssetChannelInfos;
	}
	public void setCanUseAssetChannelInfos(List<AssetChannelInfo> canUseAssetChannelInfos) {
		this.canUseAssetChannelInfos = canUseAssetChannelInfos;
	}

}
