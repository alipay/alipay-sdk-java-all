package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 预点餐点餐设置中自提时段配置模型
 *
 * @author auto create
 * @since 1.0, 2020-08-06 19:27:43
 */
public class TimePeriodConfig extends AlipayObject {

	private static final long serialVersionUID = 4738544813889458519L;

	/**
	 * 自提时段列表，包含时段开始时间和结束时间
	 */
	@ApiListField("time_period_list")
	@ApiField("time_period")
	private List<TimePeriod> timePeriodList;

	/**
	 * 1-7分别表示周一到周日
	 */
	@ApiField("week")
	private String week;

	public List<TimePeriod> getTimePeriodList() {
		return this.timePeriodList;
	}
	public void setTimePeriodList(List<TimePeriod> timePeriodList) {
		this.timePeriodList = timePeriodList;
	}

	public String getWeek() {
		return this.week;
	}
	public void setWeek(String week) {
		this.week = week;
	}

}
