package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI面试间创建
 *
 * @author auto create
 * @since 1.0, 2026-05-26 13:42:50
 */
public class ResourceAihrInterviewRoomCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5826837817166775733L;

	/**
	 * AI面试流程编码
	 */
	@ApiField("ai_interview_code")
	private String aiInterviewCode;

	/**
	 * 对应系统租户，用于校验是否和APPID对应租户一致
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 选填，由调用方提供，同一租户+环境下幂等键唯一
	 */
	@ApiField("idempotent_key")
	private String idempotentKey;

	/**
	 * 岗位信息
	 */
	@ApiField("job_info")
	private OpenapiInterviewJobInfoDTO jobInfo;

	/**
	 * 候选人信息
	 */
	@ApiField("user_info")
	private OpenapiInterviewUserInfoDTO userInfo;

	public String getAiInterviewCode() {
		return this.aiInterviewCode;
	}
	public void setAiInterviewCode(String aiInterviewCode) {
		this.aiInterviewCode = aiInterviewCode;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getIdempotentKey() {
		return this.idempotentKey;
	}
	public void setIdempotentKey(String idempotentKey) {
		this.idempotentKey = idempotentKey;
	}

	public OpenapiInterviewJobInfoDTO getJobInfo() {
		return this.jobInfo;
	}
	public void setJobInfo(OpenapiInterviewJobInfoDTO jobInfo) {
		this.jobInfo = jobInfo;
	}

	public OpenapiInterviewUserInfoDTO getUserInfo() {
		return this.userInfo;
	}
	public void setUserInfo(OpenapiInterviewUserInfoDTO userInfo) {
		this.userInfo = userInfo;
	}

}
