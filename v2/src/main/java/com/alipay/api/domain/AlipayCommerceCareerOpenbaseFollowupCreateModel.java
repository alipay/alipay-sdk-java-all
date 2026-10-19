package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI跟进-创建任务
 *
 * @author auto create
 * @since 1.0, 2026-10-15 14:51:55
 */
public class AlipayCommerceCareerOpenbaseFollowupCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8194952973719616986L;

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
	 * 场景扩展变量，类型为 Map<String, String>，键和值均为字符串。调用方可根据场景传入键值对；具体支持的字段及其含义，以对应场景的线下 DSL 配置为准。
	 */
	@ApiField("context")
	private FollowupCreateContext context;

	/**
	 * 任务截止时间
	 */
	@ApiField("deadline")
	private String deadline;

	/**
	 * 三方业务单号,appId 下唯一,作为创建幂等键;1~64 位英文字母与数字(纯数字可用、不强制),勿用下划线等符号。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 由支付宝的对接人提供的 跟进场景ID标识
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
