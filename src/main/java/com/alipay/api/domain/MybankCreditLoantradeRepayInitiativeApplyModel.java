package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户主动申请提交
 *
 * @author auto create
 * @since 1.0, 2018-02-08 14:35:31
 */
public class MybankCreditLoantradeRepayInitiativeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3677586819277448617L;

	/**
	 * 贷款合约编号，用于指定还款对应的单合约合约编号。
	 */
	@ApiField("loan_ar_no")
	private String loanArNo;

	/**
	 * 还款账户
	 */
	@ApiField("repay_account")
	private Account repayAccount;

	/**
	 * 指定还款金额，单位人民币元，金额需要对应还款金额策略一起使用。
	 */
	@ApiField("repay_amount")
	private String repayAmount;

	/**
	 * 指定还款金额对应的金额策略，目前支持：PRIN_AMT（指定本金还款）、CLEAR（结清还款）。
	 */
	@ApiField("repay_amount_strategy")
	private String repayAmountStrategy;

	/**
	 * 指定还款客户会员，此处必须是贷款合约上对应的还款人的会员信息。
	 */
	@ApiField("repay_customer")
	private Member repayCustomer;

	/**
	 * 还款日期。
	 */
	@ApiField("repay_date")
	private Date repayDate;

	/**
	 * 接口幂等字段，相同requestId请求系统默认认为是相同的请求。此处requestId要求的格式为"{机构IpRoleId}_{机构生成的唯一请求ID}"
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 此参数可选，由于下游银行并不一定能指定备注信息，所以该字段只对部分银行或内部账户打款时能生效。
	 */
	@ApiField("trans_memo")
	private String transMemo;

	public String getLoanArNo() {
		return this.loanArNo;
	}
	public void setLoanArNo(String loanArNo) {
		this.loanArNo = loanArNo;
	}

	public Account getRepayAccount() {
		return this.repayAccount;
	}
	public void setRepayAccount(Account repayAccount) {
		this.repayAccount = repayAccount;
	}

	public String getRepayAmount() {
		return this.repayAmount;
	}
	public void setRepayAmount(String repayAmount) {
		this.repayAmount = repayAmount;
	}

	public String getRepayAmountStrategy() {
		return this.repayAmountStrategy;
	}
	public void setRepayAmountStrategy(String repayAmountStrategy) {
		this.repayAmountStrategy = repayAmountStrategy;
	}

	public Member getRepayCustomer() {
		return this.repayCustomer;
	}
	public void setRepayCustomer(Member repayCustomer) {
		this.repayCustomer = repayCustomer;
	}

	public Date getRepayDate() {
		return this.repayDate;
	}
	public void setRepayDate(Date repayDate) {
		this.repayDate = repayDate;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTransMemo() {
		return this.transMemo;
	}
	public void setTransMemo(String transMemo) {
		this.transMemo = transMemo;
	}

}
