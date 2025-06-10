package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贷款申请基本信息
 *
 * @author auto create
 * @since 1.0, 2018-11-13 19:45:42
 */
public class BaseLoanApplyVO extends AlipayObject {

	private static final long serialVersionUID = 8651356258346832189L;

	/**
	 * 贷款申请金额
	 */
	@ApiField("apply_amt")
	private String applyAmt;

	/**
	 * 申请时间，即用户提交贷款申请的时间
	 */
	@ApiField("apply_date")
	private Date applyDate;

	/**
	 * 贷款申请受理单号
	 */
	@ApiField("apply_receipt_no")
	private String applyReceiptNo;

	/**
	 * 贷款期限，包含贷款期数和期数单位
	 */
	@ApiField("loan_term")
	private LoanTerm loanTerm;

	/**
	 * 贷款申请状态，取值{SUBMITTED, LENDING, USING, OVD, CLEAR, FAILED}：SUBMITTED-已提交; LENDING-放款中; USING-使用中; OVD-已逾期; CLEAR-已结清; FAILED-已失败
	 */
	@ApiField("status")
	private String status;

	public String getApplyAmt() {
		return this.applyAmt;
	}
	public void setApplyAmt(String applyAmt) {
		this.applyAmt = applyAmt;
	}

	public Date getApplyDate() {
		return this.applyDate;
	}
	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public String getApplyReceiptNo() {
		return this.applyReceiptNo;
	}
	public void setApplyReceiptNo(String applyReceiptNo) {
		this.applyReceiptNo = applyReceiptNo;
	}

	public LoanTerm getLoanTerm() {
		return this.loanTerm;
	}
	public void setLoanTerm(LoanTerm loanTerm) {
		this.loanTerm = loanTerm;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
