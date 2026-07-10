package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算卡信息
 *
 * @author auto create
 * @since 1.0, 2026-03-24 16:11:54
 */
public class EscrowSettleCardInfo extends AlipayObject {

	private static final long serialVersionUID = 4441559253889917471L;

	/**
	 * 账户名
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 银行编码
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 开户支行省市
	 */
	@ApiField("branch_address")
	private String branchAddress;

	/**
	 * 支行名称
	 */
	@ApiField("branch_name")
	private String branchName;

	/**
	 * 卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 卡类型，01 对公，02 对私
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 联行号
	 */
	@ApiField("pbc_bank_code")
	private String pbcBankCode;

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchAddress() {
		return this.branchAddress;
	}
	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public String getBranchName() {
		return this.branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getPbcBankCode() {
		return this.pbcBankCode;
	}
	public void setPbcBankCode(String pbcBankCode) {
		this.pbcBankCode = pbcBankCode;
	}

}
