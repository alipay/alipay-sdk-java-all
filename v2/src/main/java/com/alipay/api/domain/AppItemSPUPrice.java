package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品SPU价格
 *
 * @author auto create
 * @since 1.0, 2023-03-07 10:15:00
 */
public class AppItemSPUPrice extends AlipayObject {

	private static final long serialVersionUID = 7731698974545894719L;

	/**
	 * 标识该SPU商品是否含有价格
	 */
	@ApiField("has_price")
	private Boolean hasPrice;

	/**
	 * 商品原价的最高值
	 */
	@ApiField("original_price_max")
	private String originalPriceMax;

	/**
	 * 原价的最低值
	 */
	@ApiField("original_price_min")
	private String originalPriceMin;

	/**
	 * 标识该SPU商品的最高价格
	 */
	@ApiField("price_max")
	private String priceMax;

	/**
	 * 标识该SPU商品是否有价格
	 */
	@ApiField("price_min")
	private Long priceMin;

	/**
	 * 价格单元，选填
	 */
	@ApiField("price_unit")
	private String priceUnit;

	public Boolean getHasPrice() {
		return this.hasPrice;
	}
	public void setHasPrice(Boolean hasPrice) {
		this.hasPrice = hasPrice;
	}

	public String getOriginalPriceMax() {
		return this.originalPriceMax;
	}
	public void setOriginalPriceMax(String originalPriceMax) {
		this.originalPriceMax = originalPriceMax;
	}

	public String getOriginalPriceMin() {
		return this.originalPriceMin;
	}
	public void setOriginalPriceMin(String originalPriceMin) {
		this.originalPriceMin = originalPriceMin;
	}

	public String getPriceMax() {
		return this.priceMax;
	}
	public void setPriceMax(String priceMax) {
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
