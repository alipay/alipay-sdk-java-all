package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 价格类型对应的价格值
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:42:27
 */
public class RecyclePriceDTO extends AlipayObject {

	private static final long serialVersionUID = 2173993257195699564L;

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

	/**
	 * 准确价（单位为元，金额超过1000就不允许小数点）
	 */
	@ApiField("sale_price")
	private String salePrice;

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

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

}
