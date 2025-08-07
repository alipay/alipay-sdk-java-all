package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 还款详情信息，借据维度还款详情信息。
 *
 * @author auto create
 * @since 1.0, 2024-12-02 17:42:38
 */
public class RepayLoanDetail extends AlipayObject {

	private static final long serialVersionUID = 7642859985987392728L;

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
	 * 外部渠道支用申请单号
	 */
	@ApiField("loan_apply_no")
	private String loanApplyNo;

	/**
	 * 还款利息，单位：元，精度：保留两位小数；还款成功时返回。
	 */
	@ApiField("repaid_interest")
	private String repaidInterest;

	/**
	 * 还款罚息（本罚+利罚），单位：元，精度：保留两位小数；还款成功时返回。
	 */
	@ApiField("repaid_penalty")
	private String repaidPenalty;

	/**
	 * 还款本金，单位：元，精度：保留两位小数；还款成功时返回。
	 */
	@ApiField("repaid_principal")
	private String repaidPrincipal;

	/**
	 * 还款成功时间，还款成功时返回（格式yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("repaid_time")
	private Date repaidTime;

	/**
	 * 还款总额，单位：元，精度：保留两位小数。还款成功时返回。
	 */
	@ApiField("repaid_total_amount")
	private String repaidTotalAmount;

	/**
	 * 还款明细单号，借据维度还款明细
	 */
	@ApiField("repay_detail_no")
	private String repayDetailNo;

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

	public String getLoanApplyNo() {
		return this.loanApplyNo;
	}
	public void setLoanApplyNo(String loanApplyNo) {
		this.loanApplyNo = loanApplyNo;
	}

	public String getRepaidInterest() {
		return this.repaidInterest;
	}
	public void setRepaidInterest(String repaidInterest) {
		this.repaidInterest = repaidInterest;
	}

	public String getRepaidPenalty() {
		return this.repaidPenalty;
	}
	public void setRepaidPenalty(String repaidPenalty) {
		this.repaidPenalty = repaidPenalty;
	}

	public String getRepaidPrincipal() {
		return this.repaidPrincipal;
	}
	public void setRepaidPrincipal(String repaidPrincipal) {
		this.repaidPrincipal = repaidPrincipal;
	}

	public Date getRepaidTime() {
		return this.repaidTime;
	}
	public void setRepaidTime(Date repaidTime) {
		this.repaidTime = repaidTime;
	}

	public String getRepaidTotalAmount() {
		return this.repaidTotalAmount;
	}
	public void setRepaidTotalAmount(String repaidTotalAmount) {
		this.repaidTotalAmount = repaidTotalAmount;
	}

	public String getRepayDetailNo() {
		return this.repayDetailNo;
	}
	public void setRepayDetailNo(String repayDetailNo) {
		this.repayDetailNo = repayDetailNo;
	}

}
