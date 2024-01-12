package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 审批单同行人
 *
 * @author auto create
 * @since 1.0, 2023-06-20 14:05:25
 */
public class ApprovalParticipant extends AlipayObject {

	private static final long serialVersionUID = 6723757445146725548L;

	/**
	 * 员工ID
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 是否外部同行人
	 */
	@ApiField("external_user")
	private Boolean externalUser;

	/**
	 * 同行人手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 同行人姓名
	 */
	@ApiField("participant_name")
	private String participantName;

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Boolean getExternalUser() {
		return this.externalUser;
	}
	public void setExternalUser(Boolean externalUser) {
		this.externalUser = externalUser;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getParticipantName() {
		return this.participantName;
	}
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

}
