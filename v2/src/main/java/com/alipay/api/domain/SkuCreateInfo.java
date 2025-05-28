package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * SKU创建模型
 *
 * @author auto create
 * @since 1.0, 2019-09-06 10:26:58
 */
public class SkuCreateInfo extends AlipayObject {

	private static final long serialVersionUID = 1853245723562888661L;

	/**
	 * 库存
	 */
	@ApiField("inventory")
	private Long inventory;

	/**
	 * SKU素材列表（最多3个）
	 */
	@ApiListField("material_list")
	@ApiField("material_create_info")
	private List<MaterialCreateInfo> materialList;

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
	 * SKU属性列表
	 */
	@ApiListField("property_list")
	@ApiField("item_sku_property_info")
	private List<ItemSkuPropertyInfo> propertyList;

	public Long getInventory() {
		return this.inventory;
	}
	public void setInventory(Long inventory) {
		this.inventory = inventory;
	}

	public List<MaterialCreateInfo> getMaterialList() {
		return this.materialList;
	}
	public void setMaterialList(List<MaterialCreateInfo> materialList) {
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

}
