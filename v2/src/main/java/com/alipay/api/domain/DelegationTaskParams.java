package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代理授权周期任务参数
 *
 * @author auto create
 * @since 1.0, 2026-08-24 15:57:51
 */
public class DelegationTaskParams extends AlipayObject {

	private static final long serialVersionUID = 7424319839448464958L;

	/**
	 * 如15天周期内可执行3次，这里是15次，周期单元前的数据
	 */
	@ApiField("period_count")
	private String periodCount;

	/**
	 * 单周期次数（如15天周期内可执行3次，这里是3，一个周期单元可执行的次数）
	 */
	@ApiField("period_times")
	private String periodTimes;

	/**
	 * 周期单元（枚举：DAY-日、WEEK-周、MONTH-月、QUARTER-季、HALF_YEAR-半年、YEAR-年）
	 */
	@ApiField("period_unit")
	private String periodUnit;

	/**
	 * 总周期数
	 */
	@ApiField("total_periods")
	private String totalPeriods;

	public String getPeriodCount() {
		return this.periodCount;
	}
	public void setPeriodCount(String periodCount) {
		this.periodCount = periodCount;
	}

	public String getPeriodTimes() {
		return this.periodTimes;
	}
	public void setPeriodTimes(String periodTimes) {
		this.periodTimes = periodTimes;
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}
	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
	}

	public String getTotalPeriods() {
		return this.totalPeriods;
	}
	public void setTotalPeriods(String totalPeriods) {
		this.totalPeriods = totalPeriods;
	}

}
