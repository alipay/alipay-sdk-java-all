package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 定价信息
 *
 * @author auto create
 * @since 1.0, 2025-05-08 14:48:56
 */
public class CreditPricing extends AlipayObject {

	private static final long serialVersionUID = 8256626112139789742L;

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

}
