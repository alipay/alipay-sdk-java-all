package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店商品全量快照，传入空列表会下架所有商品。
 *
 * @author auto create
 * @since 1.0, 2026-09-17 14:22:32
 */
public class ProductList extends AlipayObject {

	private static final long serialVersionUID = 4285152529827579162L;

	/**
	 * 商品折扣价，单位为元。
	 */
	@ApiField("discount_price")
	private String discountPrice;

	/**
	 * 商品标价，单位为元。
	 */
	@ApiField("listed_price")
	private String listedPrice;

	/**
	 * 商品价格单位。
	 */
	@ApiField("price_unit")
	private String priceUnit;

	/**
	 * 商品 SKU 编码。
	 */
	@ApiField("sku_code")
	private String skuCode;

	public String getDiscountPrice() {
		return this.discountPrice;
	}
	public void setDiscountPrice(String discountPrice) {
		this.discountPrice = discountPrice;
	}

	public String getListedPrice() {
		return this.listedPrice;
	}
	public void setListedPrice(String listedPrice) {
		this.listedPrice = listedPrice;
	}

	public String getPriceUnit() {
		return this.priceUnit;
	}
	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}

	public String getSkuCode() {
		return this.skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

}
