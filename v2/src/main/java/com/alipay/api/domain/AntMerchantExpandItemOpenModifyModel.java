package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改商品接口
 *
 * @author auto create
 * @since 1.0, 2023-07-05 10:59:03
 */
public class AntMerchantExpandItemOpenModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1142286925528212332L;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 商品扩展信息（覆盖商品已存在扩展信息、具体KEY请参见产品文档）
	 */
	@ApiListField("ext_info")
	@ApiField("item_ext_info")
	private List<ItemExtInfo> extInfo;

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
	 * 商品所属标准类目ID，当 type 为STANDARD_GOODS（标品）时必填。 请填入 https://opendocs.alipay.com/mini/011lxt 小程序商品类目表中三级类目ID。
	 */
	@ApiField("standard_category_id")
	private String standardCategoryId;

	/**
	 * 商品状态
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

	public List<ItemExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<ItemExtInfo> extInfo) {
		this.extInfo = extInfo;
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

	public String getStandardCategoryId() {
		return this.standardCategoryId;
	}
	public void setStandardCategoryId(String standardCategoryId) {
		this.standardCategoryId = standardCategoryId;
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
