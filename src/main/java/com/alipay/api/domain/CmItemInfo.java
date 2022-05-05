package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品数据模型
 *
 * @author auto create
 * @since 1.0, 2019-09-11 20:33:11
 */
public class CmItemInfo extends AlipayObject {

	private static final long serialVersionUID = 8817252618323554229L;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 商品扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("item_ext_info")
	private List<ItemExtInfo> extInfo;

	/**
	 * 商品所属前台类目ID列表
	 */
	@ApiListField("front_category_id_list")
	@ApiField("string")
	private List<String> frontCategoryIdList;

	/**
	 * 商品创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 商品更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品素材列表
	 */
	@ApiListField("material_list")
	@ApiField("material_info")
	private List<MaterialInfo> materialList;

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
	 * 商品SKU列表
	 */
	@ApiListField("sku_list")
	@ApiField("cm_item_sku_info")
	private List<CmItemSkuInfo> skuList;

	/**
	 * 商品所属标准类目ID（具体值请参见产品文档）
	 */
	@ApiField("standard_category_id")
	private String standardCategoryId;

	/**
	 * 商品状态：
EFFECT（有效）、INVALID（无效）
	 */
	@ApiField("status")
	private String status;

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
	 * 商品类型：
STANDARD_GOODS（标品）、NON_STANDARD_GOODS（非标品）
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

	public List<String> getFrontCategoryIdList() {
		return this.frontCategoryIdList;
	}
	public void setFrontCategoryIdList(List<String> frontCategoryIdList) {
		this.frontCategoryIdList = frontCategoryIdList;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public List<MaterialInfo> getMaterialList() {
		return this.materialList;
	}
	public void setMaterialList(List<MaterialInfo> materialList) {
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

	public List<CmItemSkuInfo> getSkuList() {
		return this.skuList;
	}
	public void setSkuList(List<CmItemSkuInfo> skuList) {
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
