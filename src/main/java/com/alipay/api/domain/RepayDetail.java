package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 助学贷款还款明细
 *
 * @author auto create
 * @since 1.0, 2017-11-21 17:51:13
 */
public class RepayDetail extends AlipayObject {

	private static final long serialVersionUID = 7112597554121153214L;

	/**
	 * 应还本金
	 */
	@ApiField("capital_amount")
	private String capitalAmount;

	/**
	 * 贷款合同编号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 应还利息
	 */
	@ApiField("interest_amount")
	private String interestAmount;

	/**
	 * 贷款年份
	 */
	@ApiField("loan_year")
	private String loanYear;

	/**
	 * 总还款金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getCapitalAmount() {
		return this.capitalAmount;
	}
	public void setCapitalAmount(String capitalAmount) {
		this.capitalAmount = capitalAmount;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getInterestAmount() {
		return this.interestAmount;
	}
	public void setInterestAmount(String interestAmount) {
		this.interestAmount = interestAmount;
	}

	public String getLoanYear() {
		return this.loanYear;
	}
	public void setLoanYear(String loanYear) {
		this.loanYear = loanYear;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
