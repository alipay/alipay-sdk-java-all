package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 特殊营业时间规则
 *
 * @author auto create
 * @since 1.0, 2020-08-05 20:13:51
 */
public class SpecialBusinessTimeRule extends AlipayObject {

	private static final long serialVersionUID = 1592557137862376474L;

	/**
	 * 开始日期
	 */
	@ApiField("begin_date")
	private String beginDate;

	/**
	 * 是否24小时不营业
	 */
	@ApiField("close_all_day")
	private Boolean closeAllDay;

	/**
	 * 结束日期
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 是否24小时营业
	 */
	@ApiField("open_all_day")
	private Boolean openAllDay;

	/**
	 * 当既不是24小时营业也不是24小时不营业时，具体的营业时间段
	 */
	@ApiListField("open_time_list")
	@ApiField("time_range")
	private List<TimeRange> openTimeList;

	public String getBeginDate() {
		return this.beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public Boolean getCloseAllDay() {
		return this.closeAllDay;
	}
	public void setCloseAllDay(Boolean closeAllDay) {
		this.closeAllDay = closeAllDay;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Boolean getOpenAllDay() {
		return this.openAllDay;
	}
	public void setOpenAllDay(Boolean openAllDay) {
		this.openAllDay = openAllDay;
	}

	public List<TimeRange> getOpenTimeList() {
		return this.openTimeList;
	}
	public void setOpenTimeList(List<TimeRange> openTimeList) {
		this.openTimeList = openTimeList;
	}

}
