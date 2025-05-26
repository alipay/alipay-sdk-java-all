package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建费控使用规则
 *
 * @author auto create
 * @since 1.0, 2024-06-24 10:30:16
 */
public class AlipayEbppInvoiceInstitutionExpenseruleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2187882428266365344L;

	/**
	 * 企业共同账户id（该字段将废弃，不建议使用，可用enterprise_id字段替换） 当前字段已废弃(该字段将废弃，不建议使用，可用enterprise_id字段替换)
	 */
	@ApiField("account_id")
	@Deprecated
	private String accountId;

	/**
	 * 授权签约协议号（该字段将废弃，不建议使用，可用enterprise_id字段替换） 当前字段已废弃(该字段将废弃，不建议使用，可用enterprise_id字段替换)
	 */
	@ApiField("agreement_no")
	@Deprecated
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
	 * 外部唯一标识，填写该字段可用于创建幂等，防止重复创建
	 */
	@ApiField("outer_source_id")
	private String outerSourceId;

	/**
	 * 支付策略
	 */
	@ApiField("payment_policy")
	private String paymentPolicy;

	/**
	 * 个人收款码转账是否支持因公付，默认为0。可选值：0（不支持）、1（支持）
	 */
	@ApiField("personal_qrcode_mode")
	private Long personalQrcodeMode;

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

	public String getOuterSourceId() {
		return this.outerSourceId;
	}
	public void setOuterSourceId(String outerSourceId) {
		this.outerSourceId = outerSourceId;
	}

	public String getPaymentPolicy() {
		return this.paymentPolicy;
	}
	public void setPaymentPolicy(String paymentPolicy) {
		this.paymentPolicy = paymentPolicy;
	}

	public Long getPersonalQrcodeMode() {
		return this.personalQrcodeMode;
	}
	public void setPersonalQrcodeMode(Long personalQrcodeMode) {
		this.personalQrcodeMode = personalQrcodeMode;
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
