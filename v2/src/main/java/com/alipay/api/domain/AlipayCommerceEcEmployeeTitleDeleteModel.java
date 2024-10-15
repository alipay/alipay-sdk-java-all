package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 删除员工抬头信息
 *
 * @author auto create
 * @since 1.0, 2024-04-23 11:36:51
 */
public class AlipayCommerceEcEmployeeTitleDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6324364755913621931L;

	/**
	 * 员工抬头列表
	 */
	@ApiListField("employee_title_list")
	@ApiField("employee_title_d_t_o")
	private List<EmployeeTitleDTO> employeeTitleList;

	public List<EmployeeTitleDTO> getEmployeeTitleList() {
		return this.employeeTitleList;
	}
	public void setEmployeeTitleList(List<EmployeeTitleDTO> employeeTitleList) {
		this.employeeTitleList = employeeTitleList;
	}

}
