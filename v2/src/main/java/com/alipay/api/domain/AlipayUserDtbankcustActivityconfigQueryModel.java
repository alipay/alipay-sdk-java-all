package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字分行活动配置查询接口
 *
 * @author auto create
 * @since 1.0, 2025-01-18 13:46:22
 */
public class AlipayUserDtbankcustActivityconfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5624511699595431827L;

	/**
	 * 数字分行活动唯一id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 数字分行活动类型
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 数字分行智银管家解决方案唯一id
	 */
	@ApiField("solution_id")
	private String solutionId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getSolutionId() {
		return this.solutionId;
	}
	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

}
