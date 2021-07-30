package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集团预算信息
 *
 * @author auto create
 * @since 1.0, 2021-07-20 11:24:46
 */
public class GroupBudgetSummaryDTO extends AlipayObject {

	private static final long serialVersionUID = 8746183197473418748L;

	/**
	 * 预算受益部门编码
	 */
	@ApiField("benefiting_dept")
	private String benefitingDept;

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
	 * 剩余可用金额(单位：元)
	 */
	@ApiField("remain_amount")
	private String remainAmount;

	public String getBenefitingDept() {
		return this.benefitingDept;
	}
	public void setBenefitingDept(String benefitingDept) {
		this.benefitingDept = benefitingDept;
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

	public String getRemainAmount() {
		return this.remainAmount;
	}
	public void setRemainAmount(String remainAmount) {
		this.remainAmount = remainAmount;
	}

}
