package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 具体款式商品的价格，包含最低价与最高价
 *
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:26
 */
public class RecycleSkuPriceDTO extends AlipayObject {

	private static final long serialVersionUID = 1673373255131567722L;

	/**
	 * 最高价（单位为元，金额超过1000就不允许小数点）
	 */
	@ApiField("max_price")
	private String maxPrice;

	/**
	 * 最低价（单位为元，金额超过1000就不允许小数点）
	 */
	@ApiField("min_price")
	private String minPrice;

	public String getMaxPrice() {
		return this.maxPrice;
	}
	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getMinPrice() {
		return this.minPrice;
	}
	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

}
