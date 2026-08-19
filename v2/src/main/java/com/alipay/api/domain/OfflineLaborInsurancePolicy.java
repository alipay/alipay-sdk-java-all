package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-28 15:42:50
 */
public class OfflineLaborInsurancePolicy extends AlipayObject {

	private static final long serialVersionUID = 2338923431874915862L;

	/**
	 * 投保人地址信息
	 */
	@ApiField("addressee")
	private OfflineLaborPolicyholderAddress addressee;

	/**
	 * null
	 */
	@ApiListField("coverages")
	@ApiField("offline_labor_policy_coverage")
	private List<OfflineLaborPolicyCoverage> coverages;

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
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 承保机构名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 外部保单号
	 */
	@ApiField("out_policy_no")
	private String outPolicyNo;

	/**
	 * 缴费结束时间，即整个保单的最后一期缴费时间，之后不再需要缴费（保障可能继续有效）
	 */
	@ApiField("pay_end_time")
	private Date payEndTime;

	/**
	 * 缴费截止时间，即本期保费最晚什么时候要交完，逾期则保单可能失效
	 */
	@ApiField("pay_to_time")
	private Date payToTime;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 保单状态，INEFFECTIVE：表示未生效
	 */
	@ApiField("policy_status")
	private String policyStatus;

	/**
	 * 保费，单位：分
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 产品名称
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 服务商编号
	 */
	@ApiField("sp_no")
	private String spNo;

	/**
	 * 保额，单位：分
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

	/**
	 * 退保金额，单位：分
	 */
	@ApiField("surrender_fee")
	private Long surrenderFee;

	/**
	 * 退保时间
	 */
	@ApiField("surrender_time")
	private Date surrenderTime;

	public OfflineLaborPolicyholderAddress getAddressee() {
		return this.addressee;
	}
	public void setAddressee(OfflineLaborPolicyholderAddress addressee) {
		this.addressee = addressee;
	}

	public List<OfflineLaborPolicyCoverage> getCoverages() {
		return this.coverages;
	}
	public void setCoverages(List<OfflineLaborPolicyCoverage> coverages) {
		this.coverages = coverages;
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

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
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

	public String getSpNo() {
		return this.spNo;
	}
	public void setSpNo(String spNo) {
		this.spNo = spNo;
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
