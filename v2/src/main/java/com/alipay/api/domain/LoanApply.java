package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 借款申请信息
 *
 * @author auto create
 * @since 1.0, 2024-04-25 15:51:29
 */
public class LoanApply extends AlipayObject {

	private static final long serialVersionUID = 8657567331425731365L;

	/**
	 * 申请时间
	 */
	@ApiField("apply_date")
	private Date applyDate;

	/**
	 * 借款申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 授信金额，单位元
	 */
	@ApiField("capital_limit")
	private String capitalLimit;

	/**
	 * 放款日
	 */
	@ApiField("disburse_date")
	private String disburseDate;

	/**
	 * 到期日
	 */
	@ApiField("due_date")
	private String dueDate;

	/**
	 * 是否逾期
	 */
	@ApiField("is_delinquent")
	private Boolean isDelinquent;

	/**
	 * 借贷申请状态
	 */
	@ApiField("load_status")
	private String loadStatus;

	/**
	 * 借贷金额，单位元
	 */
	@ApiField("loan_amount")
	private String loanAmount;

	/**
	 * 银行授信合同编号
	 */
	@ApiField("loan_cont_no")
	private String loanContNo;

	/**
	 * 0.005
	 */
	@ApiField("loan_cont_rate")
	private String loanContRate;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public Date getApplyDate() {
		return this.applyDate;
	}
	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCapitalLimit() {
		return this.capitalLimit;
	}
	public void setCapitalLimit(String capitalLimit) {
		this.capitalLimit = capitalLimit;
	}

	public String getDisburseDate() {
		return this.disburseDate;
	}
	public void setDisburseDate(String disburseDate) {
		this.disburseDate = disburseDate;
	}

	public String getDueDate() {
		return this.dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public Boolean getIsDelinquent() {
		return this.isDelinquent;
	}
	public void setIsDelinquent(Boolean isDelinquent) {
		this.isDelinquent = isDelinquent;
	}

	public String getLoadStatus() {
		return this.loadStatus;
	}
	public void setLoadStatus(String loadStatus) {
		this.loadStatus = loadStatus;
	}

	public String getLoanAmount() {
		return this.loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanContNo() {
		return this.loanContNo;
	}
	public void setLoanContNo(String loanContNo) {
		this.loanContNo = loanContNo;
	}

	public String getLoanContRate() {
		return this.loanContRate;
	}
	public void setLoanContRate(String loanContRate) {
		this.loanContRate = loanContRate;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
