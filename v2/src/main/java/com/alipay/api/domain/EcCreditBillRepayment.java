package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业授信账单还款信息
 *
 * @author auto create
 * @since 1.0, 2024-08-13 15:19:03
 */
public class EcCreditBillRepayment extends AlipayObject {

	private static final long serialVersionUID = 7214642646457496737L;

	/**
	 * 银行借据单号
	 */
	@ApiField("bank_loan_no")
	private String bankLoanNo;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 企业当时借款剩余待还金额，单位元，精确到分
	 */
	@ApiField("loan_balance")
	private String loanBalance;

	/**
	 * 商户借款申请单号
	 */
	@ApiField("loan_out_biz_no")
	private String loanOutBizNo;

	/**
	 * 企业授信账单还款金额，单位元，精确到分
	 */
	@ApiField("repay_capital")
	private String repayCapital;

	/**
	 * 企业授信账单还款时间
	 */
	@ApiField("repay_date")
	private Date repayDate;

	/**
	 * 企业授信账单还款利息，单位元，精确到分
	 */
	@ApiField("repay_interest")
	private String repayInterest;

	/**
	 * 枚举类型，P-部分还款、F-全额还款
	 */
	@ApiField("repay_status")
	private String repayStatus;

	public String getBankLoanNo() {
		return this.bankLoanNo;
	}
	public void setBankLoanNo(String bankLoanNo) {
		this.bankLoanNo = bankLoanNo;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getLoanBalance() {
		return this.loanBalance;
	}
	public void setLoanBalance(String loanBalance) {
		this.loanBalance = loanBalance;
	}

	public String getLoanOutBizNo() {
		return this.loanOutBizNo;
	}
	public void setLoanOutBizNo(String loanOutBizNo) {
		this.loanOutBizNo = loanOutBizNo;
	}

	public String getRepayCapital() {
		return this.repayCapital;
	}
	public void setRepayCapital(String repayCapital) {
		this.repayCapital = repayCapital;
	}

	public Date getRepayDate() {
		return this.repayDate;
	}
	public void setRepayDate(Date repayDate) {
		this.repayDate = repayDate;
	}

	public String getRepayInterest() {
		return this.repayInterest;
	}
	public void setRepayInterest(String repayInterest) {
		this.repayInterest = repayInterest;
	}

	public String getRepayStatus() {
		return this.repayStatus;
	}
	public void setRepayStatus(String repayStatus) {
		this.repayStatus = repayStatus;
	}

}
