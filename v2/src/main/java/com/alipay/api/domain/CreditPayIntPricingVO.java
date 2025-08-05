package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 信用支付利息定价
 *
 * @author auto create
 * @since 1.0, 2022-01-13 16:22:04
 */
public class CreditPayIntPricingVO extends AlipayObject {

	private static final long serialVersionUID = 5499851383239731221L;

	/**
	 * 实际日利率，百分比形式
	 */
	@ApiField("actual_day_int_rate")
	private String actualDayIntRate;

	/**
	 * 实际利息，单位元
	 */
	@ApiField("actual_int")
	private String actualInt;

	/**
	 * 实际利率，小数形式
	 */
	@ApiField("actual_int_rate")
	private String actualIntRate;

	/**
	 * 分段利率
	 */
	@ApiListField("day_range_pricing_list")
	@ApiField("credit_pay_day_range_pricing_v_o")
	private List<CreditPayDayRangePricingVO> dayRangePricingList;

	/**
	 * 原始日利率，百分比形式
	 */
	@ApiField("origin_day_int_rate")
	private String originDayIntRate;

	/**
	 * 原始利息，单位元
	 */
	@ApiField("origin_int")
	private String originInt;

	/**
	 * 原始利率，小数形式
	 */
	@ApiField("origin_int_rate")
	private String originIntRate;

	public String getActualDayIntRate() {
		return this.actualDayIntRate;
	}
	public void setActualDayIntRate(String actualDayIntRate) {
		this.actualDayIntRate = actualDayIntRate;
	}

	public String getActualInt() {
		return this.actualInt;
	}
	public void setActualInt(String actualInt) {
		this.actualInt = actualInt;
	}

	public String getActualIntRate() {
		return this.actualIntRate;
	}
	public void setActualIntRate(String actualIntRate) {
		this.actualIntRate = actualIntRate;
	}

	public List<CreditPayDayRangePricingVO> getDayRangePricingList() {
		return this.dayRangePricingList;
	}
	public void setDayRangePricingList(List<CreditPayDayRangePricingVO> dayRangePricingList) {
		this.dayRangePricingList = dayRangePricingList;
	}

	public String getOriginDayIntRate() {
		return this.originDayIntRate;
	}
	public void setOriginDayIntRate(String originDayIntRate) {
		this.originDayIntRate = originDayIntRate;
	}

	public String getOriginInt() {
		return this.originInt;
	}
	public void setOriginInt(String originInt) {
		this.originInt = originInt;
	}

	public String getOriginIntRate() {
		return this.originIntRate;
	}
	public void setOriginIntRate(String originIntRate) {
		this.originIntRate = originIntRate;
	}

}
