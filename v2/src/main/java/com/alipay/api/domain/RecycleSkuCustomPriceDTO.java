package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:42:27
 */
public class RecycleSkuCustomPriceDTO extends AlipayObject {

	private static final long serialVersionUID = 2623788979571263158L;

	/**
	 * 自定义价格类型
	 */
	@ApiField("price_code")
	private String priceCode;

	/**
	 * 价格类型对应的价格值
	 */
	@ApiField("price_value")
	private RecyclePriceDTO priceValue;

	public String getPriceCode() {
		return this.priceCode;
	}
	public void setPriceCode(String priceCode) {
		this.priceCode = priceCode;
	}

	public RecyclePriceDTO getPriceValue() {
		return this.priceValue;
	}
	public void setPriceValue(RecyclePriceDTO priceValue) {
		this.priceValue = priceValue;
	}

}
