package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息
 *
 * @author auto create
 * @since 1.0, 2025-01-15 15:55:20
 */
public class ItemsVO extends AlipayObject {

	private static final long serialVersionUID = 4241189824644453964L;

	/**
	 * 商品总价
	 */
	@ApiField("amount_item")
	private String amountItem;

	/**
	 * APP方商品编码，对应商品接口的sku_code｜商品编码
	 */
	@ApiField("app_item_code")
	private String appItemCode;

	/**
	 * 是否医保商品
	 */
	@ApiField("is_mi_item")
	private Long isMiItem;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品原价
	 */
	@ApiField("price_original")
	private String priceOriginal;

	/**
	 * 商品单价
	 */
	@ApiField("price_sale")
	private String priceSale;

	/**
	 * 购买数量
	 */
	@ApiField("quantity_item")
	private Long quantityItem;

	/**
	 * 货架码
	 */
	@ApiField("shelf_code")
	private String shelfCode;

	/**
	 * 商品ID
	 */
	@ApiField("sku_id")
	private Long skuId;

	/**
	 * UPC码
	 */
	@ApiField("upc")
	private String upc;

	/**
	 * 商品重量，保留小数点后3位，单位固定两种（g/ml）
	 */
	@ApiField("weight_item")
	private Long weightItem;

	/**
	 * 重量单位
	 */
	@ApiField("weight_unit")
	private String weightUnit;

	public String getAmountItem() {
		return this.amountItem;
	}
	public void setAmountItem(String amountItem) {
		this.amountItem = amountItem;
	}

	public String getAppItemCode() {
		return this.appItemCode;
	}
	public void setAppItemCode(String appItemCode) {
		this.appItemCode = appItemCode;
	}

	public Long getIsMiItem() {
		return this.isMiItem;
	}
	public void setIsMiItem(Long isMiItem) {
		this.isMiItem = isMiItem;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getPriceOriginal() {
		return this.priceOriginal;
	}
	public void setPriceOriginal(String priceOriginal) {
		this.priceOriginal = priceOriginal;
	}

	public String getPriceSale() {
		return this.priceSale;
	}
	public void setPriceSale(String priceSale) {
		this.priceSale = priceSale;
	}

	public Long getQuantityItem() {
		return this.quantityItem;
	}
	public void setQuantityItem(Long quantityItem) {
		this.quantityItem = quantityItem;
	}

	public String getShelfCode() {
		return this.shelfCode;
	}
	public void setShelfCode(String shelfCode) {
		this.shelfCode = shelfCode;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getUpc() {
		return this.upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}

	public Long getWeightItem() {
		return this.weightItem;
	}
	public void setWeightItem(Long weightItem) {
		this.weightItem = weightItem;
	}

	public String getWeightUnit() {
		return this.weightUnit;
	}
	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

}
