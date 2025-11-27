package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 员工券列表查询
 *
 * @author auto create
 * @since 1.0, 2025-09-23 16:44:29
 */
public class AlipayCommerceEcEmployeeVoucherQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4249972189924211639L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 企业码员工id
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 企业码企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数据量
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

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
