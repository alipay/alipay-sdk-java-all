package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收价格信息
 *
 * @author auto create
 * @since 1.0, 2025-07-02 14:41:25
 */
public class RecyclePriceInfo extends AlipayObject {

	private static final long serialVersionUID = 3264814411176977463L;

	/**
	 * 固定价价格
	 */
	@ApiField("assess_amount")
	private String assessAmount;

	/**
	 * 最高价
	 */
	@ApiField("max_price")
	private String maxPrice;

	/**
	 * 最小价
	 */
	@ApiField("min_price")
	private String minPrice;

	/**
	 * 价格code
	 */
	@ApiField("price_code")
	private String priceCode;

	public String getAssessAmount() {
		return this.assessAmount;
	}
	public void setAssessAmount(String assessAmount) {
		this.assessAmount = assessAmount;
	}

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

	public String getPriceCode() {
		return this.priceCode;
	}
	public void setPriceCode(String priceCode) {
		this.priceCode = priceCode;
	}

}
