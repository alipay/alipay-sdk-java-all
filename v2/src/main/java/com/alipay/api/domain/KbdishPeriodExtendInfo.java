package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 有效时间扩展模型
 *
 * @author auto create
 * @since 1.0, 2020-12-10 14:08:02
 */
public class KbdishPeriodExtendInfo extends AlipayObject {

	private static final long serialVersionUID = 3747184537447848838L;

	/**
	 * 结束日期
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 起始日期
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 时间段规则
	 */
	@ApiListField("time_range_list")
	@ApiField("kbdish_time_range_info")
	private List<KbdishTimeRangeInfo> timeRangeList;

	/**
	 * 周规则(1-7数字，用逗号隔开)
	 */
	@ApiField("weeks")
	private String weeks;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public List<KbdishTimeRangeInfo> getTimeRangeList() {
		return this.timeRangeList;
	}
	public void setTimeRangeList(List<KbdishTimeRangeInfo> timeRangeList) {
		this.timeRangeList = timeRangeList;
	}

	public String getWeeks() {
		return this.weeks;
	}
	public void setWeeks(String weeks) {
		this.weeks = weeks;
	}

}
