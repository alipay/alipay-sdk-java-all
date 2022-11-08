package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 共同账户成员扩展信息
 *
 * @author auto create
 * @since 1.0, 2022-01-26 14:56:56
 */
public class MemberExtInfo extends AlipayObject {

	private static final long serialVersionUID = 1189955698839276615L;

	/**
	 * 员工工号信息
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
