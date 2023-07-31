package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贷款方案
 *
 * @author auto create
 * @since 1.0, 2017-03-10 17:07:31
 */
public class LoanScheme extends AlipayObject {

	private static final long serialVersionUID = 2844628364141991283L;

	/**
	 * 授信有效截止日期(日期精度为天,包含截止日)
	 */
	@ApiField("credit_expire_date")
	private Date creditExpireDate;

	/**
	 * 授信额度，默认人民币，精确到小数点两位，单位元
	 */
	@ApiField("credit_lmt_amt")
	private String creditLmtAmt;

	/**
	 * 授信编号
	 */
	@ApiField("credit_no")
	private String creditNo;

	/**
	 * 授信方式
	 */
	@ApiField("credit_source")
	private String creditSource;

	/**
	 * 授信有效起始日期(日期精度为天,包含起始日)
	 */
	@ApiField("credit_start_date")
	private Date creditStartDate;

	/**
	 * 利率. 年利率小数
	 */
	@ApiField("int_rate")
	private String intRate;

	/**
	 * BC政策码
	 */
	@ApiField("loan_policy_code")
	private String loanPolicyCode;

	/**
	 * 贷款期限
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/**
	 * 贷款期限单位
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/**
	 * 可贷额度，默认人民币，精确到小数点两位，单位元
	 */
	@ApiField("loanable_amt")
	private String loanableAmt;

	/**
	 * 统一还款日，若无统一还款日，则为空
	 */
	@ApiField("repay_day")
	private Long repayDay;

	/**
	 * 还款方式
	 */
	@ApiField("repay_mode")
	private String repayMode;

	/**
	 * 销售产品码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * 销售产品版本
	 */
	@ApiField("sale_pd_version")
	private String salePdVersion;

	public Date getCreditExpireDate() {
		return this.creditExpireDate;
	}
	public void setCreditExpireDate(Date creditExpireDate) {
		this.creditExpireDate = creditExpireDate;
	}

	public String getCreditLmtAmt() {
		return this.creditLmtAmt;
	}
	public void setCreditLmtAmt(String creditLmtAmt) {
		this.creditLmtAmt = creditLmtAmt;
	}

	public String getCreditNo() {
		return this.creditNo;
	}
	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}

	public String getCreditSource() {
		return this.creditSource;
	}
	public void setCreditSource(String creditSource) {
		this.creditSource = creditSource;
	}

	public Date getCreditStartDate() {
		return this.creditStartDate;
	}
	public void setCreditStartDate(Date creditStartDate) {
		this.creditStartDate = creditStartDate;
	}

	public String getIntRate() {
		return this.intRate;
	}
	public void setIntRate(String intRate) {
		this.intRate = intRate;
	}

	public String getLoanPolicyCode() {
		return this.loanPolicyCode;
	}
	public void setLoanPolicyCode(String loanPolicyCode) {
		this.loanPolicyCode = loanPolicyCode;
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

	public String getLoanableAmt() {
		return this.loanableAmt;
	}
	public void setLoanableAmt(String loanableAmt) {
		this.loanableAmt = loanableAmt;
	}

	public Long getRepayDay() {
		return this.repayDay;
	}
	public void setRepayDay(Long repayDay) {
		this.repayDay = repayDay;
	}

	public String getRepayMode() {
		return this.repayMode;
	}
	public void setRepayMode(String repayMode) {
		this.repayMode = repayMode;
	}

	public String getSalePdCode() {
		return this.salePdCode;
	}
	public void setSalePdCode(String salePdCode) {
		this.salePdCode = salePdCode;
	}

	public String getSalePdVersion() {
		return this.salePdVersion;
	}
	public void setSalePdVersion(String salePdVersion) {
		this.salePdVersion = salePdVersion;
	}

}
