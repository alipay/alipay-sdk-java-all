package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量添加员工
 *
 * @author auto create
 * @since 1.0, 2023-10-30 13:58:16
 */
public class AlipayCommerceEcEmployeeBatchcreateModel extends AlipayObject {

	private static final long serialVersionUID = 4139339673492554986L;

	/**
	 * 批量添加的员工信息列表
	 */
	@ApiListField("employee_list")
	@ApiField("employee_batch_add_d_t_o")
	private List<EmployeeBatchAddDTO> employeeList;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	public List<EmployeeBatchAddDTO> getEmployeeList() {
		return this.employeeList;
	}
	public void setEmployeeList(List<EmployeeBatchAddDTO> employeeList) {
		this.employeeList = employeeList;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

}
