package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jobinterview.interview.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-25 10:22:54
 */
public class AlipayEbppJobinterviewInterviewInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3163423328341164595L;

	/** 
	 * 候选人本次面试唯一标识,后续接口均需透传
	 */
	@ApiField("candidate_id")
	private String candidateId;

	/** 
	 * 候选人进入面试间的专属链接,勿修改参数
	 */
	@ApiField("interview_url")
	private String interviewUrl;

	/** 
	 * 面试间有效的截止时间,格式yyyy-MM-dd HH:mm:ss。过期后无法进入面试
	 */
	@ApiField("room_expire_time")
	private String roomExpireTime;

	/** 
	 * 候选人当前面试状态,用于识别可执行的后续操作
	 */
	@ApiField("status")
	private String status;

	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}
	public String getCandidateId( ) {
		return this.candidateId;
	}

	public void setInterviewUrl(String interviewUrl) {
		this.interviewUrl = interviewUrl;
	}
	public String getInterviewUrl( ) {
		return this.interviewUrl;
	}

	public void setRoomExpireTime(String roomExpireTime) {
		this.roomExpireTime = roomExpireTime;
	}
	public String getRoomExpireTime( ) {
		return this.roomExpireTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
