package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ReferenceBankAccount;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.tvp.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:27:45
 */
public class AnttechBlockchainFinanceTvpAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1223349832191618959L;

	/** 
	 * 账号ID
	 */
	@ApiField("account_no")
	private String accountNo;

	/** 
	 * 协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 关联支付宝账号
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/** 
	 * 子账号余额，单位元
	 */
	@ApiField("balance_amount")
	private String balanceAmount;

	/** 
	 * 关联银行账号信息
	 */
	@ApiField("reference_bank_account")
	private ReferenceBankAccount referenceBankAccount;

	/** 
	 * 账号状态
	 */
	@ApiField("status")
	private String status;

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNo( ) {
		return this.accountNo;
	}

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}
	public String getAlipayLogonId( ) {
		return this.alipayLogonId;
	}

	public void setBalanceAmount(String balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public String getBalanceAmount( ) {
		return this.balanceAmount;
	}

	public void setReferenceBankAccount(ReferenceBankAccount referenceBankAccount) {
		this.referenceBankAccount = referenceBankAccount;
	}
	public ReferenceBankAccount getReferenceBankAccount( ) {
		return this.referenceBankAccount;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
