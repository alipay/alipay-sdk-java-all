package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景变量,Map<String,String>,键值均为 String,必含键:ORDER_NO 客户侧订单号(供话术引用与业务关联)、COMPANY 企业名称、WORK_LOCATION 工作地点、JOB_TITLE 岗位名称(均话术变量);WORK_TIME 上工时间(时间基准变量,计算首次触达基准;ISO 8601;未声明或未传时尽快执行,仍受频控与呼叫时段限制);CANDIDATE_NAME 候选人姓名(话术称呼,缺则创建拒绝);CANDIDATE_PHONE 候选人手机号(外呼目标,随整报文加密传输,明文不单独字段级加密,解密后平台外呼与同号频控,接入层透传不解析);TASK_DEADLINE 任务绝对截止时间(ISO 8601,须晚于当前且不超过创建后 30 天,超则创建失败;到点未果→任务以「结果获取超时」WAIT_TIMEOUT 结束并回告);STAGE_KEY 跟进环节标识(枚举 ARRIVAL_CONFIRMATION 上工履约 / SETTLEMENT_REMINDER 催结算提醒)。
 *
 * @author auto create
 * @since 1.0, 2026-09-29 15:37:52
 */
public class FollowupCreateContext extends AlipayObject {

	private static final long serialVersionUID = 3321134789815464197L;

	/**
	 * 候选人姓名
	 */
	@ApiField("candidate_name")
	private String candidateName;

	/**
	 * 候选人手机号
	 */
	@ApiField("candidate_phone")
	private String candidatePhone;

	/**
	 * 企业名称
	 */
	@ApiField("company")
	private String company;

	/**
	 * 仓储分拣
	 */
	@ApiField("job_title")
	private String jobTitle;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 跟进环节标识
	 */
	@ApiField("stage_key")
	private String stageKey;

	/**
	 * 任务截止时间
	 */
	@ApiField("task_deadline")
	private String taskDeadline;

	/**
	 * 工作地点
	 */
	@ApiField("work_location")
	private String workLocation;

	/**
	 * 上工时间
	 */
	@ApiField("work_time")
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
