package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 设置费控规则
 *
 * @author auto create
 * @since 1.0, 2022-07-29 17:01:23
 */
public class AlipayEbppInvoiceExpenserulesProjectruleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8174119494724461888L;

	/**
	 * 企业ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 有效期截止（yyyy-MM-dd HH:mm:ss，必须大于起始时间）
	 */
	@ApiField("effective_end_date")
	private Date effectiveEndDate;

	/**
	 * 有效期起始（yyyy-MM-dd HH:mm:ss，必须小于截止时间）
	 */
	@ApiField("effective_start_date")
	private Date effectiveStartDate;

	/**
	 * 员工支付宝ID列表
特殊说明：单次传入的最大员工数为50，后续通过修改项目的员工列表接口进行员工调整
	 */
	@ApiListField("employee_list")
	@ApiField("string")
	private List<String> employeeList;

	/**
	 * 费控规则列表
	 */
	@ApiListField("expense_ctrl_rule_info_group_list")
	@ApiField("expense_ctr_rule_group_info")
	private List<ExpenseCtrRuleGroupInfo> expenseCtrlRuleInfoGroupList;

	/**
	 * 项目名称
约束：
1）敏感词校验
2）不能重复
	 */
	@ApiField("project_name")
	private String projectName;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

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

	public List<ExpenseCtrRuleGroupInfo> getExpenseCtrlRuleInfoGroupList() {
		return this.expenseCtrlRuleInfoGroupList;
	}
	public void setExpenseCtrlRuleInfoGroupList(List<ExpenseCtrRuleGroupInfo> expenseCtrlRuleInfoGroupList) {
		this.expenseCtrlRuleInfoGroupList = expenseCtrlRuleInfoGroupList;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}
