package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店经营时间
 *
 * @author auto create
 * @since 1.0, 2025-10-23 19:42:30
 */
public class GroupPurchaseBusinessTime extends AlipayObject {

	private static final long serialVersionUID = 8146643266582622785L;

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
	@ApiField("group_purchase_time_period")
	private List<GroupPurchaseTimePeriod> times;

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

	public List<GroupPurchaseTimePeriod> getTimes() {
		return this.times;
	}
	public void setTimes(List<GroupPurchaseTimePeriod> times) {
		this.times = times;
	}

}
