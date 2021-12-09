package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投保基本信息
 *
 * @author auto create
 * @since 1.0, 2021-07-06 10:27:44
 */
public class ApplyBasicInfo extends AlipayObject {

	private static final long serialVersionUID = 4541171796266715447L;

	/**
	 * 保额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 投保人信息
	 */
	@ApiField("apply_info")
	private InsurancePersonInfo applyInfo;

	/**
	 * 受益人信息
	 */
	@ApiField("beneficiary_info")
	private InsurancePersonInfo beneficiaryInfo;

	/**
	 * 保险条款信息
	 */
	@ApiField("insurance_clause")
	private InsuranceClauseInfo insuranceClause;

	/**
	 * 保险止期
	 */
	@ApiField("insure_end_date")
	private String insureEndDate;

	/**
	 * 保险起期
	 */
	@ApiField("insure_start_date")
	private String insureStartDate;

	/**
	 * 被保人信息
	 */
	@ApiField("insured_info")
	private InsurancePersonInfo insuredInfo;

	/**
	 * 保费
	 */
	@ApiField("premium")
	private String premium;

	/**
	 * 费率，最多兼容9位小数
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * 关联业务订单号
	 */
	@ApiField("related_order_no")
	private String relatedOrderNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public InsurancePersonInfo getApplyInfo() {
		return this.applyInfo;
	}
	public void setApplyInfo(InsurancePersonInfo applyInfo) {
		this.applyInfo = applyInfo;
	}

	public InsurancePersonInfo getBeneficiaryInfo() {
		return this.beneficiaryInfo;
	}
	public void setBeneficiaryInfo(InsurancePersonInfo beneficiaryInfo) {
		this.beneficiaryInfo = beneficiaryInfo;
	}

	public InsuranceClauseInfo getInsuranceClause() {
		return this.insuranceClause;
	}
	public void setInsuranceClause(InsuranceClauseInfo insuranceClause) {
		this.insuranceClause = insuranceClause;
	}

	public String getInsureEndDate() {
		return this.insureEndDate;
	}
	public void setInsureEndDate(String insureEndDate) {
		this.insureEndDate = insureEndDate;
	}

	public String getInsureStartDate() {
		return this.insureStartDate;
	}
	public void setInsureStartDate(String insureStartDate) {
		this.insureStartDate = insureStartDate;
	}

	public InsurancePersonInfo getInsuredInfo() {
		return this.insuredInfo;
	}
	public void setInsuredInfo(InsurancePersonInfo insuredInfo) {
		this.insuredInfo = insuredInfo;
	}

	public String getPremium() {
		return this.premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}

	public String getRate() {
		return this.rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getRelatedOrderNo() {
		return this.relatedOrderNo;
	}
	public void setRelatedOrderNo(String relatedOrderNo) {
		this.relatedOrderNo = relatedOrderNo;
	}

}
