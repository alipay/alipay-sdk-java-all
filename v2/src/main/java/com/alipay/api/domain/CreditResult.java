package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授信结果,每一笔授信编号对应的一笔授信结果；主要提供ISV查看
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class CreditResult extends AlipayObject {

	private static final long serialVersionUID = 6794659342373845365L;

	/**
	 * 授信金额
	 */
	@ApiField("credit_line")
	private String creditLine;

	/**
	 * 授信编号
	 */
	@ApiField("credit_no")
	private String creditNo;

	/**
	 * 一笔授信规定的从开始到结束的周期，例如12个月，30天等。
	 */
	@ApiField("credit_term")
	private Long creditTerm;

	/**
	 * 年、月、日
	 */
	@ApiField("credit_term_unit")
	private String creditTermUnit;

	/**
	 * 当贷款机构给客户一个可使用的授信时，只有在某一个日期之后客户才能使用，这个日期就是授信使用生效日期。
	 */
	@ApiField("effective_date")
	private Date effectiveDate;

	/**
	 * 当贷款机构给客户一个可使用的授信时，客户必须要在某一个日期之前必须支用，否则此笔授信就会失效。
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 技术服务费
	 */
	@ApiField("fee_rate")
	private String feeRate;

	/**
	 * 贷款利率
	 */
	@ApiField("interest_rate")
	private String interestRate;

	/**
	 * 一笔授信支用规定的从开始到结束的周期，例如12个月，30天等。
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/**
	 * 年、月、日
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/**
	 * 还款方式，例如等额本息
	 */
	@ApiField("repayment_mode")
	private String repaymentMode;

	public String getCreditLine() {
		return this.creditLine;
	}
	public void setCreditLine(String creditLine) {
		this.creditLine = creditLine;
	}

	public String getCreditNo() {
		return this.creditNo;
	}
	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}

	public Long getCreditTerm() {
		return this.creditTerm;
	}
	public void setCreditTerm(Long creditTerm) {
		this.creditTerm = creditTerm;
	}

	public String getCreditTermUnit() {
		return this.creditTermUnit;
	}
	public void setCreditTermUnit(String creditTermUnit) {
		this.creditTermUnit = creditTermUnit;
	}

	public Date getEffectiveDate() {
		return this.effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public String getFeeRate() {
		return this.feeRate;
	}
	public void setFeeRate(String feeRate) {
		this.feeRate = feeRate;
	}

	public String getInterestRate() {
		return this.interestRate;
	}
	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
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

	public String getRepaymentMode() {
		return this.repaymentMode;
	}
	public void setRepaymentMode(String repaymentMode) {
		this.repaymentMode = repaymentMode;
	}

}
