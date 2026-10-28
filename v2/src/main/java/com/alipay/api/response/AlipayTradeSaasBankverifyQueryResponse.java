package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.bankverify.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-22 18:32:58
 */
public class AlipayTradeSaasBankverifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4874783563959477166L;

	/** 
	 * 对公账户户名
	 */
	@ApiField("account_name")
	private String accountName;

	/** 
	 * 对公银行账号
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/** 
	 * 平台认证流水号
	 */
	@ApiField("bank_verify_order_no")
	private String bankVerifyOrderNo;

	/** 
	 * 银行联行号
	 */
	@ApiField("branch_bank_code")
	private String branchBankCode;

	/** 
	 * 开户支行名称
	 */
	@ApiField("branch_bank_name")
	private String branchBankName;

	/** 
	 * 创建打款认证链接时使用的客户幂等号，长度 1-64，仅允许 `[A-Za-z0-9_-]+`
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 总行名称
	 */
	@ApiField("root_bank_name")
	private String rootBankName;

	/** 
	 * 平台认证状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 平台认证状态描述
	 */
	@ApiField("status_desc")
	private String statusDesc;

	/** 
	 * 认证完成时间
	 */
	@ApiField("verify_end_time")
	private String verifyEndTime;

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountName( ) {
		return this.accountName;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	public String getBankCardNo( ) {
		return this.bankCardNo;
	}

	public void setBankVerifyOrderNo(String bankVerifyOrderNo) {
		this.bankVerifyOrderNo = bankVerifyOrderNo;
	}
	public String getBankVerifyOrderNo( ) {
		return this.bankVerifyOrderNo;
	}

	public void setBranchBankCode(String branchBankCode) {
		this.branchBankCode = branchBankCode;
	}
	public String getBranchBankCode( ) {
		return this.branchBankCode;
	}

	public void setBranchBankName(String branchBankName) {
		this.branchBankName = branchBankName;
	}
	public String getBranchBankName( ) {
		return this.branchBankName;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setRootBankName(String rootBankName) {
		this.rootBankName = rootBankName;
	}
	public String getRootBankName( ) {
		return this.rootBankName;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	public String getStatusDesc( ) {
		return this.statusDesc;
	}

	public void setVerifyEndTime(String verifyEndTime) {
		this.verifyEndTime = verifyEndTime;
	}
	public String getVerifyEndTime( ) {
		return this.verifyEndTime;
	}

}
