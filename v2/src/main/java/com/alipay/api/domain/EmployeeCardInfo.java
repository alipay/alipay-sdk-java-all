package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 工牌信息
 *
 * @author auto create
 * @since 1.0, 2023-11-28 22:31:47
 */
public class EmployeeCardInfo extends AlipayObject {

	private static final long serialVersionUID = 8882554474854561497L;

	/**
	 * 零工扩展信息
	 */
	@ApiField("card_extend_params")
	private CardExtendParamsDTO cardExtendParams;

	/**
	 * 零工卡工牌ID
	 */
	@ApiField("employee_card_no")
	private String employeeCardNo;

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

	public CardExtendParamsDTO getCardExtendParams() {
		return this.cardExtendParams;
	}
	public void setCardExtendParams(CardExtendParamsDTO cardExtendParams) {
		this.cardExtendParams = cardExtendParams;
	}

	public String getEmployeeCardNo() {
		return this.employeeCardNo;
	}
	public void setEmployeeCardNo(String employeeCardNo) {
		this.employeeCardNo = employeeCardNo;
	}

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
