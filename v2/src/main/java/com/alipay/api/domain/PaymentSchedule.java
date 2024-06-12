package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支用还款计划（包括虚拟还款和真实还款）
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class PaymentSchedule extends AlipayObject {

	private static final long serialVersionUID = 8316638212349819726L;

	/**
	 * 还款日
	 */
	@ApiField("date")
	private Date date;

	/**
	 * 已还利息总和，单位为元，小数点保留2位
	 */
	@ApiField("repaid_interest_total")
	private String repaidInterestTotal;

	/**
	 * 已还罚息总和，单位为元，小数点保留2位
	 */
	@ApiField("repaid_penalty_total")
	private String repaidPenaltyTotal;

	/**
	 * 已还本金总和，单位为元，小数点保留2位
	 */
	@ApiField("repaid_principal_total")
	private String repaidPrincipalTotal;

	/**
	 * 期初时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 期次
	 */
	@ApiField("term")
	private Long term;

	/**
	 * 应还利息总和，单位为元，小数点保留2位
	 */
	@ApiField("unpaid_interest_total")
	private String unpaidInterestTotal;

	/**
	 * 应还罚息总和，单位为元，小数点保留2位
	 */
	@ApiField("unpaid_penalty_total")
	private String unpaidPenaltyTotal;

	/**
	 * 应还本金总和，单位为元，小数点保留2位
	 */
	@ApiField("unpaid_principal_total")
	private String unpaidPrincipalTotal;

	public Date getDate() {
		return this.date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public String getRepaidInterestTotal() {
		return this.repaidInterestTotal;
	}
	public void setRepaidInterestTotal(String repaidInterestTotal) {
		this.repaidInterestTotal = repaidInterestTotal;
	}

	public String getRepaidPenaltyTotal() {
		return this.repaidPenaltyTotal;
	}
	public void setRepaidPenaltyTotal(String repaidPenaltyTotal) {
		this.repaidPenaltyTotal = repaidPenaltyTotal;
	}

	public String getRepaidPrincipalTotal() {
		return this.repaidPrincipalTotal;
	}
	public void setRepaidPrincipalTotal(String repaidPrincipalTotal) {
		this.repaidPrincipalTotal = repaidPrincipalTotal;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Long getTerm() {
		return this.term;
	}
	public void setTerm(Long term) {
		this.term = term;
	}

	public String getUnpaidInterestTotal() {
		return this.unpaidInterestTotal;
	}
	public void setUnpaidInterestTotal(String unpaidInterestTotal) {
		this.unpaidInterestTotal = unpaidInterestTotal;
	}

	public String getUnpaidPenaltyTotal() {
		return this.unpaidPenaltyTotal;
	}
	public void setUnpaidPenaltyTotal(String unpaidPenaltyTotal) {
		this.unpaidPenaltyTotal = unpaidPenaltyTotal;
	}

	public String getUnpaidPrincipalTotal() {
		return this.unpaidPrincipalTotal;
	}
	public void setUnpaidPrincipalTotal(String unpaidPrincipalTotal) {
		this.unpaidPrincipalTotal = unpaidPrincipalTotal;
	}

}
