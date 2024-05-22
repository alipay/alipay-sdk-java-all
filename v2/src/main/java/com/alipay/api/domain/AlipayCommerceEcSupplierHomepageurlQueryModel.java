package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询服务主页url
 *
 * @author auto create
 * @since 1.0, 2024-03-13 10:40:59
 */
public class AlipayCommerceEcSupplierHomepageurlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4773149528184845234L;

	/**
	 * 员工id
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 主企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 费控信息
	 */
	@ApiField("expense_control_info")
	private ExpenseControlInfo expenseControlInfo;

	/**
	 * 服务id
	 */
	@ApiField("service_id")
	private String serviceId;

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public ExpenseControlInfo getExpenseControlInfo() {
		return this.expenseControlInfo;
	}
	public void setExpenseControlInfo(ExpenseControlInfo expenseControlInfo) {
		this.expenseControlInfo = expenseControlInfo;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
