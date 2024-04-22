package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 有权限的集团预算基础信息和可用余额查询
 *
 * @author auto create
 * @since 1.0, 2022-12-08 19:01:40
 */
public class AlipayBossFncAntbudgetGroupbudgetBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4128781981352229791L;

	/**
	 * 财年，例如：2021
	 */
	@ApiField("budget_fy")
	private String budgetFy;

	/**
	 * ps部门信息
	 */
	@ApiField("department_code")
	private String departmentCode;

	/**
	 * 集团预算编码(提供精确查询)
	 */
	@ApiField("group_budget_code")
	private String groupBudgetCode;

	/**
	 * 操作人员工号，例如：286579（代表黑骑）
	 */
	@ApiField("operator_work_no")
	private String operatorWorkNo;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getBudgetFy() {
		return this.budgetFy;
	}
	public void setBudgetFy(String budgetFy) {
		this.budgetFy = budgetFy;
	}

	public String getDepartmentCode() {
		return this.departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getGroupBudgetCode() {
		return this.groupBudgetCode;
	}
	public void setGroupBudgetCode(String groupBudgetCode) {
		this.groupBudgetCode = groupBudgetCode;
	}

	public String getOperatorWorkNo() {
		return this.operatorWorkNo;
	}
	public void setOperatorWorkNo(String operatorWorkNo) {
		this.operatorWorkNo = operatorWorkNo;
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
