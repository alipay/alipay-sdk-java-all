package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 项目规则信息
 *
 * @author auto create
 * @since 1.0, 2023-02-27 20:09:06
 */
public class ProjectRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 7275282133924332159L;

	/**
	 * 有效期截止
	 */
	@ApiField("effective_end_date")
	private Date effectiveEndDate;

	/**
	 * 有效期起始
	 */
	@ApiField("effective_start_date")
	private Date effectiveStartDate;

	/**
	 * 切换open_id前请使用此字段：员工uid列表
	 */
	@ApiListField("employee_list")
	@ApiField("string")
	private List<String> employeeList;

	/**
	 * 切换open_id后请使用此字段：员工open_id列表
	 */
	@ApiListField("employee_open_id_list")
	@ApiField("string")
	private List<String> employeeOpenIdList;

	/**
	 * 规则组列表
	 */
	@ApiListField("expense_ctrl_rule_info_group_list")
	@ApiField("expense_ctr_rule_group_info")
	private List<ExpenseCtrRuleGroupInfo> expenseCtrlRuleInfoGroupList;

	/**
	 * 项目id
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 项目名称
	 */
	@ApiField("project_name")
	private String projectName;

	public Date getEffectiveEndDate() {
		return this.effectiveEndDate;
	}
	public void setEffectiveEndDate(Date effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}

	public Date getEffectiveStartDate() {
		return this.effectiveStartDate;
	}
	public void setEffectiveStartDate(Date effectiveStartDate) {
		this.effectiveStartDate = effectiveStartDate;
	}

	public List<String> getEmployeeList() {
		return this.employeeList;
	}
	public void setEmployeeList(List<String> employeeList) {
		this.employeeList = employeeList;
	}

	public List<String> getEmployeeOpenIdList() {
		return this.employeeOpenIdList;
	}
	public void setEmployeeOpenIdList(List<String> employeeOpenIdList) {
		this.employeeOpenIdList = employeeOpenIdList;
	}

	public List<ExpenseCtrRuleGroupInfo> getExpenseCtrlRuleInfoGroupList() {
		return this.expenseCtrlRuleInfoGroupList;
	}
	public void setExpenseCtrlRuleInfoGroupList(List<ExpenseCtrRuleGroupInfo> expenseCtrlRuleInfoGroupList) {
		this.expenseCtrlRuleInfoGroupList = expenseCtrlRuleInfoGroupList;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}
