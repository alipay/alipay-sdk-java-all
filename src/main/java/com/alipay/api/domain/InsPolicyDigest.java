package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保单摘要(去除敏感信息)
 *
 * @author auto create
 * @since 1.0, 2022-06-10 16:17:17
 */
public class InsPolicyDigest extends AlipayObject {

	private static final long serialVersionUID = 2712985989755645325L;

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
	 * 保额 ;单位分
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

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

}
