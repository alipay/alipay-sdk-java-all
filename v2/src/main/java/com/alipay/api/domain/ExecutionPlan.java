package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 周期扣还款计划
 *
 * @author auto create
 * @since 1.0, 2024-06-25 15:31:36
 */
public class ExecutionPlan extends AlipayObject {

	private static final long serialVersionUID = 5121615889284225444L;

	/**
	 * 周期扣预期执行时间
	 */
	@ApiField("execute_time")
	private String executeTime;

	/**
	 * 周期扣执行计划最晚执行时间
	 */
	@ApiField("latest_execute_time")
	private String latestExecuteTime;

	/**
	 * 周期扣期数
	 */
	@ApiField("period_id")
	private String periodId;

	/**
	 * 周期扣中单笔金额，单位是元
	 */
	@ApiField("single_amount")
	private String singleAmount;

	public String getExecuteTime() {
		return this.executeTime;
	}
	public void setExecuteTime(String executeTime) {
		this.executeTime = executeTime;
	}

	public String getLatestExecuteTime() {
		return this.latestExecuteTime;
	}
	public void setLatestExecuteTime(String latestExecuteTime) {
		this.latestExecuteTime = latestExecuteTime;
	}

	public String getPeriodId() {
		return this.periodId;
	}
	public void setPeriodId(String periodId) {
		this.periodId = periodId;
	}

	public String getSingleAmount() {
		return this.singleAmount;
	}
	public void setSingleAmount(String singleAmount) {
		this.singleAmount = singleAmount;
	}

}
