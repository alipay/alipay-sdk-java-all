package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 定价信息
 *
 * @author auto create
 * @since 1.0, 2025-09-18 16:03:33
 */
public class CreditPricing extends AlipayObject {

	private static final long serialVersionUID = 7713339422563857622L;

	/**
	 * 金额，单位分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 是否默认定价
	 */
	@ApiField("default_credit_pricing")
	private Boolean defaultCreditPricing;

	/**
	 * 资金利率，如为8%，则为0.08
	 */
	@ApiField("funding_rate")
	private String fundingRate;

	/**
	 * 年利率，如为8%，则为0.08
	 */
	@ApiField("int_rate")
	private String intRate;

	/**
	 * 贷款期限长度，单位根据loan_term_unit字段决定(Y年/M月/D日)
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/**
	 * 贷款期限单位：Y、M、D分别代表年月日
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/**
	 * 还款方式
	 */
	@ApiField("repay_type")
	private String repayType;

	/**
	 * 担保费率，如为8%，则为0.08
	 */
	@ApiField("serv_rate")
	private String servRate;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Boolean getDefaultCreditPricing() {
		return this.defaultCreditPricing;
	}
	public void setDefaultCreditPricing(Boolean defaultCreditPricing) {
		this.defaultCreditPricing = defaultCreditPricing;
	}

	public String getFundingRate() {
		return this.fundingRate;
	}
	public void setFundingRate(String fundingRate) {
		this.fundingRate = fundingRate;
	}

	public String getIntRate() {
		return this.intRate;
	}
	public void setIntRate(String intRate) {
		this.intRate = intRate;
	}

	public Long getLoanTerm() {
		return this.loanTerm;
	}
	public void setLoanTerm(Long loanTerm) {
		this.loanTerm = loanTerm;
	}

	public String getLoanTermUnit() {
		return this.loanTermUnit;
	}
	public void setLoanTermUnit(String loanTermUnit) {
		this.loanTermUnit = loanTermUnit;
	}

	public String getRepayType() {
		return this.repayType;
	}
	public void setRepayType(String repayType) {
		this.repayType = repayType;
	}

	public String getServRate() {
		return this.servRate;
	}
	public void setServRate(String servRate) {
		this.servRate = servRate;
	}

}
