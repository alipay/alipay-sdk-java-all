package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费贷还款借据信息ITEM
 *
 * @author auto create
 * @since 1.0, 2025-04-21 15:15:48
 */
public class ConsumerLoanLoanInfoItem extends AlipayObject {

	private static final long serialVersionUID = 2586275754295633877L;

	/**
	 * 是否可提前还款，true-允许，false-不允许
	 */
	@ApiField("allowed_pay_off_early")
	private Boolean allowedPayOffEarly;

	/**
	 * 剩余待还担保费或保险费，单位为分，1000代表10.00元，若无该项费用可填0
	 */
	@ApiField("last_insurance_amount")
	private Long lastInsuranceAmount;

	/**
	 * 剩余待还利息，单位为分，1000代表10.00元
	 */
	@ApiField("last_interest_amount")
	private Long lastInterestAmount;

	/**
	 * 剩余待还罚息，单位为分，1000代表10.00元，若无该项费用可填0
	 */
	@ApiField("last_penalty_interest_amount")
	private Long lastPenaltyInterestAmount;

	/**
	 * 剩余期数
	 */
	@ApiField("last_period_count")
	private Long lastPeriodCount;

	/**
	 * 剩余待还本金，单位为分，1000代表10.00元
	 */
	@ApiField("last_principal_amount")
	private Long lastPrincipalAmount;

	/**
	 * 当前该笔借据剩余待还总金额，单位为分，如1000代表10.00元
	 */
	@ApiField("last_total_repay_amount")
	private Long lastTotalRepayAmount;

	/**
	 * 总借款金额，单位为分，1000代表10.00元
	 */
	@ApiField("loan_amount")
	private Long loanAmount;

	/**
	 * 贷款时间
	 */
	@ApiField("loan_date")
	private String loanDate;

	/**
	 * 借据ID
	 */
	@ApiField("loan_id")
	private String loanId;

	/**
	 * 还款方式，包含等额本息（EQUAL），先息后本（NOT_EQUAL）
	 */
	@ApiField("repay_method")
	private String repayMethod;

	/**
	 * selectType = ALL
默认勾选全部逾期，不可取消
其它可还款还款账单默认不勾选
支持多选
selectType = PART
默认勾选首条逾期，不可取消
勾选逾期账单有次序限制
其它可还款账单默认不勾选
支持多选
selectType = SINGLE
默认勾选首条逾期，不可取消
若没有逾期，其它可还款账单默认勾选首条
支持单选
selectType = UN_LIMIT
不限制
	 */
	@ApiField("select_type")
	private String selectType;

	/**
	 * 借款记录状态，如果包含有逾期账单，就是逾期，没有就是正常
NORMAL：正常
OVER_DUE：逾期
	 */
	@ApiField("status")
	private String status;

	public Boolean getAllowedPayOffEarly() {
		return this.allowedPayOffEarly;
	}
	public void setAllowedPayOffEarly(Boolean allowedPayOffEarly) {
		this.allowedPayOffEarly = allowedPayOffEarly;
	}

	public Long getLastInsuranceAmount() {
		return this.lastInsuranceAmount;
	}
	public void setLastInsuranceAmount(Long lastInsuranceAmount) {
		this.lastInsuranceAmount = lastInsuranceAmount;
	}

	public Long getLastInterestAmount() {
		return this.lastInterestAmount;
	}
	public void setLastInterestAmount(Long lastInterestAmount) {
		this.lastInterestAmount = lastInterestAmount;
	}

	public Long getLastPenaltyInterestAmount() {
		return this.lastPenaltyInterestAmount;
	}
	public void setLastPenaltyInterestAmount(Long lastPenaltyInterestAmount) {
		this.lastPenaltyInterestAmount = lastPenaltyInterestAmount;
	}

	public Long getLastPeriodCount() {
		return this.lastPeriodCount;
	}
	public void setLastPeriodCount(Long lastPeriodCount) {
		this.lastPeriodCount = lastPeriodCount;
	}

	public Long getLastPrincipalAmount() {
		return this.lastPrincipalAmount;
	}
	public void setLastPrincipalAmount(Long lastPrincipalAmount) {
		this.lastPrincipalAmount = lastPrincipalAmount;
	}

	public Long getLastTotalRepayAmount() {
		return this.lastTotalRepayAmount;
	}
	public void setLastTotalRepayAmount(Long lastTotalRepayAmount) {
		this.lastTotalRepayAmount = lastTotalRepayAmount;
	}

	public Long getLoanAmount() {
		return this.loanAmount;
	}
	public void setLoanAmount(Long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanDate() {
		return this.loanDate;
	}
	public void setLoanDate(String loanDate) {
		this.loanDate = loanDate;
	}

	public String getLoanId() {
		return this.loanId;
	}
	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public String getRepayMethod() {
		return this.repayMethod;
	}
	public void setRepayMethod(String repayMethod) {
		this.repayMethod = repayMethod;
	}

	public String getSelectType() {
		return this.selectType;
	}
	public void setSelectType(String selectType) {
		this.selectType = selectType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
