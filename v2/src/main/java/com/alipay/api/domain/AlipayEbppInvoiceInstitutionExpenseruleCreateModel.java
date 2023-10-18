package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建费控使用规则
 *
 * @author auto create
 * @since 1.0, 2023-09-26 16:44:30
 */
public class AlipayEbppInvoiceInstitutionExpenseruleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7613263933199781846L;

	/**
	 * 企业共同账户id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 当前规则可使用的其他资产来源信息
	 */
	@ApiField("asset_share_source_info")
	private AssetShareSourceInfo assetShareSourceInfo;

	/**
	 * 消费模式
	 */
	@ApiField("consume_mode")
	private String consumeMode;

	/**
	 * 企业码id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 使用规则因子列表
	 */
	@ApiField("expense_ctrl_rule_info_list")
	private ExpenseCtrRuleInfo expenseCtrlRuleInfoList;

	/**
	 * 费用类型子类
	 */
	@ApiField("expense_type_sub_category")
	private String expenseTypeSubCategory;

	/**
	 * 制度id
	 */
	@ApiField("institution_id")
	private String institutionId;

	/**
	 * 开票规则id
	 */
	@ApiField("open_rule_id")
	private String openRuleId;

	/**
	 * 支付策略
	 */
	@ApiField("payment_policy")
	private String paymentPolicy;

	/**
	 * 使用规则因子列表
	 */
	@ApiListField("standard_condition_info_list")
	@ApiField("standard_condition_info")
	private List<StandardConditionInfo> standardConditionInfoList;

	/**
	 * 使用规则描述
	 */
	@ApiField("standard_desc")
	private String standardDesc;

	/**
	 * 费控规则名称
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

	public AssetShareSourceInfo getAssetShareSourceInfo() {
		return this.assetShareSourceInfo;
	}
	public void setAssetShareSourceInfo(AssetShareSourceInfo assetShareSourceInfo) {
		this.assetShareSourceInfo = assetShareSourceInfo;
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
