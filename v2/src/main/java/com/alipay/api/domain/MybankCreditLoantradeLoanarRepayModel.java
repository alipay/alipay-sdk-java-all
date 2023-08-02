package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构代客户还款
 *
 * @author auto create
 * @since 1.0, 2022-09-19 15:45:55
 */
public class MybankCreditLoantradeLoanarRepayModel extends AlipayObject {

	private static final long serialVersionUID = 7538451453321665171L;

	/**
	 * 贷款客户在网商的会员ID
	 */
	@ApiField("cust_iprole_id")
	private String custIproleId;

	/**
	 * 还款日，精确到日，格式为yyyyMMdd，必须是当天
	 */
	@ApiField("date")
	private String date;

	/**
	 * 贷款合约号
	 */
	@ApiField("loan_ar_no")
	private String loanArNo;

	/**
	 * 还款本金金额，单位默认为元，支持小数点两位，为了便于传输用合作方将数值型转换为字符串型
	 */
	@ApiField("prin_amt")
	private String prinAmt;

	/**
	 * 外部流水号格式：日期(8位)+序列号(8位）,序列号是数字，如00000001（必须是16位且符合该格式）
	 */
	@ApiField("request_id")
	private String requestId;

	public String getCustIproleId() {
		return this.custIproleId;
	}
	public void setCustIproleId(String custIproleId) {
		this.custIproleId = custIproleId;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getLoanArNo() {
		return this.loanArNo;
	}
	public void setLoanArNo(String loanArNo) {
		this.loanArNo = loanArNo;
	}

	public String getPrinAmt() {
		return this.prinAmt;
	}
	public void setPrinAmt(String prinAmt) {
		this.prinAmt = prinAmt;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
