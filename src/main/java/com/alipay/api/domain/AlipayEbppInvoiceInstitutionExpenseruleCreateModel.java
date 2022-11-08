package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建费控使用规则
 *
 * @author auto create
 * @since 1.0, 2022-10-11 09:42:51
 */
public class AlipayEbppInvoiceInstitutionExpenseruleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5522751817433575737L;

	/**
	 * 企业共同账户id，和授权签约协议号共同使用。
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号，可通过签约消息获取。配合企业共同账户id使用，当填写企业共同账户id时，此字段必填。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 消费模式，该使用规则支持消费的资产类型，不填为默认模式，默认模式为优先消费余额，没有余额则根据规则中设置的限额控制消费金额
	 */
	@ApiField("consume_mode")
	private String consumeMode;

	/**
	 * 企业码id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 使用规则条件列表
	 */
	@ApiField("expense_ctrl_rule_info_list")
	private ExpenseCtrRuleInfo expenseCtrlRuleInfoList;

	/**
	 * 费用类型子类，当制度的费用类型为MEAL时，支持到店、外卖；当费用类型为非MEAL时，与费用类型保持一致
	 */
	@ApiField("expense_type_sub_category")
	private String expenseTypeSubCategory;

	/**
	 * 制度id
	 */
	@ApiField("institution_id")
	private String institutionId;

	/**
	 * 开票规则id，若使用途径是外卖的使用规则需要开票，需要在创建使用规则时关联开票规则，后续变更关联开票规则不生效
	 */
	@ApiField("open_rule_id")
	private String openRuleId;

	/**
	 * 当笔消费金额大于规则可用余额时，用于控制支付策略，该字段缺省时采取因公账户和个人账户组合支付策略
	 */
	@ApiField("payment_policy")
	private String paymentPolicy;

	/**
	 * 使用规则条件列表
	 */
	@ApiListField("standard_condition_info_list")
	@ApiField("standard_condition_info")
	private List<StandardConditionInfo> standardConditionInfoList;

	/**
	 * 使用规则描述(敏感词校验)
	 */
	@ApiField("standard_desc")
	private String standardDesc;

	/**
	 * 费控规则名称 特殊说明： 1）敏感词校验
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

	public ExpenseCtrRuleInfo getExpenseCtrlRuleInfoList() {
		return this.expenseCtrlRuleInfoList;
	}
	public void setExpenseCtrlRuleInfoList(ExpenseCtrRuleInfo expenseCtrlRuleInfoList) {
		this.expenseCtrlRuleInfoList = expenseCtrlRuleInfoList;
	}

	public String getExpenseTypeSubCategory() {
		return this.expenseTypeSubCategory;
	}
	public void setExpenseTypeSubCategory(String expenseTypeSubCategory) {
		this.expenseTypeSubCategory = expenseTypeSubCategory;
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

	public String getStandardName() {
		return this.standardName;
	}
	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}

}
