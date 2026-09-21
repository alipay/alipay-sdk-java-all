package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jobinterview.interview.notify response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-02 13:47:50
 */
public class AlipayEbppJobinterviewInterviewNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5577813252657757258L;

	/** 
	 * 候选人唯一ID（即创建会话时下发的 candidateId），空则报"候选人ID不能为空"
	 */
	@ApiField("candidate_id")
	private Boolean candidateId;

	/** 
	 * 人工面试结果，仅支持 PASSED(通过)/REJECTED(拒绝)/PENDING(待定)，非法值直接拦截
	 */
	@ApiField("manual_interview_result")
	private String manualInterviewResult;

	public void setCandidateId(Boolean candidateId) {
		this.candidateId = candidateId;
	}
	public Boolean getCandidateId( ) {
		return this.candidateId;
	}

	public void setManualInterviewResult(String manualInterviewResult) {
		this.manualInterviewResult = manualInterviewResult;
	}
	public String getManualInterviewResult( ) {
		return this.manualInterviewResult;
	}

}
