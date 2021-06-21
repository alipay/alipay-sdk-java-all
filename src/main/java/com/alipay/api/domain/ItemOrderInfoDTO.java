package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户商品信息列表; 电子小票场景时，必填
 *
 * @author auto create
 * @since 1.0, 2021-06-16 15:17:07
 */
public class ItemOrderInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7189313831121934435L;

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
	 * 商品名称; 充电宝时，必填
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品数量(单位:自拟);充电宝时，必填
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 商品 sku id
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 商品单价(单位:元);充电宝时，必填
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

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
