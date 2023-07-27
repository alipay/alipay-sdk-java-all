package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 工牌信息
 *
 * @author auto create
 * @since 1.0, 2023-06-12 14:33:01
 */
public class EmployeeCardInfo extends AlipayObject {

	private static final long serialVersionUID = 4854121992641626427L;

	/**
	 * 雇主信息
	 */
	@ApiField("hire_principal")
	private ParticipantInfoDTO hirePrincipal;

	/**
	 * 邀请方信息
	 */
	@ApiField("invite_principal")
	private ParticipantInfoDTO invitePrincipal;

	public ParticipantInfoDTO getHirePrincipal() {
		return this.hirePrincipal;
	}
	public void setHirePrincipal(ParticipantInfoDTO hirePrincipal) {
		this.hirePrincipal = hirePrincipal;
	}

	public ParticipantInfoDTO getInvitePrincipal() {
		return this.invitePrincipal;
	}
	public void setInvitePrincipal(ParticipantInfoDTO invitePrincipal) {
		this.invitePrincipal = invitePrincipal;
	}

}
