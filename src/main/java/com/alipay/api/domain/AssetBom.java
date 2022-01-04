package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物料bom结构
 *
 * @author auto create
 * @since 1.0, 2022-01-04 14:04:45
 */
public class AssetBom extends AlipayObject {

	private static final long serialVersionUID = 4613576722539589763L;

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
	 * 物料id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 物料名称
	 */
	@ApiField("item_name")
	private String itemName;

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

}
