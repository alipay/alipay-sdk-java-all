package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物料bom结构
 *
 * @author auto create
 * @since 1.0, 2024-07-19 14:57:51
 */
public class AssetBom extends AlipayObject {

	private static final long serialVersionUID = 8378463983938565554L;

	/**
	 * 物料子类型
	 */
	@ApiField("asset_sub_type")
	private String assetSubType;

	/**
	 * 扩展属性
	 */
	@ApiListField("attributes")
	@ApiField("asset_bom_attribute")
	private List<AssetBomAttribute> attributes;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 子物料清单
	 */
	@ApiListField("bom_items")
	@ApiField("asset_bom_item")
	private List<AssetBomItem> bomItems;

	/**
	 * 物料主图
	 */
	@ApiField("effect_img")
	private String effectImg;

	/**
	 * 物料是否包含码
	 */
	@ApiField("include_qrcode")
	private String includeQrcode;

	/**
	 * 是否包含SN
	 */
	@ApiField("include_sn")
	private String includeSn;

	/**
	 * 是否是套组物料
	 */
	@ApiField("is_suite")
	private String isSuite;

	/**
	 * 物料id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 物料名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 物料类别
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 物料发布状态
	 */
	@ApiField("release_status")
	private String releaseStatus;

	/**
	 * 物料信息查询的版本
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 供应商履约标准
	 */
	@ApiField("std")
	private AssetStandard std;

	/**
	 * 物料供给模板信息
	 */
	@ApiListField("supply_details")
	@ApiField("asset_supply_detail")
	private List<AssetSupplyDetail> supplyDetails;

	public String getAssetSubType() {
		return this.assetSubType;
	}
	public void setAssetSubType(String assetSubType) {
		this.assetSubType = assetSubType;
	}

	public List<AssetBomAttribute> getAttributes() {
		return this.attributes;
	}
	public void setAttributes(List<AssetBomAttribute> attributes) {
		this.attributes = attributes;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public List<AssetBomItem> getBomItems() {
		return this.bomItems;
	}
	public void setBomItems(List<AssetBomItem> bomItems) {
		this.bomItems = bomItems;
	}

	public String getEffectImg() {
		return this.effectImg;
	}
	public void setEffectImg(String effectImg) {
		this.effectImg = effectImg;
	}

	public String getIncludeQrcode() {
		return this.includeQrcode;
	}
	public void setIncludeQrcode(String includeQrcode) {
		this.includeQrcode = includeQrcode;
	}

	public String getIncludeSn() {
		return this.includeSn;
	}
	public void setIncludeSn(String includeSn) {
		this.includeSn = includeSn;
	}

	public String getIsSuite() {
		return this.isSuite;
	}
	public void setIsSuite(String isSuite) {
		this.isSuite = isSuite;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getReleaseStatus() {
		return this.releaseStatus;
	}
	public void setReleaseStatus(String releaseStatus) {
		this.releaseStatus = releaseStatus;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public AssetStandard getStd() {
		return this.std;
	}
	public void setStd(AssetStandard std) {
		this.std = std;
	}

	public List<AssetSupplyDetail> getSupplyDetails() {
		return this.supplyDetails;
	}
	public void setSupplyDetails(List<AssetSupplyDetail> supplyDetails) {
		this.supplyDetails = supplyDetails;
	}

}
