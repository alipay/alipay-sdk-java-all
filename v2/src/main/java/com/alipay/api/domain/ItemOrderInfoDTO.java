package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户商品信息列表; 电子小票场景时，必填
 *
 * @author auto create
 * @since 1.0, 2024-01-11 20:38:33
 */
public class ItemOrderInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4344571789125265799L;

	/**
	 * 商品条形码
	 */
	@ApiField("barcode")
	private String barcode;

	/**
	 * 商品 id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品数量（单位：自拟）
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 商品数量（精度: 小数点后三位），使用商品功能时必填
	 */
	@ApiField("quantity_dec")
	private String quantityDec;

	/**
	 * 商品 sku id
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 商品销售总价（精度: 小数点后两位，单位：元），使用商品功能必填
	 */
	@ApiField("sku_total_price")
	private String skuTotalPrice;

	/**
	 * 商品单价（单位: 元）
	 */
	@ApiField("unit_price")
	private String unitPrice;

	public String getBarcode() {
		return this.barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
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

	public String getQuantityDec() {
		return this.quantityDec;
	}
	public void setQuantityDec(String quantityDec) {
		this.quantityDec = quantityDec;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSkuTotalPrice() {
		return this.skuTotalPrice;
	}
	public void setSkuTotalPrice(String skuTotalPrice) {
		this.skuTotalPrice = skuTotalPrice;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
