package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.subaccount.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-19 14:47:26
 */
public class AlipayCommerceLogisticsFreightflowSubaccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4666198491736638583L;

	/** 
	 * 母户的账户名称
	 */
	@ApiField("bank_cert_name")
	private String bankCertName;

	/** 
	 * 开户行名称
	 */
	@ApiField("branch_name")
	private String branchName;

	/** 
	 * 网商银行的银行联号
	 */
	@ApiField("branch_no")
	private String branchNo;

	/** 
	 * 商户需要保存下来。销户时，与out_user_id一起传入销户
	 */
	@ApiField("sub_bank_card_no")
	private String subBankCardNo;

	public void setBankCertName(String bankCertName) {
		this.bankCertName = bankCertName;
	}
	public String getBankCertName( ) {
		return this.bankCertName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchName( ) {
		return this.branchName;
	}

	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}
	public String getBranchNo( ) {
		return this.branchNo;
	}

	public void setSubBankCardNo(String subBankCardNo) {
		this.subBankCardNo = subBankCardNo;
	}
	public String getSubBankCardNo( ) {
		return this.subBankCardNo;
	}

}
