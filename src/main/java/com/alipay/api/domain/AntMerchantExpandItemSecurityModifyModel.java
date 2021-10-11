package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品更新
 *
 * @author auto create
 * @since 1.0, 2021-01-15 11:34:08
 */
public class AntMerchantExpandItemSecurityModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1843915886422457393L;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 商品所属前台类目ID列表（会和商品已存在所属前台类目做差异化比较后做增删操作）
	 */
	@ApiListField("front_category_id_list")
	@ApiField("string")
	private List<String> frontCategoryIdList;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品素材列表（会和商品已存在素材做差异化比较后做增删改操作）
	 */
	@ApiListField("material_list")
	@ApiField("material_modify_info")
	private List<MaterialModifyInfo> materialList;

	/**
	 * 商品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商品属性列表（覆盖商品已存在属性）
	 */
	@ApiListField("property_list")
	@ApiField("item_property_info")
	private List<ItemPropertyInfo> propertyList;

	/**
	 * SKU列表（会和商品已存在SKU做差异化比较后做增删改操作）
	 */
	@ApiListField("sku_list")
	@ApiField("sku_modify_info")
	private List<SkuModifyInfo> skuList;

	/**
	 * 商品状态：EFFECT（有效）、INVALID（无效）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商品类型：STANDARD_GOODS（标品）、NON_STANDARD_GOODS（非标品）
	 */
	@ApiField("type")
	private String type;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getFrontCategoryIdList() {
		return this.frontCategoryIdList;
	}
	public void setFrontCategoryIdList(List<String> frontCategoryIdList) {
		this.frontCategoryIdList = frontCategoryIdList;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public List<MaterialModifyInfo> getMaterialList() {
		return this.materialList;
	}
	public void setMaterialList(List<MaterialModifyInfo> materialList) {
		this.materialList = materialList;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<ItemPropertyInfo> getPropertyList() {
		return this.propertyList;
	}
	public void setPropertyList(List<ItemPropertyInfo> propertyList) {
		this.propertyList = propertyList;
	}

	public List<SkuModifyInfo> getSkuList() {
		return this.skuList;
	}
	public void setSkuList(List<SkuModifyInfo> skuList) {
		this.skuList = skuList;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
