package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * OpenApiDailyScheduleVO
 *
 * @author auto create
 * @since 1.0, 2022-05-24 19:20:31
 */
public class OpenApiDailyScheduleVO extends AlipayObject {

	private static final long serialVersionUID = 6136468828429564296L;

	/**
	 * 单天行程ID
	 */
	@ApiField("daily_schedule_id")
	private String dailyScheduleId;

	/**
	 * 日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 用户自定义
	 */
	@ApiField("name")
	private String name;

	/**
	 * 是否超出长度
	 */
	@ApiField("over_limit")
	private Boolean overLimit;

	/**
	 * 环节列表
	 */
	@ApiListField("step_list")
	@ApiField("string")
	private List<String> stepList;

	public String getDailyScheduleId() {
		return this.dailyScheduleId;
	}
	public void setDailyScheduleId(String dailyScheduleId) {
		this.dailyScheduleId = dailyScheduleId;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getOverLimit() {
		return this.overLimit;
	}
	public void setOverLimit(Boolean overLimit) {
		this.overLimit = overLimit;
	}

	public List<String> getStepList() {
		return this.stepList;
	}
	public void setStepList(List<String> stepList) {
		this.stepList = stepList;
	}

}
