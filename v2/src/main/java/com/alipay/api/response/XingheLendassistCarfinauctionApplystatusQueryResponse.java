package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: xinghe.lendassist.carfinauction.applystatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-17 13:46:53
 */
public class XingheLendassistCarfinauctionApplystatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4358973979276572855L;

	/** 
	 * 星河申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/** 
	 * 贷款银行联系电话
	 */
	@ApiField("bank_account_manager_contract_number")
	private String bankAccountManagerContractNumber;

	/** 
	 * 放款时间
	 */
	@ApiField("disburse_time")
	private String disburseTime;

	/** 
	 * 面签金额，单位元
	 */
	@ApiField("loan_amount")
	private String loanAmount;

	/** 
	 * 外部订单号（阿里拍卖申请单号）
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 申请状态
	 */
	@ApiField("status")
	private String status;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

	public void setBankAccountManagerContractNumber(String bankAccountManagerContractNumber) {
		this.bankAccountManagerContractNumber = bankAccountManagerContractNumber;
	}
	public String getBankAccountManagerContractNumber( ) {
		return this.bankAccountManagerContractNumber;
	}

	public void setDisburseTime(String disburseTime) {
		this.disburseTime = disburseTime;
	}
	public String getDisburseTime( ) {
		return this.disburseTime;
	}

	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getLoanAmount( ) {
		return this.loanAmount;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
