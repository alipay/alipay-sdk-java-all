package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信贷交易贷款合约还款申请
 *
 * @author auto create
 * @since 1.0, 2019-08-30 16:58:05
 */
public class MybankCreditLoantradeNewloanarRepayApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1778995986138661625L;

	/**
	 * 申请还款费用，收费必填
	 */
	@ApiField("apply_repay_fee")
	private String applyRepayFee;

	/**
	 * 申请还款利息，收费必填
	 */
	@ApiField("apply_repay_int")
	private String applyRepayInt;

	/**
	 * 申请还款罚息，收费必填
	 */
	@ApiField("apply_repay_penalty")
	private String applyRepayPenalty;

	/**
	 * 申请还款本金，收费必填
	 */
	@ApiField("apply_repay_prin")
	private String applyRepayPrin;

	/**
	 * 贷款客户在网商的会员角色ID
	 */
	@ApiField("cust_iprole_id")
	private String custIproleId;

	/**
	 * 贷款合约号
	 */
	@ApiField("loan_ar_no")
	private String loanArNo;

	/**
	 * 还款金额，单位默认为元，支持小数点两位，为了便于传输，合作方需将数值型转换为字符串型
	 */
	@ApiField("repay_amt")
	private String repayAmt;

	/**
	 * 网商结算户的卡号外标，若机构合约不是对客担保该账户必填
	 */
	@ApiField("repay_card_no")
	private String repayCardNo;

	/**
	 * 还款类型，总额还款:TOTAL_AMT 本金还款:PRIN_AMT
	 */
	@ApiField("repay_type")
	private String repayType;

	/**
	 * 外部流水号格式：日期(8位)+序列号(8位）,序列号是数字，如00000001（必须是16位且符合该格式）幂等字段，如果其他参数有变化，此字段需要修改。
	 */
	@ApiField("request_id")
	private String requestId;

	public String getApplyRepayFee() {
		return this.applyRepayFee;
	}
	public void setApplyRepayFee(String applyRepayFee) {
		this.applyRepayFee = applyRepayFee;
	}

	public String getApplyRepayInt() {
		return this.applyRepayInt;
	}
	public void setApplyRepayInt(String applyRepayInt) {
		this.applyRepayInt = applyRepayInt;
	}

	public String getApplyRepayPenalty() {
		return this.applyRepayPenalty;
	}
	public void setApplyRepayPenalty(String applyRepayPenalty) {
		this.applyRepayPenalty = applyRepayPenalty;
	}

	public String getApplyRepayPrin() {
		return this.applyRepayPrin;
	}
	public void setApplyRepayPrin(String applyRepayPrin) {
		this.applyRepayPrin = applyRepayPrin;
	}

	public String getCustIproleId() {
		return this.custIproleId;
	}
	public void setCustIproleId(String custIproleId) {
		this.custIproleId = custIproleId;
	}

	public String getLoanArNo() {
		return this.loanArNo;
	}
	public void setLoanArNo(String loanArNo) {
		this.loanArNo = loanArNo;
	}

	public String getRepayAmt() {
		return this.repayAmt;
	}
	public void setRepayAmt(String repayAmt) {
		this.repayAmt = repayAmt;
	}

	public String getRepayCardNo() {
		return this.repayCardNo;
	}
	public void setRepayCardNo(String repayCardNo) {
		this.repayCardNo = repayCardNo;
	}

	public String getRepayType() {
		return this.repayType;
	}
	public void setRepayType(String repayType) {
		this.repayType = repayType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
