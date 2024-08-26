package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支用还款流水实体
 *
 * @author auto create
 * @since 1.0, 2022-11-09 17:57:48
 */
public class RepaymentRecords extends AlipayObject {

	private static final long serialVersionUID = 6719383589758355218L;

	/**
	 * 交易时间
	 */
	@ApiField("date")
	private Date date;

	/**
	 * 正常本金利息，单位为元，小数点保留2位
	 */
	@ApiField("interest")
	private String interest;

	/**
	 * 逾期本金利息，单位为元，小数点保留2位
	 */
	@ApiField("overdue_interest")
	private String overdueInterest;

	/**
	 * 逾期利息罚息，单位为元，小数点保留2位
	 */
	@ApiField("overdue_interest_penalty")
	private String overdueInterestPenalty;

	/**
	 * 逾期本金，单位为元，小数点保留2位
	 */
	@ApiField("overdue_principal")
	private String overduePrincipal;

	/**
	 * 逾期本金罚息，单位为元，小数点保留2位
	 */
	@ApiField("overdue_principal_penalty")
	private String overduePrincipalPenalty;

	/**
	 * 正常本金，单位为元，小数点保留2位
	 */
	@ApiField("principal")
	private String principal;

	/**
	 * 备注
	 */
	@ApiField("remarks")
	private String remarks;

	/**
	 * 交易总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public Date getDate() {
		return this.date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public String getInterest() {
		return this.interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getOverdueInterest() {
		return this.overdueInterest;
	}
	public void setOverdueInterest(String overdueInterest) {
		this.overdueInterest = overdueInterest;
	}

	public String getOverdueInterestPenalty() {
		return this.overdueInterestPenalty;
	}
	public void setOverdueInterestPenalty(String overdueInterestPenalty) {
		this.overdueInterestPenalty = overdueInterestPenalty;
	}

	public String getOverduePrincipal() {
		return this.overduePrincipal;
	}
	public void setOverduePrincipal(String overduePrincipal) {
		this.overduePrincipal = overduePrincipal;
	}

	public String getOverduePrincipalPenalty() {
		return this.overduePrincipalPenalty;
	}
	public void setOverduePrincipalPenalty(String overduePrincipalPenalty) {
		this.overduePrincipalPenalty = overduePrincipalPenalty;
	}

	public String getPrincipal() {
		return this.principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getRemarks() {
		return this.remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
