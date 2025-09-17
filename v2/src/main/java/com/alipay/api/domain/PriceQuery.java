package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * PriceQueryModel
 *
 * @author auto create
 * @since 1.0, 2023-07-12 17:02:45
 */
public class PriceQuery extends AlipayObject {

	private static final long serialVersionUID = 8239788117927944628L;

	/**
	 * 11
	 */
	@ApiField("price")
	private String price;

	/**
	 * 单位：元
	 */
	@ApiField("unit")
	private String unit;

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
