package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品价格扩展
 *
 * @author auto create
 * @since 1.0, 2025-03-31 10:58:21
 */
public class RecyclePriceExtDTO extends AlipayObject {

	private static final long serialVersionUID = 1441482969746586286L;

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
