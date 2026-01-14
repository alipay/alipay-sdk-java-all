package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.job.invitation.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-20 14:27:04
 */
public class AlipayEbppIndustryJobInvitationSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7745427272529224532L;

	/** 
	 * 邀约id
	 */
	@ApiField("invitation_id")
	private String invitationId;

	public void setInvitationId(String invitationId) {
		this.invitationId = invitationId;
	}
	public String getInvitationId( ) {
		return this.invitationId;
	}

}
