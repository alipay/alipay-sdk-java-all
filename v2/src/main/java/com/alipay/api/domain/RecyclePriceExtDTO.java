package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:42:27
 */
public class RecyclePriceExtDTO extends AlipayObject {

	private static final long serialVersionUID = 7534214636724811294L;

	/**
	 * 价格类型
	 */
	@ApiField("price_code")
	private String priceCode;

	/**
	 * 价格类型的值，单位为元，金额超过1000就不允许小数点）
	 */
	@ApiField("price_value")
	private String priceValue;

	public String getPriceCode() {
		return this.priceCode;
	}
	public void setPriceCode(String priceCode) {
		this.priceCode = priceCode;
	}

	public String getPriceValue() {
		return this.priceValue;
	}
	public void setPriceValue(String priceValue) {
		this.priceValue = priceValue;
	}

}
