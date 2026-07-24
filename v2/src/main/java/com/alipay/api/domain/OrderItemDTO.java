package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-09 17:57:52
 */
public class OrderItemDTO extends AlipayObject {

	private static final long serialVersionUID = 4874782422824994164L;

	/**
	 * 小计金额（单位：元，必须为两位小数点的正数，建议 unit_price x quantity，如 99.90）
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 商品ID（家空间商品ID）
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品图片URL，如果不穿则先与接口开发者沟通
	 */
	@ApiField("item_image")
	private String itemImage;

	/**
	 * 商品名称，
无商品名称可将SKU名称传入
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 购买数量,（单位：件)
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * SKU ID
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * SKU名称,
无SKU名称可将商品名称传入
	 */
	@ApiField("sku_name")
	private String skuName;

	/**
	 * 商品单价（单位：元，必须为两位小数点的正数，如 49.95）
	 */
	@ApiField("unit_price")
	private String unitPrice;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemImage() {
		return this.itemImage;
	}
	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
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

	public String getSkuName() {
		return this.skuName;
	}
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
