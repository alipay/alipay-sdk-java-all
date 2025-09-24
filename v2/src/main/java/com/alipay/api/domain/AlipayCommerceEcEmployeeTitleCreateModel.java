package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 新增员工抬头关系
 *
 * @author auto create
 * @since 1.0, 2025-08-15 19:24:29
 */
public class AlipayCommerceEcEmployeeTitleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7423383679976611916L;

	/**
	 * 员工与抬头关系列表
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
