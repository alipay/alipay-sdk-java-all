package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.subaccount.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-26 15:12:44
 */
public class AlipayCommerceLogisticsFreightflowSubaccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2729585916114612394L;

	/** 
	 * mode为浦发银行且开户成功时返回,按余额出金时使用
	 */
	@ApiField("auth_code")
	private String authCode;

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
	 * mode为浦发银行且开户成功时返回
	 */
	@ApiField("corporate_settlement_card")
	private String corporateSettlementCard;

	/** 
	 * mode为浦发银行且开户成功时必填
	 */
	@ApiField("sub_account_name")
	private String subAccountName;

	/** 
	 * 商户需要保存下来。销户时，与out_user_id一起传入销户
	 */
	@ApiField("sub_bank_card_no")
	private String subBankCardNo;

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getAuthCode( ) {
		return this.authCode;
	}

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

	public void setCorporateSettlementCard(String corporateSettlementCard) {
		this.corporateSettlementCard = corporateSettlementCard;
	}
	public String getCorporateSettlementCard( ) {
		return this.corporateSettlementCard;
	}

	public void setSubAccountName(String subAccountName) {
		this.subAccountName = subAccountName;
	}
	public String getSubAccountName( ) {
		return this.subAccountName;
	}

	public void setSubBankCardNo(String subBankCardNo) {
		this.subBankCardNo = subBankCardNo;
	}
	public String getSubBankCardNo( ) {
		return this.subBankCardNo;
	}

}
