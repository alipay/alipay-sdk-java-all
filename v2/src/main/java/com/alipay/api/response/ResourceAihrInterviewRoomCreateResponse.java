package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: resource.aihr.interview.room.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-26 13:42:50
 */
public class ResourceAihrInterviewRoomCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3664591489841266642L;

	/** 
	 * 面试间ID
	 */
	@ApiField("ai_interview_id")
	private String aiInterviewId;

	/** 
	 * 面试链接
	 */
	@ApiField("ai_interview_url")
	private String aiInterviewUrl;

	/** 
	 * 面试间过期时间
	 */
	@ApiField("end_time")
	private String endTime;

	public void setAiInterviewId(String aiInterviewId) {
		this.aiInterviewId = aiInterviewId;
	}
	public String getAiInterviewId( ) {
		return this.aiInterviewId;
	}

	public void setAiInterviewUrl(String aiInterviewUrl) {
		this.aiInterviewUrl = aiInterviewUrl;
	}
	public String getAiInterviewUrl( ) {
		return this.aiInterviewUrl;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getEndTime( ) {
		return this.endTime;
	}

}
