package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保单
 *
 * @author auto create
 * @since 1.0, 2020-04-27 17:22:45
 */
public class InsPolicy extends AlipayObject {

	private static final long serialVersionUID = 3176511197913539937L;

	/**
	 * 保单邮寄地址
	 */
	@ApiField("addressee")
	private InsAddressee addressee;

	/**
	 * 投保人
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 投保参数;标准json 格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 赔案
	 */
	@ApiListField("claims")
	@ApiField("ins_claim")
	private List<InsClaim> claims;

	/**
	 * 险种列表
	 */
	@ApiListField("coverages")
	@ApiField("ins_coverage")
	private List<InsCoverage> coverages;

	/**
	 * 保单失效时间
	 */
	@ApiField("effect_end_time")
	private String effectEndTime;

	/**
	 * 保单生效时间
	 */
	@ApiField("effect_start_time")
	private String effectStartTime;

	/**
	 * 标的列表
	 */
	@ApiListField("ins_objects")
	@ApiField("ins_object")
	private List<InsObject> insObjects;

	/**
	 * 被保险人
	 */
	@ApiListField("insureds")
	@ApiField("ins_person")
	private List<InsPerson> insureds;

	/**
	 * 机构名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 外部保单号
	 */
	@ApiField("out_policy_no")
	private String outPolicyNo;

	/**
	 * 终缴时间，用于健康险、寿险等场景，用户需要按期缴费使用
	 */
	@ApiField("pay_end_time")
	private Date payEndTime;

	/**
	 * 缴至时间，用于健康险、寿险等场景，用户需要按期缴费使用
	 */
	@ApiField("pay_to_time")
	private Date payToTime;

	/**
	 * 保单凭证号;蚂蚁保险平台生成的保单凭证号,用户可以通过此单号去保险公司查询保单信息.
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 保单状态.INEFFECTIVE:未生效、GUARANTEE:保障中、EXPIRED:已失效、SURRENDER:已退保
	 */
	@ApiField("policy_status")
	private String policyStatus;

	/**
	 * 保费 ;单位分
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 产品名称
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 保额 ;单位分
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

	/**
	 * 退保金额
	 */
	@ApiField("surrender_fee")
	private Long surrenderFee;

	/**
	 * 退保时间
	 */
	@ApiField("surrender_time")
	private Date surrenderTime;

	public InsAddressee getAddressee() {
		return this.addressee;
	}
	public void setAddressee(InsAddressee addressee) {
		this.addressee = addressee;
	}

	public InsPerson getApplicant() {
		return this.applicant;
	}
	public void setApplicant(InsPerson applicant) {
		this.applicant = applicant;
	}

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public List<InsClaim> getClaims() {
		return this.claims;
	}
	public void setClaims(List<InsClaim> claims) {
		this.claims = claims;
	}

	public List<InsCoverage> getCoverages() {
		return this.coverages;
	}
	public void setCoverages(List<InsCoverage> coverages) {
		this.coverages = coverages;
	}

	public String getEffectEndTime() {
		return this.effectEndTime;
	}
	public void setEffectEndTime(String effectEndTime) {
		this.effectEndTime = effectEndTime;
	}

	public String getEffectStartTime() {
		return this.effectStartTime;
	}
	public void setEffectStartTime(String effectStartTime) {
		this.effectStartTime = effectStartTime;
	}

	public List<InsObject> getInsObjects() {
		return this.insObjects;
	}
	public void setInsObjects(List<InsObject> insObjects) {
		this.insObjects = insObjects;
	}

	public List<InsPerson> getInsureds() {
		return this.insureds;
	}
	public void setInsureds(List<InsPerson> insureds) {
		this.insureds = insureds;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getOutPolicyNo() {
		return this.outPolicyNo;
	}
	public void setOutPolicyNo(String outPolicyNo) {
		this.outPolicyNo = outPolicyNo;
	}

	public Date getPayEndTime() {
		return this.payEndTime;
	}
	public void setPayEndTime(Date payEndTime) {
		this.payEndTime = payEndTime;
	}

	public Date getPayToTime() {
		return this.payToTime;
	}
	public void setPayToTime(Date payToTime) {
		this.payToTime = payToTime;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getPolicyStatus() {
		return this.policyStatus;
	}
	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

	public Long getPremium() {
		return this.premium;
	}
	public void setPremium(Long premium) {
		this.premium = premium;
	}

	public String getProdName() {
		return this.prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public Long getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(Long sumInsured) {
		this.sumInsured = sumInsured;
	}

	public Long getSurrenderFee() {
		return this.surrenderFee;
	}
	public void setSurrenderFee(Long surrenderFee) {
		this.surrenderFee = surrenderFee;
	}

	public Date getSurrenderTime() {
		return this.surrenderTime;
	}
	public void setSurrenderTime(Date surrenderTime) {
		this.surrenderTime = surrenderTime;
	}

}
