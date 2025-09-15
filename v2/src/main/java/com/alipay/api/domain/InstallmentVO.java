package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分期信息
 *
 * @author auto create
 * @since 1.0, 2024-12-02 17:42:07
 */
public class InstallmentVO extends AlipayObject {

	private static final long serialVersionUID = 5291199715944882136L;

	/**
	 * 会计日
	 */
	@ApiField("accounting_date")
	private Date accountingDate;

	/**
	 * 分期结束时间
	 */
	@ApiField("installment_end_date")
	private Date installmentEndDate;

	/**
	 * 分期号，第几期
	 */
	@ApiField("installment_no")
	private Long installmentNo;

	/**
	 * 分期开始时间
	 */
	@ApiField("installment_start_date")
	private Date installmentStartDate;

	/**
	 * 支用受理单号，蚂蚁侧生成
	 */
	@ApiField("institution_loan_apply_no")
	private String institutionLoanApplyNo;

	/**
	 * 蚂蚁侧借据号
	 */
	@ApiField("institution_loan_no")
	private String institutionLoanNo;

	/**
	 * 支用放款金额，元，保留2位小数
	 */
	@ApiField("loan_amount")
	private String loanAmount;

	/**
	 * 外部渠道支用申请单号
	 */
	@ApiField("loan_apply_no")
	private String loanApplyNo;

	/**
	 * 借款结束时间（格式yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("loan_end_date")
	private Date loanEndDate;

	/**
	 * 支用日(放款日)，（格式yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("loan_start_date")
	private Date loanStartDate;

	/**
	 * 还款方式
AVERAGE_CAPITAL_PLUS_INTEREST 等额本息
BALLOON_MORTGAGE 按期付息到期还本
	 */
	@ApiField("repayment_method")
	private String repaymentMethod;

	/**
	 * 分期状态 NEW - 正常 OVERDUE - 逾期 SETTLED - 结清
	 */
	@ApiField("status")
	private String status;

	/**
	 * 分期总期数 6/11/12
	 */
	@ApiField("total_installment_no")
	private Long totalInstallmentNo;

	/**
	 * 未还款利息，单位元，保留2位小数
	 */
	@ApiField("unpaid_interest")
	private String unpaidInterest;

	/**
	 * 未还款罚息，单位元，保留2位小数
	 */
	@ApiField("unpaid_penalty")
	private String unpaidPenalty;

	/**
	 * 未还本金（正常本金+逾期本金），元，保留2位小数
	 */
	@ApiField("unpaid_principal")
	private String unpaidPrincipal;

	/**
	 * 应还总金额，单位元，保留小数点后两位
	 */
	@ApiField("unpaid_total_amount")
	private String unpaidTotalAmount;

	public Date getAccountingDate() {
		return this.accountingDate;
	}
	public void setAccountingDate(Date accountingDate) {
		this.accountingDate = accountingDate;
	}

	public Date getInstallmentEndDate() {
		return this.installmentEndDate;
	}
	public void setInstallmentEndDate(Date installmentEndDate) {
		this.installmentEndDate = installmentEndDate;
	}

	public Long getInstallmentNo() {
		return this.installmentNo;
	}
	public void setInstallmentNo(Long installmentNo) {
		this.installmentNo = installmentNo;
	}

	public Date getInstallmentStartDate() {
		return this.installmentStartDate;
	}
	public void setInstallmentStartDate(Date installmentStartDate) {
		this.installmentStartDate = installmentStartDate;
	}

	public String getInstitutionLoanApplyNo() {
		return this.institutionLoanApplyNo;
	}
	public void setInstitutionLoanApplyNo(String institutionLoanApplyNo) {
		this.institutionLoanApplyNo = institutionLoanApplyNo;
	}

	public String getInstitutionLoanNo() {
		return this.institutionLoanNo;
	}
	public void setInstitutionLoanNo(String institutionLoanNo) {
		this.institutionLoanNo = institutionLoanNo;
	}

	public String getLoanAmount() {
		return this.loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanApplyNo() {
		return this.loanApplyNo;
	}
	public void setLoanApplyNo(String loanApplyNo) {
		this.loanApplyNo = loanApplyNo;
	}

	public Date getLoanEndDate() {
		return this.loanEndDate;
	}
	public void setLoanEndDate(Date loanEndDate) {
		this.loanEndDate = loanEndDate;
	}

	public Date getLoanStartDate() {
		return this.loanStartDate;
	}
	public void setLoanStartDate(Date loanStartDate) {
		this.loanStartDate = loanStartDate;
	}

	public String getRepaymentMethod() {
		return this.repaymentMethod;
	}
	public void setRepaymentMethod(String repaymentMethod) {
		this.repaymentMethod = repaymentMethod;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTotalInstallmentNo() {
		return this.totalInstallmentNo;
	}
	public void setTotalInstallmentNo(Long totalInstallmentNo) {
		this.totalInstallmentNo = totalInstallmentNo;
	}

	public String getUnpaidInterest() {
		return this.unpaidInterest;
	}
	public void setUnpaidInterest(String unpaidInterest) {
		this.unpaidInterest = unpaidInterest;
	}

	public String getUnpaidPenalty() {
		return this.unpaidPenalty;
	}
	public void setUnpaidPenalty(String unpaidPenalty) {
		this.unpaidPenalty = unpaidPenalty;
	}

	public String getUnpaidPrincipal() {
		return this.unpaidPrincipal;
	}
	public void setUnpaidPrincipal(String unpaidPrincipal) {
		this.unpaidPrincipal = unpaidPrincipal;
	}

	public String getUnpaidTotalAmount() {
		return this.unpaidTotalAmount;
	}
	public void setUnpaidTotalAmount(String unpaidTotalAmount) {
		this.unpaidTotalAmount = unpaidTotalAmount;
	}

}
