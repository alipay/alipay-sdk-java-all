package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阶梯价格
 *
 * @author auto create
 * @since 1.0, 2026-07-31 14:24:03
 */
public class CardPeriodPrice extends AlipayObject {

	private static final long serialVersionUID = 6619251612289431721L;

	/**
	 * 阶梯价格的新客价，单位分，表示这一期的新客价。新客价需是所有价格中最低的价格。
	 */
	@ApiField("new_customer_price")
	private Long newCustomerPrice;

	/**
	 * 原价，单位分。
字段值需要大于或等于sale_price。
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 期数，根据cycle_type确定单位，如周，天，月
	 */
	@ApiField("period")
	private Long period;

	/**
	 * 售价，单位分
	 */
	@ApiField("sale_price")
	private Long salePrice;

	public Long getNewCustomerPrice() {
		return this.newCustomerPrice;
	}
	public void setNewCustomerPrice(Long newCustomerPrice) {
		this.newCustomerPrice = newCustomerPrice;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Long getPeriod() {
		return this.period;
	}
	public void setPeriod(Long period) {
		this.period = period;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

}
