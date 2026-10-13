package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建AI跟进任务
 *
 * @author auto create
 * @since 1.0, 2026-09-29 15:37:52
 */
public class AlipayCommerceCareerOpenbaseFollowupCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5582852218336615264L;

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
	 * 场景变量,Map<String,String>,键值均为 String,必含键:ORDER_NO 客户侧订单号(供话术引用与业务关联)、COMPANY 企业名称、WORK_LOCATION 工作地点、JOB_TITLE 岗位名称(均话术变量);WORK_TIME 上工时间(时间基准变量,计算首次触达基准;ISO 8601;未声明或未传时尽快执行,仍受频控与呼叫时段限制);CANDIDATE_NAME 候选人姓名(话术称呼,缺则创建拒绝);CANDIDATE_PHONE 候选人手机号(外呼目标,随整报文加密传输,明文不单独字段级加密,解密后平台外呼与同号频控,接入层透传不解析);TASK_DEADLINE 任务绝对截止时间(ISO 8601,须晚于当前且不超过创建后 30 天,超则创建失败;到点未果→任务以「结果获取超时」WAIT_TIMEOUT 结束并回告);STAGE_KEY 跟进环节标识(枚举 ARRIVAL_CONFIRMATION 上工履约 / SETTLEMENT_REMINDER 催结算提醒)。
	 */
	@ApiField("context")
	private FollowupCreateContext context;

	/**
	 * 任务截止时间
	 */
	@ApiField("deadline")
	private String deadline;

	/**
	 * 客户业务单号,appId 下唯一,作为创建幂等键;1~64 位英文字母与数字(纯数字可用、不强制),勿用下划线等符号。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 线下提供的可用方案 ID。
	 */
	@ApiField("plan_id")
	private String planId;

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

	public FollowupCreateContext getContext() {
		return this.context;
	}
	public void setContext(FollowupCreateContext context) {
		this.context = context;
	}

	public String getDeadline() {
		return this.deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

}
