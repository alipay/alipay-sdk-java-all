package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开通灵工之家服务时如果需要开通工牌信息时传入，本次需求必填
 *
 * @author auto create
 * @since 1.0, 2023-11-17 15:43:19
 */
public class EmployeeCardInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7531687551265897759L;

	/**
	 * 零工卡工牌ID
	 */
	@ApiField("employee_card_no")
	private String employeeCardNo;

	/**
	 * 雇主信息
	 */
	@ApiField("hire_principal")
	private AttendancePariticipantInfoDTO hirePrincipal;

	public String getEmployeeCardNo() {
		return this.employeeCardNo;
	}
	public void setEmployeeCardNo(String employeeCardNo) {
		this.employeeCardNo = employeeCardNo;
	}

	public AttendancePariticipantInfoDTO getHirePrincipal() {
		return this.hirePrincipal;
	}
	public void setHirePrincipal(AttendancePariticipantInfoDTO hirePrincipal) {
		this.hirePrincipal = hirePrincipal;
	}

}
