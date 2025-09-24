package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退款商品信息
 *
 * @author auto create
 * @since 1.0, 2025-01-15 15:54:54
 */
public class RefundItemVO extends AlipayObject {

	private static final long serialVersionUID = 4397372528661417623L;

	/**
	 * 商品总金额：单位：元
	 */
	@ApiField("amount_item")
	private String amountItem;

	/**
	 * APP方商品编码，对应商品接口的sku_code｜商品编码
	 */
	@ApiField("app_item_code")
	private String appItemCode;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 不包含优惠的商品原价，单位：元
	 */
	@ApiField("price_original")
	private String priceOriginal;

	/**
	 * 优惠后的商品价格，单位：元
	 */
	@ApiField("price_sale")
	private String priceSale;

	/**
	 * 商品数量
	 */
	@ApiField("quantity_item")
	private Long quantityItem;

	/**
	 * 商品SKU
	 */
	@ApiField("sku_id")
	private String skuId;

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

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
