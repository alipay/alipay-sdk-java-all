package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 促销SKU对象
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:29
 */
public class DiscountSkuBean extends AlipayObject {

	private static final long serialVersionUID = 6443146383819825728L;

	/**
	 * 活动对象
	 */
	@ApiField("activity")
	private DiscountActivityBean activity;

	/**
	 * 库存
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
	 * 规格值，非可度量参数
	 */
	@ApiField("spec_value")
	private String specValue;

	public DiscountActivityBean getActivity() {
		return this.activity;
	}
	public void setActivity(DiscountActivityBean activity) {
		this.activity = activity;
	}

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
