package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI面试间修改
 *
 * @author auto create
 * @since 1.0, 2026-05-26 13:39:28
 */
public class ResourceAihrInterviewRoomModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1797539289288221134L;

	/**
	 * 面试间ID
	 */
	@ApiField("ai_interview_id")
	private String aiInterviewId;

	/**
	 * 固定值，对应系统租户
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 面试间过期时间
	 */
	@ApiField("end_time")
	private String endTime;

	public String getAiInterviewId() {
		return this.aiInterviewId;
	}
	public void setAiInterviewId(String aiInterviewId) {
		this.aiInterviewId = aiInterviewId;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}
