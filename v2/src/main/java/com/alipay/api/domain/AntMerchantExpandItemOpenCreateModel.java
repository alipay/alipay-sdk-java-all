package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建商品接口
 *
 * @author auto create
 * @since 1.0, 2024-10-10 14:20:36
 */
public class AntMerchantExpandItemOpenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2446455566678581857L;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 商品扩展信息（具体KEY请参见产品文档）。 小程序订单中心场景接入参见 <a href="https://opendocs.alipay.com/mini/024hj4">接入指南</a>。
	 */
	@ApiListField("ext_info")
	@ApiField("item_ext_info")
	private List<ItemExtInfo> extInfo;

	/**
	 * 素材列表（最多3个），素材内容为素材key（素材key为<a href="https://opendocs.alipay.com/apis/api_4/alipay.merchant.item.file.upload">alipay.merchant.item.file.upload</a> 接口返回的 material_key）
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
	 * 业务场景码。
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
	 * 商品所属标准类目ID，标品及非标品都需传入。 请填入 <a href="https://opendocs.alipay.com/mini/011lxt">小程序商品类目表</a> 中三级类目ID。
	 */
	@ApiField("standard_category_id")
	private String standardCategoryId;

	/**
	 * 商品归属主体ID
例：商品归属主体类型target_type为店铺，则商品归属主体ID为店铺ID（支付宝侧店铺ID）；归属主体类型target_type为小程序，则归属主体ID为小程序ID
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 商品归属主体类型。枚举如下：
5：店铺。
8：小程序。
	 */
	@ApiField("target_type")
	private String targetType;

	/**
	 * 商品类型。枚举支持：
STANDARD_GOODS：标品，一般是具有明确、标准规格、型号、参数的商品，如：手机、数码产品、大多数的家电 。
NON_STANDARD_GOODS：非标品，则是在这些方面没有统一的行业标准和参数规格的商品，如：服装、鞋袜等。
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
