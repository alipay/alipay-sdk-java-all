package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 编辑使用规则
 *
 * @author auto create
 * @since 1.0, 2024-06-24 10:11:52
 */
public class AlipayEbppInvoiceInstitutionExpenseruleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3456487531176185119L;

	/**
	 * 企业共同账户id（该字段将废弃，不建议使用，可用enterprise_id字段替换） 当前字段已废弃(该字段将废弃，不建议使用，可用enterprise_id字段替换)
	 */
	@ApiField("account_id")
	@Deprecated
	private String accountId;

	/**
	 * 修改使用规则
	 */
	@ApiField("action")
	private String action;

	/**
	 * 授权签约协议号（该字段将废弃，不建议使用，可用enterprise_id字段替换） 当前字段已废弃(该字段将废弃，不建议使用，可用enterprise_id字段替换)
	 */
	@ApiField("agreement_no")
	@Deprecated
	private String agreementNo;

	/**
	 * 资产共享来源信息
	 */
	@ApiField("asset_share_source_info")
	private AssetShareSourceInfo assetShareSourceInfo;

	/**
	 * 该使用规则支持的资产消费模式，不填写则为默认模式，默认模式下有余额时使用余额，没有余额则使用规则中的限额，点券模式为只能使用点券，点券+余额模式为可以使用点券和余额。
	 */
	@ApiField("consume_mode")
	private String consumeMode;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 使用规则条件列表（已废弃）
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
	 * 开票规则id
	 */
	@ApiField("open_rule_id")
	private String openRuleId;

	/**
	 * 当笔消费金额大于规则可用余额时，用于控制支付策略
	 */
	@ApiField("payment_policy")
	private String paymentPolicy;

	/**
	 * 个人收款码转账是否支持因公付，默认为0。可选值：0（不支持）、1（支持）
	 */
	@ApiField("personal_qrcode_mode")
	private Long personalQrcodeMode;

	/**
	 * 规则条件列表
	 */
	@ApiListField("standard_condition_info_list")
	@ApiField("standard_condition_info")
	private List<StandardConditionInfo> standardConditionInfoList;

	/**
	 * 规则描述
	 */
	@ApiField("standard_desc")
	private String standardDesc;

	/**
	 * 使用规则id
	 */
	@ApiField("standard_id")
	private String standardId;

	/**
	 * 规则名称
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
