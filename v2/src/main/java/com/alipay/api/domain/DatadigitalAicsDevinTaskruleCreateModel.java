package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建外呼规则
 *
 * @author auto create
 * @since 1.0, 2026-09-10 15:45:05
 */
public class DatadigitalAicsDevinTaskruleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2359211793774318257L;

	/**
	 * 是否启用：0-开启 1-关闭
	 */
	@ApiField("enable_flag")
	private Long enableFlag;

	/**
	 * 失效时间，格式yyyy-MM-dd
	 */
	@ApiField("invalid_time")
	private Date invalidTime;

	/**
	 * 备注
	 */
	@ApiField("remarks")
	private String remarks;

	/**
	 * 定时任务执行时间区间(结束)，格式HH:mm
	 */
	@ApiField("schedule_end_time")
	private String scheduleEndTime;

	/**
	 * 定时任务执行区间(开始)，格式HH:mm
	 */
	@ApiField("schedule_start_time")
	private String scheduleStartTime;

	/**
	 * 生效时间，格式yyyy-MM-dd
	 */
	@ApiField("take_effect_time")
	private Date takeEffectTime;

	/**
	 * 任务规则详情(JSON字符串，含timeZone/scheduleTimeRange等)
	 */
	@ApiField("task_rules_detail")
	private String taskRulesDetail;

	/**
	 * 规则名称
	 */
	@ApiField("task_rules_name")
	private String taskRulesName;

	/**
	 * 租户ID
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public Long getEnableFlag() {
		return this.enableFlag;
	}
	public void setEnableFlag(Long enableFlag) {
		this.enableFlag = enableFlag;
	}

	public Date getInvalidTime() {
		return this.invalidTime;
	}
	public void setInvalidTime(Date invalidTime) {
		this.invalidTime = invalidTime;
	}

	public String getRemarks() {
		return this.remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getScheduleEndTime() {
		return this.scheduleEndTime;
	}
	public void setScheduleEndTime(String scheduleEndTime) {
		this.scheduleEndTime = scheduleEndTime;
	}

	public String getScheduleStartTime() {
		return this.scheduleStartTime;
	}
	public void setScheduleStartTime(String scheduleStartTime) {
		this.scheduleStartTime = scheduleStartTime;
	}

	public Date getTakeEffectTime() {
		return this.takeEffectTime;
	}
	public void setTakeEffectTime(Date takeEffectTime) {
		this.takeEffectTime = takeEffectTime;
	}

	public String getTaskRulesDetail() {
		return this.taskRulesDetail;
	}
	public void setTaskRulesDetail(String taskRulesDetail) {
		this.taskRulesDetail = taskRulesDetail;
	}

	public String getTaskRulesName() {
		return this.taskRulesName;
	}
	public void setTaskRulesName(String taskRulesName) {
		this.taskRulesName = taskRulesName;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
