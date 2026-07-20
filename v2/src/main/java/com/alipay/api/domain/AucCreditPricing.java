package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拍卖分期申请单授信定价信息
 *
 * @author auto create
 * @since 1.0, 2026-07-17 13:46:51
 */
public class AucCreditPricing extends AlipayObject {

	private static final long serialVersionUID = 1455766673536579475L;

	/**
	 * 资金利率，如为12.3%，则为0.123
	 */
	@ApiField("funding_rate")
	private String fundingRate;

	/**
	 * 年利率，最终对客的利率，或称综合利率。
int_rate = funding_rate + serv_rate
如为12.6%，则为0.126
	 */
	@ApiField("int_rate")
	private String intRate;

	/**
	 * 贷款期限长度
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/**
	 * 贷款期限单位
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/**
	 * 还款方式
	 */
	@ApiField("repay_type")
	private String repayType;

	/**
	 * 服务费率（融担费率、保险费率等），如为0.3%，则为0.003
注：如果不存在担保费率，则该字段不要传任何值（null）	0.003
	 */
	@ApiField("serv_rate")
	private String servRate;

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
