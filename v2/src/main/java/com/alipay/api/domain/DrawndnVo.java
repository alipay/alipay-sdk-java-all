package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支用数据
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class DrawndnVo extends AlipayObject {

	private static final long serialVersionUID = 7635226467894829927L;

	/**
	 * 实收利息，单位为元，小数点保留2位
	 */
	@ApiField("actual_collected_interest")
	private String actualCollectedInterest;

	/**
	 * 贷款余额(本金余额)
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 已收本息，单位为元，小数点保留2位
	 */
	@ApiField("collected_principal_and_interest")
	private String collectedPrincipalAndInterest;

	/**
	 * 授信编号
	 */
	@ApiField("credit_no")
	private String creditNo;

	/**
	 * 支用日,这里代表的是客户这笔支用放款成功日期，如果支用还在放款中或者支用放款失败等，则该值为空
	 */
	@ApiField("drawndn_date")
	private Date drawndnDate;

	/**
	 * 支用编号，代表一笔支用的唯一编号
	 */
	@ApiField("drawndn_no")
	private String drawndnNo;

	/**
	 * 到期日
	 */
	@ApiField("due_date")
	private Date dueDate;

	/**
	 * 五级分类，值类型：NORMAL（正常）、ATTENTION（关注）、SUBPRIME（次级）、DOUBTFUL（可疑）、LOSSES（损失）
	 */
	@ApiField("five_tier_classification")
	private String fiveTierClassification;

	/**
	 * 正常利息，单位为元，小数点保留2位
	 */
	@ApiField("interest")
	private String interest;

	/**
	 * 年利率，小数点保留2位
	 */
	@ApiField("interest_rate")
	private String interestRate;

	/**
	 * 贷款发放额，单位为元，小数点保留2位
	 */
	@ApiField("lending_amount")
	private String lendingAmount;

	/**
	 * 当前逾期期次
	 */
	@ApiField("overduce_terms")
	private Long overduceTerms;

	/**
	 * 当前逾期天数
	 */
	@ApiField("overdue_days")
	private Long overdueDays;

	/**
	 * 逾期利息，单位为元，小数点保留2位
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
	 * 支用状态 ,值类型：INIT(初始),LENDING(发放中),NORMAL(正常),OVD(逾期), CLEAR(结清),OFF(核销), LENDFAIL(发放失败)
	 */
	@ApiField("status")
	private String status;

	public String getActualCollectedInterest() {
		return this.actualCollectedInterest;
	}
	public void setActualCollectedInterest(String actualCollectedInterest) {
		this.actualCollectedInterest = actualCollectedInterest;
	}

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getCollectedPrincipalAndInterest() {
		return this.collectedPrincipalAndInterest;
	}
	public void setCollectedPrincipalAndInterest(String collectedPrincipalAndInterest) {
		this.collectedPrincipalAndInterest = collectedPrincipalAndInterest;
	}

	public String getCreditNo() {
		return this.creditNo;
	}
	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}

	public Date getDrawndnDate() {
		return this.drawndnDate;
	}
	public void setDrawndnDate(Date drawndnDate) {
		this.drawndnDate = drawndnDate;
	}

	public String getDrawndnNo() {
		return this.drawndnNo;
	}
	public void setDrawndnNo(String drawndnNo) {
		this.drawndnNo = drawndnNo;
	}

	public Date getDueDate() {
		return this.dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getFiveTierClassification() {
		return this.fiveTierClassification;
	}
	public void setFiveTierClassification(String fiveTierClassification) {
		this.fiveTierClassification = fiveTierClassification;
	}

	public String getInterest() {
		return this.interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getInterestRate() {
		return this.interestRate;
	}
	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}

	public String getLendingAmount() {
		return this.lendingAmount;
	}
	public void setLendingAmount(String lendingAmount) {
		this.lendingAmount = lendingAmount;
	}

	public Long getOverduceTerms() {
		return this.overduceTerms;
	}
	public void setOverduceTerms(Long overduceTerms) {
		this.overduceTerms = overduceTerms;
	}

	public Long getOverdueDays() {
		return this.overdueDays;
	}
	public void setOverdueDays(Long overdueDays) {
		this.overdueDays = overdueDays;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
