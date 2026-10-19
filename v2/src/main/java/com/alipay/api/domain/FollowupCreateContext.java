package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景扩展变量，类型为 Map<String, String>，键和值均为字符串。调用方可根据场景传入键值对；具体支持的字段及其含义，以对应场景的线下 DSL 配置为准。
 *
 * @author auto create
 * @since 1.0, 2026-10-15 14:51:55
 */
public class FollowupCreateContext extends AlipayObject {

	private static final long serialVersionUID = 6527244362484625345L;

	/**
	 * 候选人姓名 当前字段已废弃(废弃历史字段,内部字段由三方自定义)
	 */
	@ApiField("candidate_name")
	@Deprecated
	private String candidateName;

	/**
	 * 候选人手机号 当前字段已废弃(废弃历史字段,内部字段由三方自定义)
	 */
	@ApiField("candidate_phone")
	@Deprecated
	private String candidatePhone;

	/**
	 * 企业名称 当前字段已废弃(废弃历史字段,内部字段由三方自定义)
	 */
	@ApiField("company")
	@Deprecated
	private String company;

	/**
	 * 仓储分拣 当前字段已废弃(废弃历史字段,内部字段由三方自定义)
	 */
	@ApiField("job_title")
	@Deprecated
	private String jobTitle;

	/**
	 * 订单号 当前字段已废弃(废弃历史字段,内部字段由三方自定义)
	 */
	@ApiField("order_no")
	@Deprecated
	private String orderNo;

	/**
	 * 跟进环节标识 当前字段已废弃(废弃历史字段,内部字段由三方自定义)
	 */
	@ApiField("stage_key")
	@Deprecated
	private String stageKey;

	/**
	 * 任务截止时间 当前字段已废弃(废弃历史字段,内部字段由三方自定义)
	 */
	@ApiField("task_deadline")
	@Deprecated
	private String taskDeadline;

	/**
	 * 工作地点 当前字段已废弃(废弃历史字段,内部字段由三方自定义)
	 */
	@ApiField("work_location")
	@Deprecated
	private String workLocation;

	/**
	 * 上工时间 当前字段已废弃(废弃历史字段,内部字段由三方自定义)
	 */
	@ApiField("work_time")
	@Deprecated
	private String workTime;

	public String getCandidateName() {
		return this.candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getCandidatePhone() {
		return this.candidatePhone;
	}
	public void setCandidatePhone(String candidatePhone) {
		this.candidatePhone = candidatePhone;
	}

	public String getCompany() {
		return this.company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getStageKey() {
		return this.stageKey;
	}
	public void setStageKey(String stageKey) {
		this.stageKey = stageKey;
	}

	public String getTaskDeadline() {
		return this.taskDeadline;
	}
	public void setTaskDeadline(String taskDeadline) {
		this.taskDeadline = taskDeadline;
	}

	public String getWorkLocation() {
		return this.workLocation;
	}
	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}

	public String getWorkTime() {
		return this.workTime;
	}
	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}

}
