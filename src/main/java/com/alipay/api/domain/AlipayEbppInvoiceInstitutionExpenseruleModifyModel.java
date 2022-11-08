package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 编辑使用规则
 *
 * @author auto create
 * @since 1.0, 2022-10-11 09:43:01
 */
public class AlipayEbppInvoiceInstitutionExpenseruleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5311528991542997435L;

	/**
	 * 企业共同账户id，和授权签约协议号共同使用。
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 修改使用规则，操作枚举：
ADD_RULE（新增使用条件），
DELETE_RULE（删除使用条件），
MODIFY_RULE（修改使用条件），MODIFY_BASIC_INFO（修改规则基本信息）
	 */
	@ApiField("action")
	private String action;

	/**
	 * 授权签约协议号，可通过签约消息获取。配合企业共同账户id使用，当填写企业共同账户id时，此字段必填。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 该使用规则支持的资产消费模式，不填写则为默认模式，默认模式下有余额时使用余额，没有余额则使用规则中的限额
	 */
	@ApiField("consume_mode")
	private String consumeMode;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 使用规则条件列表
	 */
	@ApiListField("expense_ctrl_rule_info_list")
	@ApiField("expense_ctr_rule_info")
	private List<ExpenseCtrRuleInfo> expenseCtrlRuleInfoList;

	/**
	 * 制度id
	 */
	@ApiField("institution_id")
	private String institutionId;

	/**
	 * 开票规则id，如果之前已关联开票规则，则更换开票规则id不生效
	 */
	@ApiField("open_rule_id")
	private String openRuleId;

	/**
	 * 当笔消费金额大于规则可用余额时，用于控制支付策略，该字段缺省时采取因公账户和个人账户组合支付策略COMBINATION
	 */
	@ApiField("payment_policy")
	private String paymentPolicy;

	/**
	 * 规则条件列表
	 */
	@ApiListField("standard_condition_info_list")
	@ApiField("standard_condition_info")
	private List<StandardConditionInfo> standardConditionInfoList;

	/**
	 * 规则描述（敏感词校验）
	 */
	@ApiField("standard_desc")
	private String standardDesc;

	/**
	 * 使用规则id
	 */
	@ApiField("standard_id")
	private String standardId;

	/**
	 * 规则名称（敏感词校验）
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

	public String getConsumeMode() {
		return this.consumeMode;
	}
	public void setConsumeMode(String consumeMode) {
		this.consumeMode = consumeMode;
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

	public String getInstitutionId() {
		return this.institutionId;
	}
	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	public String getOpenRuleId() {
		return this.openRuleId;
	}
	public void setOpenRuleId(String openRuleId) {
		this.openRuleId = openRuleId;
	}

	public String getPaymentPolicy() {
		return this.paymentPolicy;
	}
	public void setPaymentPolicy(String paymentPolicy) {
		this.paymentPolicy = paymentPolicy;
	}

	public List<StandardConditionInfo> getStandardConditionInfoList() {
		return this.standardConditionInfoList;
	}
	public void setStandardConditionInfoList(List<StandardConditionInfo> standardConditionInfoList) {
		this.standardConditionInfoList = standardConditionInfoList;
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
