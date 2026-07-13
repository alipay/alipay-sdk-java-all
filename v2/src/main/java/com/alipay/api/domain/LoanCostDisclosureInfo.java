package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贷款成本披露信息
 *
 * @author auto create
 * @since 1.0, 2026-07-08 11:43:32
 */
public class LoanCostDisclosureInfo extends AlipayObject {

	private static final long serialVersionUID = 1317816397989111917L;

	/**
	 * 综合服务费率是否有盖帽
	 */
	@ApiField("capped")
	private Boolean capped;

	/**
	 * 综合融资成本率，正常履约年化综合融资成本，小数格式
	 */
	@ApiField("cost_rate")
	private String costRate;

	/**
	 * 担保费收取主体（机构简称）
	 */
	@ApiField("guarantee_fee_org_name")
	private String guaranteeFeeOrgName;

	/**
	 * 担保费年化费率，小数格式
	 */
	@ApiField("guarantee_fee_rate")
	private String guaranteeFeeRate;

	/**
	 * 担保费利率类型
	 */
	@ApiField("guarantee_fee_rate_type")
	private String guaranteeFeeRateType;

	/**
	 * 担保费还款方式
	 */
	@ApiField("guarantee_fee_repay_mode")
	private String guaranteeFeeRepayMode;

	/**
	 * 贷款利息收取主体（机构简称）
	 */
	@ApiField("loan_interest_org_name")
	private String loanInterestOrgName;

	/**
	 * 贷款年化利率，小数格式
	 */
	@ApiField("loan_interest_rate")
	private String loanInterestRate;

	/**
	 * 贷款利率类型
	 */
	@ApiField("loan_interest_rate_type")
	private String loanInterestRateType;

	/**
	 * 贷款利率还款方式
	 */
	@ApiField("loan_interest_repay_mode")
	private String loanInterestRepayMode;

	/**
	 * 挪用罚息收取主体（机构简称）
	 */
	@ApiField("misappropriation_penalty_interest_org_name")
	private String misappropriationPenaltyInterestOrgName;

	/**
	 * 挪用罚息利率及上浮比例和具体文案
	 */
	@ApiField("misappropriation_penalty_interest_text")
	private String misappropriationPenaltyInterestText;

	/**
	 * 其他费用收取主体（机构简称）
	 */
	@ApiField("other_fee_org_name")
	private String otherFeeOrgName;

	/**
	 * 其他费用具体文案
	 */
	@ApiField("other_fee_text")
	private String otherFeeText;

	/**
	 * 逾期罚息收取主体（机构简称）
	 */
	@ApiField("overdue_penalty_interest_org_name")
	private String overduePenaltyInterestOrgName;

	/**
	 * 逾期罚息利率及上浮比例和具体文案
	 */
	@ApiField("overdue_penalty_interest_text")
	private String overduePenaltyInterestText;

	/**
	 * 提前结清违约金/提前还款手续费费项名称
	 */
	@ApiField("prepayment_penalty_name")
	private String prepaymentPenaltyName;

	/**
	 * 提前结清违约金收取主体（机构简称）
	 */
	@ApiField("prepayment_penalty_org_name")
	private String prepaymentPenaltyOrgName;

	/**
	 * 提前结清违约金费率/收取标准和具体文案
	 */
	@ApiField("prepayment_penalty_text")
	private String prepaymentPenaltyText;

	public Boolean getCapped() {
		return this.capped;
	}
	public void setCapped(Boolean capped) {
		this.capped = capped;
	}

	public String getCostRate() {
		return this.costRate;
	}
	public void setCostRate(String costRate) {
		this.costRate = costRate;
	}

	public String getGuaranteeFeeOrgName() {
		return this.guaranteeFeeOrgName;
	}
	public void setGuaranteeFeeOrgName(String guaranteeFeeOrgName) {
		this.guaranteeFeeOrgName = guaranteeFeeOrgName;
	}

	public String getGuaranteeFeeRate() {
		return this.guaranteeFeeRate;
	}
	public void setGuaranteeFeeRate(String guaranteeFeeRate) {
		this.guaranteeFeeRate = guaranteeFeeRate;
	}

	public String getGuaranteeFeeRateType() {
		return this.guaranteeFeeRateType;
	}
	public void setGuaranteeFeeRateType(String guaranteeFeeRateType) {
		this.guaranteeFeeRateType = guaranteeFeeRateType;
	}

	public String getGuaranteeFeeRepayMode() {
		return this.guaranteeFeeRepayMode;
	}
	public void setGuaranteeFeeRepayMode(String guaranteeFeeRepayMode) {
		this.guaranteeFeeRepayMode = guaranteeFeeRepayMode;
	}

	public String getLoanInterestOrgName() {
		return this.loanInterestOrgName;
	}
	public void setLoanInterestOrgName(String loanInterestOrgName) {
		this.loanInterestOrgName = loanInterestOrgName;
	}

	public String getLoanInterestRate() {
		return this.loanInterestRate;
	}
	public void setLoanInterestRate(String loanInterestRate) {
		this.loanInterestRate = loanInterestRate;
	}

	public String getLoanInterestRateType() {
		return this.loanInterestRateType;
	}
	public void setLoanInterestRateType(String loanInterestRateType) {
		this.loanInterestRateType = loanInterestRateType;
	}

	public String getLoanInterestRepayMode() {
		return this.loanInterestRepayMode;
	}
	public void setLoanInterestRepayMode(String loanInterestRepayMode) {
		this.loanInterestRepayMode = loanInterestRepayMode;
	}

	public String getMisappropriationPenaltyInterestOrgName() {
		return this.misappropriationPenaltyInterestOrgName;
	}
	public void setMisappropriationPenaltyInterestOrgName(String misappropriationPenaltyInterestOrgName) {
		this.misappropriationPenaltyInterestOrgName = misappropriationPenaltyInterestOrgName;
	}

	public String getMisappropriationPenaltyInterestText() {
		return this.misappropriationPenaltyInterestText;
	}
	public void setMisappropriationPenaltyInterestText(String misappropriationPenaltyInterestText) {
		this.misappropriationPenaltyInterestText = misappropriationPenaltyInterestText;
	}

	public String getOtherFeeOrgName() {
		return this.otherFeeOrgName;
	}
	public void setOtherFeeOrgName(String otherFeeOrgName) {
		this.otherFeeOrgName = otherFeeOrgName;
	}

	public String getOtherFeeText() {
		return this.otherFeeText;
	}
	public void setOtherFeeText(String otherFeeText) {
		this.otherFeeText = otherFeeText;
	}

	public String getOverduePenaltyInterestOrgName() {
		return this.overduePenaltyInterestOrgName;
	}
	public void setOverduePenaltyInterestOrgName(String overduePenaltyInterestOrgName) {
		this.overduePenaltyInterestOrgName = overduePenaltyInterestOrgName;
	}

	public String getOverduePenaltyInterestText() {
		return this.overduePenaltyInterestText;
	}
	public void setOverduePenaltyInterestText(String overduePenaltyInterestText) {
		this.overduePenaltyInterestText = overduePenaltyInterestText;
	}

	public String getPrepaymentPenaltyName() {
		return this.prepaymentPenaltyName;
	}
	public void setPrepaymentPenaltyName(String prepaymentPenaltyName) {
		this.prepaymentPenaltyName = prepaymentPenaltyName;
	}

	public String getPrepaymentPenaltyOrgName() {
		return this.prepaymentPenaltyOrgName;
	}
	public void setPrepaymentPenaltyOrgName(String prepaymentPenaltyOrgName) {
		this.prepaymentPenaltyOrgName = prepaymentPenaltyOrgName;
	}

	public String getPrepaymentPenaltyText() {
		return this.prepaymentPenaltyText;
	}
	public void setPrepaymentPenaltyText(String prepaymentPenaltyText) {
		this.prepaymentPenaltyText = prepaymentPenaltyText;
	}

}
