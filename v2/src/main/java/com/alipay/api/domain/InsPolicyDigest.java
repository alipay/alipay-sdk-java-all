package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保单摘要(去除敏感信息)
 *
 * @author auto create
 * @since 1.0, 2023-10-25 16:32:31
 */
public class InsPolicyDigest extends AlipayObject {

	private static final long serialVersionUID = 4881787387712476154L;

	/**
	 * 保单失效时间
	 */
	@ApiField("effect_end_time")
	private Date effectEndTime;

	/**
	 * 保单生效时间
	 */
	@ApiField("effect_start_time")
	private Date effectStartTime;

	/**
	 * 外部保单号
	 */
	@ApiField("out_policy_no")
	private String outPolicyNo;

	/**
	 * 保单凭证号;蚂蚁保险平台生成的保单凭证号,用户可以通过此单号去保险公司查询保单信息.
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 保单状态，该状态是出单时间和保单起止期的比较值，业务可根据业务时间和保单起止期自行比较
	 */
	@ApiField("policy_status")
	private String policyStatus;

	/**
	 * 保单类型
	 */
	@ApiField("policy_type")
	private String policyType;

	/**
	 * 保费 ;单位分
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 保额 ;单位分
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

	/**
	 * 退保金额 ;单位分
	 */
	@ApiField("surrender_amount")
	private Long surrenderAmount;

	/**
	 * 退保时间
	 */
	@ApiField("surrender_time")
	private Date surrenderTime;

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

	public String getOutPolicyNo() {
		return this.outPolicyNo;
	}
	public void setOutPolicyNo(String outPolicyNo) {
		this.outPolicyNo = outPolicyNo;
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

	public String getPolicyType() {
		return this.policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public Long getPremium() {
		return this.premium;
	}
	public void setPremium(Long premium) {
		this.premium = premium;
	}

	public Long getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(Long sumInsured) {
		this.sumInsured = sumInsured;
	}

	public Long getSurrenderAmount() {
		return this.surrenderAmount;
	}
	public void setSurrenderAmount(Long surrenderAmount) {
		this.surrenderAmount = surrenderAmount;
	}

	public Date getSurrenderTime() {
		return this.surrenderTime;
	}
	public void setSurrenderTime(Date surrenderTime) {
		this.surrenderTime = surrenderTime;
	}

}
