package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 结果组合
 *
 * @author auto create
 * @since 1.0, 2020-03-02 16:07:45
 */
public class ScheduleWorkItems extends AlipayObject {

	private static final long serialVersionUID = 4763612515376716187L;

	/**
	 * 统计
	 */
	@ApiListField("stats")
	@ApiField("schedule_work_stat_item")
	private List<ScheduleWorkStatItem> stats;

	/**
	 * 结果
	 */
	@ApiListField("work")
	@ApiField("schedule_work_item")
	private List<ScheduleWorkItem> work;

	public List<ScheduleWorkStatItem> getStats() {
		return this.stats;
	}
	public void setStats(List<ScheduleWorkStatItem> stats) {
		this.stats = stats;
	}

	public List<ScheduleWorkItem> getWork() {
		return this.work;
	}
	public void setWork(List<ScheduleWorkItem> work) {
		this.work = work;
	}

}
