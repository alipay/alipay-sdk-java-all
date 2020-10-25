package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InstRepayPlan;
import com.alipay.api.domain.InstallmentMetaInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.loanarrangement.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class MybankCreditLoantradeLoanarrangementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5776282194834976168L;

	/** 
	 * 合约状态 NORMAL:正常 ,OVD:逾期, CLEAR:结清, LENDING:放款中（未放款确认）
	 */
	@ApiField("ar_status")
	private String arStatus;

	/** 
	 * 初始放款金额（支用金额）, 单位：元
	 */
	@ApiField("encash_amt")
	private String encashAmt;

	/** 
	 * 贷款合约结束日期
	 */
	@ApiField("end_date")
	private String endDate;

	/** 
	 * 还款计划
	 */
	@ApiListField("installment_repay_plans")
	@ApiField("inst_repay_plan")
	private List<InstRepayPlan> installmentRepayPlans;

	/** 
	 * 剩余利息。 单位：元
	 */
	@ApiField("interest")
	private String interest;

	/** 
	 * 利率 若为分段还款，则存储的为分段利率的分段值。否则，该list仅含一个元素，为当前的利率
	 */
	@ApiListField("interest_rates")
	@ApiField("installment_meta_info")
	private List<InstallmentMetaInfo> interestRates;

	/** 
	 * 合约编号
	 */
	@ApiField("loan_ar_no")
	private String loanArNo;

	/** 
	 * 贷款期限, 包含单位，年(Y)、月(M)、日(D)
	 */
	@ApiField("loan_term")
	private String loanTerm;

	/** 
	 * 逾期天数，若没有逾期则为0，有逾期则为逾期天数
	 */
	@ApiField("ovd_days")
	private String ovdDays;

	/** 
	 * 逾期利息罚息，单位：元
	 */
	@ApiField("overdue_interest_penalty")
	private String overdueInterestPenalty;

	/** 
	 * 逾期本金罚息，单位：元
	 */
	@ApiField("overdue_principal_penalty")
	private String overduePrincipalPenalty;

	/** 
	 * 剩余本金。 单位：元
	 */
	@ApiField("principal")
	private String principal;

	/** 
	 * 还款方式。若为分段还款，则存储的为分段还款方式的分段值。否则，该list仅含一个元素，为当前的还款方式
	 */
	@ApiListField("repay_modes")
	@ApiField("installment_meta_info")
	private List<InstallmentMetaInfo> repayModes;

	/** 
	 * 贷款合约起始日期
	 */
	@ApiListField("start_date")
	@ApiField("string")
	private List<String> startDate;

	public void setArStatus(String arStatus) {
		this.arStatus = arStatus;
	}
	public String getArStatus( ) {
		return this.arStatus;
	}

	public void setEncashAmt(String encashAmt) {
		this.encashAmt = encashAmt;
	}
	public String getEncashAmt( ) {
		return this.encashAmt;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getEndDate( ) {
		return this.endDate;
	}

	public void setInstallmentRepayPlans(List<InstRepayPlan> installmentRepayPlans) {
		this.installmentRepayPlans = installmentRepayPlans;
	}
	public List<InstRepayPlan> getInstallmentRepayPlans( ) {
		return this.installmentRepayPlans;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}
	public String getInterest( ) {
		return this.interest;
	}

	public void setInterestRates(List<InstallmentMetaInfo> interestRates) {
		this.interestRates = interestRates;
	}
	public List<InstallmentMetaInfo> getInterestRates( ) {
		return this.interestRates;
	}

	public void setLoanArNo(String loanArNo) {
		this.loanArNo = loanArNo;
	}
	public String getLoanArNo( ) {
		return this.loanArNo;
	}

	public void setLoanTerm(String loanTerm) {
		this.loanTerm = loanTerm;
	}
	public String getLoanTerm( ) {
		return this.loanTerm;
	}

	public void setOvdDays(String ovdDays) {
		this.ovdDays = ovdDays;
	}
	public String getOvdDays( ) {
		return this.ovdDays;
	}

	public void setOverdueInterestPenalty(String overdueInterestPenalty) {
		this.overdueInterestPenalty = overdueInterestPenalty;
	}
	public String getOverdueInterestPenalty( ) {
		return this.overdueInterestPenalty;
	}

	public void setOverduePrincipalPenalty(String overduePrincipalPenalty) {
		this.overduePrincipalPenalty = overduePrincipalPenalty;
	}
	public String getOverduePrincipalPenalty( ) {
		return this.overduePrincipalPenalty;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String getPrincipal( ) {
		return this.principal;
	}

	public void setRepayModes(List<InstallmentMetaInfo> repayModes) {
		this.repayModes = repayModes;
	}
	public List<InstallmentMetaInfo> getRepayModes( ) {
		return this.repayModes;
	}

	public void setStartDate(List<String> startDate) {
		this.startDate = startDate;
	}
	public List<String> getStartDate( ) {
		return this.startDate;
	}

}
