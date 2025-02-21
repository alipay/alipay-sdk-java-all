package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品创建
 *
 * @author auto create
 * @since 1.0, 2024-10-10 09:50:10
 */
public class AntMerchantExpandItemSecurityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1779768918464465733L;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 商品所属前台类目ID列表
	 */
	@ApiListField("front_category_id_list")
	@ApiField("string")
	private List<String> frontCategoryIdList;

	/**
	 * 素材列表（最多3个）
	 */
	@ApiListField("material_list")
	@ApiField("material_create_info")
	private List<MaterialCreateInfo> materialList;

	/**
	 * 商品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商品属性列表
	 */
	@ApiListField("property_list")
	@ApiField("item_property_info")
	private List<ItemPropertyInfo> propertyList;

	/**
	 * 场景码（具体值请参见产品文档）
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 商品SKU列表（至少1个，最多20个）
	 */
	@ApiListField("sku_list")
	@ApiField("sku_create_info")
	private List<SkuCreateInfo> skuList;

	/**
	 * 商品归属主体ID
例：商品归属主体类型为店铺，则商品归属主体ID为店铺ID；
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 商品归属主体类型:
5（店铺）
	 */
	@ApiField("target_type")
	private String targetType;

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

	public List<MaterialCreateInfo> getMaterialList() {
		return this.materialList;
	}
	public void setMaterialList(List<MaterialCreateInfo> materialList) {
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

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public List<SkuCreateInfo> getSkuList() {
		return this.skuList;
	}
	public void setSkuList(List<SkuCreateInfo> skuList) {
		this.skuList = skuList;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
