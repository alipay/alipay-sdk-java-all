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
 * @since 1.0, 2022-11-18 23:34:48
 */
public class AlipayEbppInvoiceExpenserulesSceneruleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3576718539347459992L;

	/**
	 * 共同账号ID
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
	 * 切换open_id前请使用：员工支付宝uid列表
特殊说明：单次传入的最大员工数为50，后续通过修改费控规则员工接口进行员工调整
	 */
	@ApiListField("employee_list")
	@ApiField("string")
	private List<String> employeeList;

	/**
	 * 切换open_id后请使用：员工open_id/企业码员工ID列表 特殊说明：单次传入的最大员工数为50，后续通过修改费控规则员工接口进行员工调整
	 */
	@ApiListField("employee_open_id_list")
	@ApiField("string")
	private List<String> employeeOpenIdList;

	/**
	 * 企业码企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 费控条件列表
特殊说明：
1）至少存在日额度（QUOTA_DAY）、月额度（QUOTA_MONTH）、有效期总额度（QUOTA_TOTAL）三者中的一个额度条件；
2）如果费用类型为MEAL，费控维度商户（MEAL_MERCHANT）和商户类型（MCC）对应的费控条件必须存在其一且不能同时存在；
3）如果费用类型为METRO，费控维度地铁卡类型（CARD_TYPE）对应的费控条件必须存在；
4）如果因公场景为OVERTIME，费控维度时间段（ALARM_CLOCK_TIME）对应的费控条件必须存在；
5）不能存在重复的费控维度对应的费控条件；
6）非MEAL费用类型，商户仅支持MERCHANT，不支持MEAL_MERCHANT
	 */
	@ApiListField("expense_ctrl_rule_info_list")
	@ApiField("expense_ctr_rule_info")
	private List<ExpenseCtrRuleInfo> expenseCtrlRuleInfoList;

	/**
	 * 费用类型
枚举值：MEAL（餐饮），METRO（地铁）
	 */
	@ApiField("expense_type")
	private String expenseType;

	/**
	 * 当笔消费金额大于规则可用余额时，用于控制支付策略，该字段缺省时采取因公账户和个人账户组合支付策略， 枚举值：PERSONAL（全部个人账户支付）, COMBINATION（因公账户和个人账户组合支付）
	 */
	@ApiField("payment_policy")
	private String paymentPolicy;

	/**
	 * 因公场景
枚举值：OVERTIME（加班），SUBSIDY（补贴福利），TRAVEL（差旅）
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 费控规则说明
特殊说明：敏感词校验
	 */
	@ApiField("standard_desc")
	private String standardDesc;

	/**
	 * 费控规则名称
特殊说明：
1）敏感词校验
2）不能重复，若需要重复联系支持人员定向放开
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

	public List<String> getEmployeeOpenIdList() {
		return this.employeeOpenIdList;
	}
	public void setEmployeeOpenIdList(List<String> employeeOpenIdList) {
		this.employeeOpenIdList = employeeOpenIdList;
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

	public String getExpenseType() {
		return this.expenseType;
	}
	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	public String getPaymentPolicy() {
		return this.paymentPolicy;
	}
	public void setPaymentPolicy(String paymentPolicy) {
		this.paymentPolicy = paymentPolicy;
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
