package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 员工信息查询
 *
 * @author auto create
 * @since 1.0, 2025-09-01 18:16:42
 */
public class AnttechOceanbaseObglobalEmployeeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7356821361517893849L;

	/**
	 * 查询员工信息
	 */
	@ApiField("emp_id")
	private String empId;

	public String getEmpId() {
		return this.empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}

}
