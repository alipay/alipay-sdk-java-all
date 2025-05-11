package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 共同账户成员扩展信息
 *
 * @author auto create
 * @since 1.0, 2023-10-24 15:35:01
 */
public class MemberExtInfo extends AlipayObject {

	private static final long serialVersionUID = 5666778766189927174L;

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
