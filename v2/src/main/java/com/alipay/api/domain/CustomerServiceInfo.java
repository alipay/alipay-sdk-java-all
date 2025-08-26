package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电话客服（坐席）信息
 *
 * @author auto create
 * @since 1.0, 2025-05-20 17:26:08
 */
public class CustomerServiceInfo extends AlipayObject {

	private static final long serialVersionUID = 1832179892121224745L;

	/**
	 * 客服工号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 客服工作手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 客服姓名
	 */
	@ApiField("name")
	private String name;

	public String getEmployeeNo() {
		return this.employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
