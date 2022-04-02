package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集团预算信息
 *
 * @author auto create
 * @since 1.0, 2021-08-06 10:17:57
 */
public class GroupBudgetSummaryDTO extends AlipayObject {

	private static final long serialVersionUID = 6195422758527924591L;

	/**
	 * 预算受益部门编码
	 */
	@ApiField("benefiting_dept")
	private String benefitingDept;

	/**
	 * 预算受益部门
	 */
	@ApiField("benefiting_dept_name")
	private String benefitingDeptName;

	/**
	 * bg编码
	 */
	@ApiField("bg_code")
	private String bgCode;

	/**
	 * bu编码
	 */
	@ApiField("bu_code")
	private String buCode;

	/**
	 * 预算科目编码
	 */
	@ApiField("budget_account")
	private String budgetAccount;

	/**
	 * 预算科目名称
	 */
	@ApiField("budget_account_name")
	private String budgetAccountName;

	/**
	 * 集团预算年份
	 */
	@ApiField("budget_fy")
	private String budgetFy;

	/**
	 * 集团预算编码，由GB开头
	 */
	@ApiField("group_budget_code")
	private String groupBudgetCode;

	/**
	 * 预算编制部门编码
	 */
	@ApiField("making_dept")
	private String makingDept;

	/**
	 * 预算编制部门
	 */
	@ApiField("making_dept_name")
	private String makingDeptName;

	/**
	 * 剩余可用金额(单位：元)
	 */
	@ApiField("remain_amount")
	private String remainAmount;

	/**
	 * 剩余可用金额币种
	 */
	@ApiField("remain_amount_currency")
	private String remainAmountCurrency;

	public String getBenefitingDept() {
		return this.benefitingDept;
	}
	public void setBenefitingDept(String benefitingDept) {
		this.benefitingDept = benefitingDept;
	}

	public String getBenefitingDeptName() {
		return this.benefitingDeptName;
	}
	public void setBenefitingDeptName(String benefitingDeptName) {
		this.benefitingDeptName = benefitingDeptName;
	}

	public String getBgCode() {
		return this.bgCode;
	}
	public void setBgCode(String bgCode) {
		this.bgCode = bgCode;
	}

	public String getBuCode() {
		return this.buCode;
	}
	public void setBuCode(String buCode) {
		this.buCode = buCode;
	}

	public String getBudgetAccount() {
		return this.budgetAccount;
	}
	public void setBudgetAccount(String budgetAccount) {
		this.budgetAccount = budgetAccount;
	}

	public String getBudgetAccountName() {
		return this.budgetAccountName;
	}
	public void setBudgetAccountName(String budgetAccountName) {
		this.budgetAccountName = budgetAccountName;
	}

	public String getBudgetFy() {
		return this.budgetFy;
	}
	public void setBudgetFy(String budgetFy) {
		this.budgetFy = budgetFy;
	}

	public String getGroupBudgetCode() {
		return this.groupBudgetCode;
	}
	public void setGroupBudgetCode(String groupBudgetCode) {
		this.groupBudgetCode = groupBudgetCode;
	}

	public String getMakingDept() {
		return this.makingDept;
	}
	public void setMakingDept(String makingDept) {
		this.makingDept = makingDept;
	}

	public String getMakingDeptName() {
		return this.makingDeptName;
	}
	public void setMakingDeptName(String makingDeptName) {
		this.makingDeptName = makingDeptName;
	}

	public String getRemainAmount() {
		return this.remainAmount;
	}
	public void setRemainAmount(String remainAmount) {
		this.remainAmount = remainAmount;
	}

	public String getRemainAmountCurrency() {
		return this.remainAmountCurrency;
	}
	public void setRemainAmountCurrency(String remainAmountCurrency) {
		this.remainAmountCurrency = remainAmountCurrency;
	}

}
