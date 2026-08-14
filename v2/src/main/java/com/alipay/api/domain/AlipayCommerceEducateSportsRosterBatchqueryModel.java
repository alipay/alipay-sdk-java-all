package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运动打卡学生列表查询
 *
 * @author auto create
 * @since 1.0, 2026-08-11 17:37:52
 */
public class AlipayCommerceEducateSportsRosterBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8798261293626387174L;

	/**
	 * 部门编码
	 */
	@ApiField("department_code")
	private String departmentCode;

	/**
	 * 学号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 学校组织code
	 */
	@ApiField("organization_code")
	private String organizationCode;

	/**
	 * 页码，不传默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小，不传默认为10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	public String getDepartmentCode() {
		return this.departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getEmployeeNo() {
		return this.employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOrganizationCode() {
		return this.organizationCode;
	}
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
