package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单详情批量查询
 *
 * @author auto create
 * @since 1.0, 2024-03-04 13:33:26
 */
public class AlipayCommerceEcConsumeDetailBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2468741163969561391L;

	/**
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 企业码员工id
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 截止时间
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 企业ID，推荐查询方式
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 费控规则组id（非制度id)
	 */
	@ApiField("expense_rule_group_id")
	private String expenseRuleGroupId;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 起始时间
	 */
	@ApiField("start_date")
	private String startDate;

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

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getExpenseRuleGroupId() {
		return this.expenseRuleGroupId;
	}
	public void setExpenseRuleGroupId(String expenseRuleGroupId) {
		this.expenseRuleGroupId = expenseRuleGroupId;
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

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
