package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 成员邀请接口扩展字段模型
 *
 * @author auto create
 * @since 1.0, 2022-05-12 09:51:08
 */
public class InviteMemberBusinessParamsDTO extends AlipayObject {

	private static final long serialVersionUID = 3171483152446264978L;

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
