package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 审批单同行人信息
 *
 * @author auto create
 * @since 1.0, 2025-06-03 17:06:52
 */
public class ApprovalTravelerDTO extends AlipayObject {

	private static final long serialVersionUID = 6438946734794675586L;

	/**
	 * 员工id
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 外部同行人手机号
	 */
	@ApiField("external_user_mobile")
	private String externalUserMobile;

	/**
	 * 外部同行人名称
	 */
	@ApiField("external_user_name")
	private String externalUserName;

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getExternalUserMobile() {
		return this.externalUserMobile;
	}
	public void setExternalUserMobile(String externalUserMobile) {
		this.externalUserMobile = externalUserMobile;
	}

	public String getExternalUserName() {
		return this.externalUserName;
	}
	public void setExternalUserName(String externalUserName) {
		this.externalUserName = externalUserName;
	}

}
