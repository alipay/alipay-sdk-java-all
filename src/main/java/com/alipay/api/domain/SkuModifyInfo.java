package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * SKU编辑模型
 *
 * @author auto create
 * @since 1.0, 2019-09-06 10:27:10
 */
public class SkuModifyInfo extends AlipayObject {

	private static final long serialVersionUID = 1151548716457271733L;

	/**
	 * 库存
	 */
	@ApiField("inventory")
	private Long inventory;

	/**
	 * SKU素材列表（会和SKU已存在素材做差异化比较后做增删改操作）
	 */
	@ApiListField("material_list")
	@ApiField("material_modify_info")
	private List<MaterialModifyInfo> materialList;

	/**
	 * 标价，单位分
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 售价，单位分
	 */
	@ApiField("price")
	private Long price;

	/**
	 * SKU属性列表（覆盖SKU已存在属性）
	 */
	@ApiListField("property_list")
	@ApiField("item_sku_property_info")
	private List<ItemSkuPropertyInfo> propertyList;

	/**
	 * SKU ID（传空表示新增对应SKU）
	 */
	@ApiField("sku_id")
	private String skuId;

	public Long getInventory() {
		return this.inventory;
	}
	public void setInventory(Long inventory) {
		this.inventory = inventory;
	}

	public List<MaterialModifyInfo> getMaterialList() {
		return this.materialList;
	}
	public void setMaterialList(List<MaterialModifyInfo> materialList) {
		this.materialList = materialList;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public List<ItemSkuPropertyInfo> getPropertyList() {
		return this.propertyList;
	}
	public void setPropertyList(List<ItemSkuPropertyInfo> propertyList) {
		this.propertyList = propertyList;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
