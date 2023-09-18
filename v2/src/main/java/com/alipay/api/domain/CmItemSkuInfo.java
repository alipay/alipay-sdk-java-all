package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品SKU数据模型
 *
 * @author auto create
 * @since 1.0, 2019-09-06 10:27:32
 */
public class CmItemSkuInfo extends AlipayObject {

	private static final long serialVersionUID = 6135324749276493357L;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 库存
	 */
	@ApiField("inventory")
	private Long inventory;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 素材列表
	 */
	@ApiListField("material_list")
	@ApiField("material_info")
	private List<MaterialInfo> materialList;

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
	 * 剩余库存
	 */
	@ApiField("remain_inventory")
	private Long remainInventory;

	/**
	 * 商品SKU ID
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * SKU属性列表
	 */
	@ApiListField("sku_property_list")
	@ApiField("item_sku_property_info")
	private List<ItemSkuPropertyInfo> skuPropertyList;

	/**
	 * 商品SKU状态：
EFFECT(有效)、
INVALID（无效）
	 */
	@ApiField("status")
	private String status;

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

	public Long getInventory() {
		return this.inventory;
	}
	public void setInventory(Long inventory) {
		this.inventory = inventory;
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

	public Long getRemainInventory() {
		return this.remainInventory;
	}
	public void setRemainInventory(Long remainInventory) {
		this.remainInventory = remainInventory;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public List<ItemSkuPropertyInfo> getSkuPropertyList() {
		return this.skuPropertyList;
	}
	public void setSkuPropertyList(List<ItemSkuPropertyInfo> skuPropertyList) {
		this.skuPropertyList = skuPropertyList;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
