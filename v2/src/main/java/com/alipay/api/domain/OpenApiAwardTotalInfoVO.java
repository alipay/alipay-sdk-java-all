package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 派奖
 *
 * @author auto create
 * @since 1.0, 2023-03-02 11:55:45
 */
public class OpenApiAwardTotalInfoVO extends AlipayObject {

	private static final long serialVersionUID = 7571466717825474831L;

	/**
	 * 助力者奖项信息
	 */
	@ApiField("invitee_info")
	private OpenApiAwardInfo inviteeInfo;

	/**
	 * 邀请者奖项信息
	 */
	@ApiField("inviter_info")
	private OpenApiAwardInfo inviterInfo;

	public OpenApiAwardInfo getInviteeInfo() {
		return this.inviteeInfo;
	}
	public void setInviteeInfo(OpenApiAwardInfo inviteeInfo) {
		this.inviteeInfo = inviteeInfo;
	}

	public OpenApiAwardInfo getInviterInfo() {
		return this.inviterInfo;
	}
	public void setInviterInfo(OpenApiAwardInfo inviterInfo) {
		this.inviterInfo = inviterInfo;
	}

}
