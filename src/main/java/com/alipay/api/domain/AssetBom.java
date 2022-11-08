package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物料bom结构
 *
 * @author auto create
 * @since 1.0, 2022-03-16 15:03:44
 */
public class AssetBom extends AlipayObject {

	private static final long serialVersionUID = 2179796789379681551L;

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
	 * 物料信息查询的版本
	 */
	@ApiField("request_id")
	private String requestId;

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

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
