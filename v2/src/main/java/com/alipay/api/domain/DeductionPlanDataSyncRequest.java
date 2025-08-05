package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扣款计划数据同步请求模型
 *
 * @author auto create
 * @since 1.0, 2025-03-11 21:15:17
 */
public class DeductionPlanDataSyncRequest extends AlipayObject {

	private static final long serialVersionUID = 3697222845111476993L;

	/**
	 * 课时数（电教馆教培特有）,单位个，表示有1个课时
	 */
	@ApiField("class_hours")
	private Long classHours;

	/**
	 * 扣款计划创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 实际扣款金额（单位元）
	 */
	@ApiField("deduction_amount")
	private String deductionAmount;

	/**
	 * 扣款计划id
	 */
	@ApiField("deduction_plan_id")
	private String deductionPlanId;

	/**
	 * 扣款计划状态
	 */
	@ApiField("deduction_plan_status")
	private String deductionPlanStatus;

	/**
	 * 原金额（单位元）
	 */
	@ApiField("original_amount")
	private String originalAmount;

	/**
	 * 期数，具体数值，如1表示第1期
	 */
	@ApiField("period")
	private String period;

	/**
	 * 计划扣款日期
	 */
	@ApiField("plan_deduction_time")
	private Date planDeductionTime;

	/**
	 * 扣款计划更新时间
	 */
	@ApiField("update_time")
	private Date updateTime;

	public Long getClassHours() {
		return this.classHours;
	}
	public void setClassHours(Long classHours) {
		this.classHours = classHours;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDeductionAmount() {
		return this.deductionAmount;
	}
	public void setDeductionAmount(String deductionAmount) {
		this.deductionAmount = deductionAmount;
	}

	public String getDeductionPlanId() {
		return this.deductionPlanId;
	}
	public void setDeductionPlanId(String deductionPlanId) {
		this.deductionPlanId = deductionPlanId;
	}

	public String getDeductionPlanStatus() {
		return this.deductionPlanStatus;
	}
	public void setDeductionPlanStatus(String deductionPlanStatus) {
		this.deductionPlanStatus = deductionPlanStatus;
	}

	public String getOriginalAmount() {
		return this.originalAmount;
	}
	public void setOriginalAmount(String originalAmount) {
		this.originalAmount = originalAmount;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public Date getPlanDeductionTime() {
		return this.planDeductionTime;
	}
	public void setPlanDeductionTime(Date planDeductionTime) {
		this.planDeductionTime = planDeductionTime;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
