package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商保码-保单数据回流接口
 *
 * @author auto create
 * @since 1.0, 2025-08-01 23:16:03
 */
public class AlipayCommerceMedicalInsurancePolicyinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3761551345156158343L;

	/**
	 * 保司类型
	 */
	@ApiField("company_type")
	private String companyType;

	/**
	 * 缴费方式，枚举值
（新增必填）
	 */
	@ApiField("continuous_frequency")
	private String continuousFrequency;

	/**
	 * 缴费期限文本描述，10Y/20Y/50A等，10Y代表10年，50A代表缴至50周岁，不可枚举
（新增必填）
	 */
	@ApiField("continuous_period")
	private String continuousPeriod;

	/**
	 * 缴费计划
	 */
	@ApiListField("continuous_plan_list")
	@ApiField("continuous_plan")
	private List<ContinuousPlan> continuousPlanList;

	/**
	 * 险别内容
（新增必填）
	 */
	@ApiListField("coverage_list")
	@ApiField("coverage")
	private List<Coverage> coverageList;

	/**
	 * 货币类型，枚举值
（新增必填）
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 保单终止时间 
YYYY-MM-DD HH:MM:SS
（新增必填）
	 */
	@ApiField("effect_end_time")
	private Date effectEndTime;

	/**
	 * 保单生效时间 
YYYY-MM-DD HH:MM:SS
（新增必填）
	 */
	@ApiField("effect_start_time")
	private Date effectStartTime;

	/**
	 * 电子保单
（新增必填）
	 */
	@ApiField("electronic_policy_url")
	private String electronicPolicyUrl;

	/**
	 * 保司自定义扩展
Json 格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 首期应收保费
单位：币种标准单位，如：人民币-元（保留2位小数）
（新增必填）
	 */
	@ApiField("first_premium")
	private String firstPremium;

	/**
	 * 投保时间
YYYY-MM-DD HH:MM:SS
（新增必填）
	 */
	@ApiField("insured_time")
	private Date insuredTime;

	/**
	 * 出单时间 
YYYY-MM-DD HH:MM:SS
（新增必填）
	 */
	@ApiField("issue_time")
	private Date issueTime;

	/**
	 * 续保时需传
	 */
	@ApiField("old_policy_no")
	private String oldPolicyNo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付时间 
YYYY-MM-DD HH:MM:SS
（新增必填）
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 交易流水号
（新增必填）
	 */
	@ApiField("pay_trade_no")
	private String payTradeNo;

	/**
	 * 投被保人的信息必传
更新干系人信息场景下：干系人全量信息必传
	 */
	@ApiListField("person_list")
	@ApiField("related_person")
	private List<RelatedPerson> personList;

	/**
	 * 保单号【用户ID-保司类型-保单号】保持唯一，修改场景此类字段必传
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 保单类型（不填写默认健康险）
	 */
	@ApiField("policy_type")
	private String policyType;

	/**
	 * 分期保费
单位：币种标准单位，如：人民币-元（保留2位小数）
（新增必填）
	 */
	@ApiField("premium")
	private String premium;

	/**
	 * 产品名称
（新增必填）
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 产品编号
（新增必填）
	 */
	@ApiField("prod_no")
	private String prodNo;

	/**
	 * 保单的产品方案代码
	 */
	@ApiField("product_scheme_code")
	private String productSchemeCode;

	/**
	 * 加油包场景会有主子保单
	 */
	@ApiField("source_policy_no")
	private String sourcePolicyNo;

	/**
	 * 保单状态，枚举值
（新增必填）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 总保额 
单位：币种标准单位，如：人民币-元（保留2位小数
	 */
	@ApiField("sum_insured")
	private String sumInsured;

	/**
	 * 退保金额
单位：元（保留2位小数）
	 */
	@ApiField("surrender_amount")
	private String surrenderAmount;

	/**
	 * 按照：「退保类型-退保原因」的格式
	 */
	@ApiField("surrender_reason")
	private String surrenderReason;

	/**
	 * 退保时间
YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("surrender_time")
	private Date surrenderTime;

	/**
	 * 中止原因文本描述
	 */
	@ApiField("suspended_reason")
	private String suspendedReason;

	/**
	 * 中止时间
YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("suspended_time")
	private Date suspendedTime;

	/**
	 * 实收总保费
单位：币种标准单位，如：人民币-元（保留2位小数）
（新增必填）
	 */
	@ApiField("total_premium")
	private String totalPremium;

	/**
	 * 支付宝用户Id。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCompanyType() {
		return this.companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getContinuousFrequency() {
		return this.continuousFrequency;
	}
	public void setContinuousFrequency(String continuousFrequency) {
		this.continuousFrequency = continuousFrequency;
	}

	public String getContinuousPeriod() {
		return this.continuousPeriod;
	}
	public void setContinuousPeriod(String continuousPeriod) {
		this.continuousPeriod = continuousPeriod;
	}

	public List<ContinuousPlan> getContinuousPlanList() {
		return this.continuousPlanList;
	}
	public void setContinuousPlanList(List<ContinuousPlan> continuousPlanList) {
		this.continuousPlanList = continuousPlanList;
	}

	public List<Coverage> getCoverageList() {
		return this.coverageList;
	}
	public void setCoverageList(List<Coverage> coverageList) {
		this.coverageList = coverageList;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getEffectEndTime() {
		return this.effectEndTime;
	}
	public void setEffectEndTime(Date effectEndTime) {
		this.effectEndTime = effectEndTime;
	}

	public Date getEffectStartTime() {
		return this.effectStartTime;
	}
	public void setEffectStartTime(Date effectStartTime) {
		this.effectStartTime = effectStartTime;
	}

	public String getElectronicPolicyUrl() {
		return this.electronicPolicyUrl;
	}
	public void setElectronicPolicyUrl(String electronicPolicyUrl) {
		this.electronicPolicyUrl = electronicPolicyUrl;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFirstPremium() {
		return this.firstPremium;
	}
	public void setFirstPremium(String firstPremium) {
		this.firstPremium = firstPremium;
	}

	public Date getInsuredTime() {
		return this.insuredTime;
	}
	public void setInsuredTime(Date insuredTime) {
		this.insuredTime = insuredTime;
	}

	public Date getIssueTime() {
		return this.issueTime;
	}
	public void setIssueTime(Date issueTime) {
		this.issueTime = issueTime;
	}

	public String getOldPolicyNo() {
		return this.oldPolicyNo;
	}
	public void setOldPolicyNo(String oldPolicyNo) {
		this.oldPolicyNo = oldPolicyNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPayTradeNo() {
		return this.payTradeNo;
	}
	public void setPayTradeNo(String payTradeNo) {
		this.payTradeNo = payTradeNo;
	}

	public List<RelatedPerson> getPersonList() {
		return this.personList;
	}
	public void setPersonList(List<RelatedPerson> personList) {
		this.personList = personList;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getPolicyType() {
		return this.policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getPremium() {
		return this.premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}

	public String getProdName() {
		return this.prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdNo() {
		return this.prodNo;
	}
	public void setProdNo(String prodNo) {
		this.prodNo = prodNo;
	}

	public String getProductSchemeCode() {
		return this.productSchemeCode;
	}
	public void setProductSchemeCode(String productSchemeCode) {
		this.productSchemeCode = productSchemeCode;
	}

	public String getSourcePolicyNo() {
		return this.sourcePolicyNo;
	}
	public void setSourcePolicyNo(String sourcePolicyNo) {
		this.sourcePolicyNo = sourcePolicyNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(String sumInsured) {
		this.sumInsured = sumInsured;
	}

	public String getSurrenderAmount() {
		return this.surrenderAmount;
	}
	public void setSurrenderAmount(String surrenderAmount) {
		this.surrenderAmount = surrenderAmount;
	}

	public String getSurrenderReason() {
		return this.surrenderReason;
	}
	public void setSurrenderReason(String surrenderReason) {
		this.surrenderReason = surrenderReason;
	}

	public Date getSurrenderTime() {
		return this.surrenderTime;
	}
	public void setSurrenderTime(Date surrenderTime) {
		this.surrenderTime = surrenderTime;
	}

	public String getSuspendedReason() {
		return this.suspendedReason;
	}
	public void setSuspendedReason(String suspendedReason) {
		this.suspendedReason = suspendedReason;
	}

	public Date getSuspendedTime() {
		return this.suspendedTime;
	}
	public void setSuspendedTime(Date suspendedTime) {
		this.suspendedTime = suspendedTime;
	}

	public String getTotalPremium() {
		return this.totalPremium;
	}
	public void setTotalPremium(String totalPremium) {
		this.totalPremium = totalPremium;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
