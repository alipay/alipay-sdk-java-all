package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: resource.aihr.interview.room.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-26 13:39:28
 */
public class ResourceAihrInterviewRoomModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8454668468225176717L;

	/** 
	 * 面试间ID
	 */
	@ApiField("ai_interview_id")
	private String aiInterviewId;

	public void setAiInterviewId(String aiInterviewId) {
		this.aiInterviewId = aiInterviewId;
	}
	public String getAiInterviewId( ) {
		return this.aiInterviewId;
	}

}
