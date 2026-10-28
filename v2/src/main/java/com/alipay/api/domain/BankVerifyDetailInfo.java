package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业打款认证详情
 *
 * @author auto create
 * @since 1.0, 2026-10-21 20:43:49
 */
public class BankVerifyDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 4711535147145389964L;

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
	 * 打款认证单号
	 */
	@ApiField("bank_verify_order_no")
	private String bankVerifyOrderNo;

	/**
	 * 开户支行联行号
	 */
	@ApiField("branch_bank_code")
	private String branchBankCode;

	/**
	 * 开户支行名称
	 */
	@ApiField("branch_bank_name")
	private String branchBankName;

	/**
	 * 认证完成时间
	 */
	@ApiField("certify_end_time")
	private String certifyEndTime;

	/**
	 * 客户请求号，外部请求幂等号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 总行名称
	 */
	@ApiField("root_bank_name")
	private String rootBankName;

	/**
	 * 认证状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 认证状态描述
	 */
	@ApiField("status_desc")
	private String statusDesc;

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getBankCardNo() {
		return this.bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getBankVerifyOrderNo() {
		return this.bankVerifyOrderNo;
	}
	public void setBankVerifyOrderNo(String bankVerifyOrderNo) {
		this.bankVerifyOrderNo = bankVerifyOrderNo;
	}

	public String getBranchBankCode() {
		return this.branchBankCode;
	}
	public void setBranchBankCode(String branchBankCode) {
		this.branchBankCode = branchBankCode;
	}

	public String getBranchBankName() {
		return this.branchBankName;
	}
	public void setBranchBankName(String branchBankName) {
		this.branchBankName = branchBankName;
	}

	public String getCertifyEndTime() {
		return this.certifyEndTime;
	}
	public void setCertifyEndTime(String certifyEndTime) {
		this.certifyEndTime = certifyEndTime;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getRootBankName() {
		return this.rootBankName;
	}
	public void setRootBankName(String rootBankName) {
		this.rootBankName = rootBankName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

}
