package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花名册信息分页查询
 *
 * @author auto create
 * @since 1.0, 2024-11-08 16:13:53
 */
public class AlipayCommerceEducateRosterInfoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2574981226513165548L;

	/**
	 * 学号或工号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 机构ID
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数量
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
