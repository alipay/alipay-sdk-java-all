package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 费控制度添加
 *
 * @author auto create
 * @since 1.0, 2021-11-25 21:48:55
 */
public class AlipayEbppInvoiceExpenserulesSceneruleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6548893265481148751L;

	/**
	 * 企业签约企业合花ID-共同账号ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

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
	 * 员工支付宝uid列表
	 */
	@ApiListField("employee_list")
	@ApiField("string")
	private List<String> employeeList;

	/**
	 * 规则列表
	 */
	@ApiListField("expense_ctrl_rule_info_list")
	@ApiField("expense_ctr_rule_info")
	private List<ExpenseCtrRuleInfo> expenseCtrlRuleInfoList;

	/**
	 * 费用类型（餐饮：MEAL，地铁：METRO）
	 */
	@ApiField("expense_type")
	private String expenseType;

	/**
	 * 场景类型（
加班场景：OVERTIME，补贴福利：SUBSIDY，差旅：TRAVEL
）
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 费控规则说明
	 */
	@ApiField("standard_desc")
	private String standardDesc;

	/**
	 * 制度名称
	 */
	@ApiField("standard_name")
	private String standardName;

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

	public List<ExpenseCtrRuleInfo> getExpenseCtrlRuleInfoList() {
		return this.expenseCtrlRuleInfoList;
	}
	public void setExpenseCtrlRuleInfoList(List<ExpenseCtrRuleInfo> expenseCtrlRuleInfoList) {
		this.expenseCtrlRuleInfoList = expenseCtrlRuleInfoList;
	}

	public String getExpenseType() {
		return this.expenseType;
	}
	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getStandardDesc() {
		return this.standardDesc;
	}
	public void setStandardDesc(String standardDesc) {
		this.standardDesc = standardDesc;
	}

	public String getStandardName() {
		return this.standardName;
	}
	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}

}
