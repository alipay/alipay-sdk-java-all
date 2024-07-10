package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品价格单元
 *
 * @author auto create
 * @since 1.0, 2023-03-23 11:00:07
 */
public class AppItemSPUPriceVO extends AlipayObject {

	private static final long serialVersionUID = 5333978385845846577L;

	/**
	 * 表示是否有价格，true有，false无
	 */
	@ApiField("has_price")
	private Boolean hasPrice;

	/**
	 * 商品原价
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 商品原价最高值
	 */
	@ApiField("original_price_max")
	private Long originalPriceMax;

	/**
	 * 商品原价最低值
	 */
	@ApiField("original_price_min")
	private Long originalPriceMin;

	/**
	 * 商品售卖价格
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 商品最高售卖价格
	 */
	@ApiField("price_max")
	private Long priceMax;

	/**
	 * 商品最低售卖价格
	 */
	@ApiField("price_min")
	private Long priceMin;

	/**
	 * 商品价格单元
	 */
	@ApiField("price_unit")
	private String priceUnit;

	public Boolean getHasPrice() {
		return this.hasPrice;
	}
	public void setHasPrice(Boolean hasPrice) {
		this.hasPrice = hasPrice;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Long getOriginalPriceMax() {
		return this.originalPriceMax;
	}
	public void setOriginalPriceMax(Long originalPriceMax) {
		this.originalPriceMax = originalPriceMax;
	}

	public Long getOriginalPriceMin() {
		return this.originalPriceMin;
	}
	public void setOriginalPriceMin(Long originalPriceMin) {
		this.originalPriceMin = originalPriceMin;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getPriceMax() {
		return this.priceMax;
	}
	public void setPriceMax(Long priceMax) {
		this.priceMax = priceMax;
	}

	public Long getPriceMin() {
		return this.priceMin;
	}
	public void setPriceMin(Long priceMin) {
		this.priceMin = priceMin;
	}

	public String getPriceUnit() {
		return this.priceUnit;
	}
	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}

}
