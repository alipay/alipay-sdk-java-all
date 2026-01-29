package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品查询结果origin_sku对象
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:29
 */
public class OriginSkuBean extends AlipayObject {

	private static final long serialVersionUID = 5117816545516797447L;

	/**
	 * 库存对象
	 */
	@ApiField("inventory")
	private InventoryBean inventory;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 价格，单位：元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 数量，单位：个/份
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 商品sku
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 规格名称
	 */
	@ApiField("spec_name")
	private String specName;

	/**
	 * 规格值，无单位概念
	 */
	@ApiField("spec_value")
	private String specValue;

	public InventoryBean getInventory() {
		return this.inventory;
	}
	public void setInventory(InventoryBean inventory) {
		this.inventory = inventory;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSpecName() {
		return this.specName;
	}
	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public String getSpecValue() {
		return this.specValue;
	}
	public void setSpecValue(String specValue) {
		this.specValue = specValue;
	}

}
