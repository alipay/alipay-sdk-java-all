package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阳光跑记录批量查询
 *
 * @author auto create
 * @since 1.0, 2026-01-19 15:17:43
 */
public class AlipayCommerceEducateSportsRunrecordBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2623856344221873994L;

	/**
	 * 学生学号或教师职工号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 跑步结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 学校组织code
	 */
	@ApiField("organization_code")
	private String organizationCode;

	/**
	 * 页码，非必选字段，不选默认为1
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 分页大小，非必选，不选默认为10
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 跑步开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	public String getEmployeeNo() {
		return this.employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getOrganizationCode() {
		return this.organizationCode;
	}
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
