package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提交贷款申请
 *
 * @author auto create
 * @since 1.0, 2018-11-14 12:07:10
 */
public class AlipayPcreditLoanLoanApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3388367366687528978L;

	/**
	 * 贷款申请金额
	 */
	@ApiField("apply_amt")
	private String applyAmt;

	/**
	 * 回跳地址，即商户端地址
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 贷款用途，取值{DAILY_SHOPPING, DECORATION, TOUR, EDUCATION, MEDICAL}：DAILY_SHOPPING-个人日常消费; DECORATION-装修; TOUR-旅游; EDUCATION-教育; MEDICAL-医疗;
	 */
	@ApiField("loan_purpose")
	private String loanPurpose;

	/**
	 * 贷款期限，包含贷款期数和期数单位
	 */
	@ApiField("loan_term")
	private LoanTerm loanTerm;

	/**
	 * 贷款申请业务标准外部订单号,代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 还款方式，取值{1, 3, 6}：1-等额本息; 3-按期付息到期还本;  6-到期一次性还本付息;
	 */
	@ApiField("repay_mode")
	private String repayMode;

	public String getApplyAmt() {
		return this.applyAmt;
	}
	public void setApplyAmt(String applyAmt) {
		this.applyAmt = applyAmt;
	}

	public String getBackUrl() {
		return this.backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public String getLoanPurpose() {
		return this.loanPurpose;
	}
	public void setLoanPurpose(String loanPurpose) {
		this.loanPurpose = loanPurpose;
	}

	public LoanTerm getLoanTerm() {
		return this.loanTerm;
	}
	public void setLoanTerm(LoanTerm loanTerm) {
		this.loanTerm = loanTerm;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getRepayMode() {
		return this.repayMode;
	}
	public void setRepayMode(String repayMode) {
		this.repayMode = repayMode;
	}

}
