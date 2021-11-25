package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 成员邀请接口扩展字段模型
 *
 * @author auto create
 * @since 1.0, 2021-07-06 20:12:42
 */
public class InviteMemberBusinessParamsDTO extends AlipayObject {

	private static final long serialVersionUID = 8778834868844132273L;

	/**
	 * 企业员工工卡
	 */
	@ApiField("employee_id")
	private String employeeId;

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

}
