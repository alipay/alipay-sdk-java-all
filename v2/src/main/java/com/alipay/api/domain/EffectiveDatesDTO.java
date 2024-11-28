package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 价格日历
 *
 * @author auto create
 * @since 1.0, 2023-12-10 23:37:17
 */
public class EffectiveDatesDTO extends AlipayObject {

	private static final long serialVersionUID = 4119123593392228827L;

	/**
	 * 价格日期 yyyyMMdd
	 */
	@ApiField("date")
	private String date;

	/**
	 * 商品单价，单位元
	 */
	@ApiField("price")
	private String price;

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
