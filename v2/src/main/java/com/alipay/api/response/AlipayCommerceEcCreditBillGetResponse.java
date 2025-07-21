package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.credit.bill.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-08 15:27:04
 */
public class AlipayCommerceEcCreditBillGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7883437342366616866L;

	/** 
	 * 当前期数
	 */
	@ApiField("cp_numbers")
	private String cpNumbers;

	/** 
	 * 本期应还利息，单位元，精度分
	 */
	@ApiField("cp_payable_interest")
	private String cpPayableInterest;

	/** 
	 * 本期应还罚息，单位元
	 */
	@ApiField("cp_payable_penalty")
	private String cpPayablePenalty;

	/** 
	 * 本期应还本金，单位元，精度分
	 */
	@ApiField("cp_payable_principal")
	private String cpPayablePrincipal;

	/** 
	 * 本期未还利息，单位元，精度分
	 */
	@ApiField("cp_unpaid_interest")
	private String cpUnpaidInterest;

	/** 
	 * 本期未还罚息，单位元
	 */
	@ApiField("cp_unpaid_penalty")
	private String cpUnpaidPenalty;

	/** 
	 * 本期未还本金，单位元，精度分
	 */
	@ApiField("cp_unpaid_principal")
	private String cpUnpaidPrincipal;

	/** 
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/** 
	 * 是否预期：Y-逾期、N-未逾期
	 */
	@ApiField("overdue")
	private String overdue;

	/** 
	 * 还款状态：Y-已还款、N-未还款
	 */
	@ApiField("payment_status")
	private String paymentStatus;

	/** 
	 * 还款日期，格式"yyyy-MM-dd"
	 */
	@ApiField("repayment_date")
	private Date repaymentDate;

	public void setCpNumbers(String cpNumbers) {
		this.cpNumbers = cpNumbers;
	}
	public String getCpNumbers( ) {
		return this.cpNumbers;
	}

	public void setCpPayableInterest(String cpPayableInterest) {
		this.cpPayableInterest = cpPayableInterest;
	}
	public String getCpPayableInterest( ) {
		return this.cpPayableInterest;
	}

	public void setCpPayablePenalty(String cpPayablePenalty) {
		this.cpPayablePenalty = cpPayablePenalty;
	}
	public String getCpPayablePenalty( ) {
		return this.cpPayablePenalty;
	}

	public void setCpPayablePrincipal(String cpPayablePrincipal) {
		this.cpPayablePrincipal = cpPayablePrincipal;
	}
	public String getCpPayablePrincipal( ) {
		return this.cpPayablePrincipal;
	}

	public void setCpUnpaidInterest(String cpUnpaidInterest) {
		this.cpUnpaidInterest = cpUnpaidInterest;
	}
	public String getCpUnpaidInterest( ) {
		return this.cpUnpaidInterest;
	}

	public void setCpUnpaidPenalty(String cpUnpaidPenalty) {
		this.cpUnpaidPenalty = cpUnpaidPenalty;
	}
	public String getCpUnpaidPenalty( ) {
		return this.cpUnpaidPenalty;
	}

	public void setCpUnpaidPrincipal(String cpUnpaidPrincipal) {
		this.cpUnpaidPrincipal = cpUnpaidPrincipal;
	}
	public String getCpUnpaidPrincipal( ) {
		return this.cpUnpaidPrincipal;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public String getEnterpriseId( ) {
		return this.enterpriseId;
	}

	public void setOverdue(String overdue) {
		this.overdue = overdue;
	}
	public String getOverdue( ) {
		return this.overdue;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getPaymentStatus( ) {
		return this.paymentStatus;
	}

	public void setRepaymentDate(Date repaymentDate) {
		this.repaymentDate = repaymentDate;
	}
	public Date getRepaymentDate( ) {
		return this.repaymentDate;
	}

}
