package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.referral.apply.send response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-12 10:02:56
 */
public class AlipayEbppIndustryReferralApplySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2128686834781587112L;

	/** 
	 * 推荐结果是否已被受理并进入候选人录入及短信确认流程
	 */
	@ApiField("accepted")
	private Boolean accepted;

	/** 
	 * 拒绝录入原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	public void setAccepted(Boolean accepted) {
		this.accepted = accepted;
	}
	public Boolean getAccepted( ) {
		return this.accepted;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

}
