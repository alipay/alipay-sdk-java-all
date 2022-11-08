package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询部门下员工id列表
 *
 * @author auto create
 * @since 1.0, 2022-11-08 13:20:16
 */
public class AlipayCommerceEcEmployeeIdlistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1863962145496815617L;

	/**
	 * 部门id
	 */
	@ApiField("department_id")
	private String departmentId;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 查询页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页查询大小，限制最大为1000
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getDepartmentId() {
		return this.departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
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

}
