package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建商品接口
 *
 * @author auto create
 * @since 1.0, 2019-09-16 16:13:25
 */
public class AntMerchantExpandItemOpenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5555862562285811198L;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 商品扩展信息（具体KEY请参见产品文档）
	 */
	@ApiListField("ext_info")
	@ApiField("item_ext_info")
	private List<ItemExtInfo> extInfo;

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
	 * 商品所属标准类目ID（具体值请参见产品文档）
	 */
	@ApiField("standard_category_id")
	private String standardCategoryId;

	/**
	 * 商品归属主体ID
例：商品归属主体类型为店铺，则商品归属主体ID为店铺ID；归属主体为小程序，则归属主体ID为小程序ID
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 商品归属主体类型:
5（店铺）
8（小程序）
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

	public List<ItemExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<ItemExtInfo> extInfo) {
		this.extInfo = extInfo;
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

	public String getStandardCategoryId() {
		return this.standardCategoryId;
	}
	public void setStandardCategoryId(String standardCategoryId) {
		this.standardCategoryId = standardCategoryId;
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
