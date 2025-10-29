package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询管理员列表
 *
 * @author auto create
 * @since 1.0, 2025-06-09 09:59:48
 */
public class AlipayCommerceEducateManagerInfoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2215117972349757199L;

	/**
	 * 学工号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 管理员类型
	 */
	@ApiField("manager_type")
	private String managerType;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 分页页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getEmployeeNo() {
		return this.employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getManagerType() {
		return this.managerType;
	}
	public void setManagerType(String managerType) {
		this.managerType = managerType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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
