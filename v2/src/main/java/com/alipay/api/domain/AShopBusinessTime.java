package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营业时间
 *
 * @author auto create
 * @since 1.0, 2025-10-23 10:09:27
 */
public class AShopBusinessTime extends AlipayObject {

	private static final long serialVersionUID = 5553535186249169537L;

	/**
	 * 经营日期
	 */
	@ApiListField("days")
	@ApiField("string")
	private List<String> days;

	/**
	 * 是否24小时营业
	 */
	@ApiField("open_24_hours")
	private Boolean open24Hours;

	/**
	 * 营业时间
	 */
	@ApiListField("times")
	@ApiField("shop_time_period")
	private List<ShopTimePeriod> times;

	public List<String> getDays() {
		return this.days;
	}
	public void setDays(List<String> days) {
		this.days = days;
	}

	public Boolean getOpen24Hours() {
		return this.open24Hours;
	}
	public void setOpen24Hours(Boolean open24Hours) {
		this.open24Hours = open24Hours;
	}

	public List<ShopTimePeriod> getTimes() {
		return this.times;
	}
	public void setTimes(List<ShopTimePeriod> times) {
		this.times = times;
	}

}
