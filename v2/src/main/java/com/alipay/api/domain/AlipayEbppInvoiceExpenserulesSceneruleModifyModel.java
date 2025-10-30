package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 费控制度修改
 *
 * @author auto create
 * @since 1.0, 2024-01-30 21:03:18
 */
public class AlipayEbppInvoiceExpenserulesSceneruleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8815236348859831324L;

	/**
	 * 企业ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 修改操作
枚举值：
ADD_RULE（新增费控条件），DELETE_RULE（删除费控条件），MODIFY_RULE（修改费控条件），MODIFY_STANDARD（修改费控规则基本信息）
	 */
	@ApiField("action")
	private String action;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 有效期截止
特殊说明：修改费控规则基本信息时必传
	 */
	@ApiField("effective_end_date")
	private Date effectiveEndDate;

	/**
	 * 有效期起始
特殊说明：修改费控规则基本信息时必传
	 */
	@ApiField("effective_start_date")
	private Date effectiveStartDate;

	/**
	 * 企业码企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 费控规则条件列表 特殊说明：新增费控条件/修改费控条件/删除费控条件操作时必填
	 */
	@ApiListField("expense_ctrl_rule_info_list")
	@ApiField("expense_ctr_rule_info")
	private List<ExpenseCtrRuleInfo> expenseCtrlRuleInfoList;

	/**
	 * 当笔消费金额大于规则可用余额时，用于控制支付策略，该字段缺省时采取因公账户和个人账户组合支付策略， 枚举值：PERSONAL（全部个人账户支付）, COMBINATION（因公账户和个人账户组合支付）
	 */
	@ApiField("payment_policy")
	private String paymentPolicy;

	/**
	 * 费控规则说明
特殊说明：
1）敏感词校验
2）修改费控规则基本信息时必传
	 */
	@ApiField("standard_desc")
	private String standardDesc;

	/**
	 * 费控规则ID
	 */
	@ApiField("standard_id")
	private String standardId;

	/**
	 * 费控规则名称
特殊说明：
1）敏感词校验
2）修改费控规则基本信息时必传
3）不能重复，若需要重复联系支持人员定向放开
	 */
	@ApiField("standard_name")
	private String standardName;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
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

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public List<ExpenseCtrRuleInfo> getExpenseCtrlRuleInfoList() {
		return this.expenseCtrlRuleInfoList;
	}
	public void setExpenseCtrlRuleInfoList(List<ExpenseCtrRuleInfo> expenseCtrlRuleInfoList) {
		this.expenseCtrlRuleInfoList = expenseCtrlRuleInfoList;
	}

	public String getPaymentPolicy() {
		return this.paymentPolicy;
	}
	public void setPaymentPolicy(String paymentPolicy) {
		this.paymentPolicy = paymentPolicy;
	}

	public String getStandardDesc() {
		return this.standardDesc;
	}
	public void setStandardDesc(String standardDesc) {
		this.standardDesc = standardDesc;
	}

	public String getStandardId() {
		return this.standardId;
	}
	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}

	public String getStandardName() {
		return this.standardName;
	}
	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}

}
