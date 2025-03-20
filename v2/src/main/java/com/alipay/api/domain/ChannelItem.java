package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付渠道
 *
 * @author auto create
 * @since 1.0, 2021-05-08 15:47:04
 */
public class ChannelItem extends AlipayObject {

	private static final long serialVersionUID = 7891814167381999925L;

	/**
	 * 资产ID
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 资产类型
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 资产编码
	 */
	@ApiField("asset_type_code")
	private String assetTypeCode;

	/**
	 * 渠道索引
	 */
	@ApiField("channel_index")
	private String channelIndex;

	/**
	 * 机构ID
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 渠道logo图片的url地址
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 渠道名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 渠道运营文案
	 */
	@ApiField("recommend_tip")
	private String recommendTip;

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

	public String getAssetTypeCode() {
		return this.assetTypeCode;
	}
	public void setAssetTypeCode(String assetTypeCode) {
		this.assetTypeCode = assetTypeCode;
	}

	public String getChannelIndex() {
		return this.channelIndex;
	}
	public void setChannelIndex(String channelIndex) {
		this.channelIndex = channelIndex;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRecommendTip() {
		return this.recommendTip;
	}
	public void setRecommendTip(String recommendTip) {
		this.recommendTip = recommendTip;
	}

}
