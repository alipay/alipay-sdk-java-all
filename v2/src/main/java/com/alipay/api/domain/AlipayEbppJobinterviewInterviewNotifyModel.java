package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回传入职状态
 *
 * @author auto create
 * @since 1.0, 2026-09-02 13:47:50
 */
public class AlipayEbppJobinterviewInterviewNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 5258669521824635791L;

	/**
	 * 人工审核 AI 面试结果原因，自由文本，不传为空
	 */
	@ApiField("ai_interview_review_reason")
	private String aiInterviewReviewReason;

	/**
	 * 人工审核 AI 面试结果,PASSED/REJECTED/PENDING;null = 未知/未审核;非空时同样限这三个值
	 */
	@ApiField("ai_interview_review_result")
	private String aiInterviewReviewResult;

	/**
	 * 候选人唯一ID（即创建会话时下发的 candidateId），空则报"候选人ID不能为空"
	 */
	@ApiField("candidate_id")
	private String candidateId;

	/**
	 * 人工面试结果原因，自由文本，不传为空
	 */
	@ApiField("manual_interview_reason")
	private String manualInterviewReason;

	/**
	 * 人工面试结果，仅支持 PASSED(通过)/REJECTED(拒绝)/PENDING(待定)，非法值直接拦截
	 */
	@ApiField("manual_interview_result")
	private String manualInterviewResult;

	/**
	 * 租户ID，接入方统一租户标识，空则报"租户ID不能为空"
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getAiInterviewReviewReason() {
		return this.aiInterviewReviewReason;
	}
	public void setAiInterviewReviewReason(String aiInterviewReviewReason) {
		this.aiInterviewReviewReason = aiInterviewReviewReason;
	}

	public String getAiInterviewReviewResult() {
		return this.aiInterviewReviewResult;
	}
	public void setAiInterviewReviewResult(String aiInterviewReviewResult) {
		this.aiInterviewReviewResult = aiInterviewReviewResult;
	}

	public String getCandidateId() {
		return this.candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

	public String getManualInterviewReason() {
		return this.manualInterviewReason;
	}
	public void setManualInterviewReason(String manualInterviewReason) {
		this.manualInterviewReason = manualInterviewReason;
	}

	public String getManualInterviewResult() {
		return this.manualInterviewResult;
	}
	public void setManualInterviewResult(String manualInterviewResult) {
		this.manualInterviewResult = manualInterviewResult;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
