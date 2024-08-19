package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.gameopenpromo.challenge.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-02 09:41:54
 */
public class AlipayUserGameopenpromoChallengeSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 3762477817625686432L;

	/** 
	 * 本次提交的当前状态
	 */
	@ApiField("submit_status")
	private String submitStatus;

	public void setSubmitStatus(String submitStatus) {
		this.submitStatus = submitStatus;
	}
	public String getSubmitStatus( ) {
		return this.submitStatus;
	}

}
