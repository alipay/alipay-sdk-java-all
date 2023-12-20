package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动时间信息
 *
 * @author auto create
 * @since 1.0, 2023-06-20 18:17:36
 */
public class DtBankActivityTimeInfo extends AlipayObject {

	private static final long serialVersionUID = 5323548732513916224L;

	/**
	 * 活动开始时间
	 */
	@ApiField("begin_time")
	private Date beginTime;

	/**
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 活动时间区间列表，表示单日内活动时间区间。
	 */
	@ApiListField("time_period_list")
	@ApiField("string")
	private List<String> timePeriodList;

	/**
	 * 活动时间日列表。例如["MON","TUE","WEB"]表示周一、周二、周三可以参与活动。周一至周日分别使用以下字符串表示：MON，TUE，WEB，THU，FRI，SAT，SUN。
	 */
	@ApiListField("week_day_list")
	@ApiField("string")
	private List<String> weekDayList;

	public Date getBeginTime() {
		return this.beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public List<String> getTimePeriodList() {
		return this.timePeriodList;
	}
	public void setTimePeriodList(List<String> timePeriodList) {
		this.timePeriodList = timePeriodList;
	}

	public List<String> getWeekDayList() {
		return this.weekDayList;
	}
	public void setWeekDayList(List<String> weekDayList) {
		this.weekDayList = weekDayList;
	}

}
