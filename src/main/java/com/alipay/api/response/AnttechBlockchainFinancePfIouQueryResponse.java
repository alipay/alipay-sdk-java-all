package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.pf.iou.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-15 10:35:11
 */
public class AnttechBlockchainFinancePfIouQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5346276873781972775L;

	/** 
	 * 借据Id
	 */
	@ApiField("credit_id")
	private String creditId;

	/** 
	 * 发放金额
	 */
	@ApiField("issued_amount")
	private String issuedAmount;

	/** 
	 * 贷款入账账号
	 */
	@ApiField("pay_in_account")
	private String payInAccount;

	/** 
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/** 
	 * 还款账号
	 */
	@ApiField("repay_account")
	private String repayAccount;

	public void setCreditId(String creditId) {
		this.creditId = creditId;
	}
	public String getCreditId( ) {
		return this.creditId;
	}

	public void setIssuedAmount(String issuedAmount) {
		this.issuedAmount = issuedAmount;
	}
	public String getIssuedAmount( ) {
		return this.issuedAmount;
	}

	public void setPayInAccount(String payInAccount) {
		this.payInAccount = payInAccount;
	}
	public String getPayInAccount( ) {
		return this.payInAccount;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark( ) {
		return this.remark;
	}

	public void setRepayAccount(String repayAccount) {
		this.repayAccount = repayAccount;
	}
	public String getRepayAccount( ) {
		return this.repayAccount;
	}

}
