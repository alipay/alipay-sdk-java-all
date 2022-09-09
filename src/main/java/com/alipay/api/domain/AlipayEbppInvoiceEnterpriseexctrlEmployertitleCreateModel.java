package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业抬头新增
 *
 * @author auto create
 * @since 1.0, 2022-03-11 16:52:29
 */
public class AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4476151146882129468L;

	/**
	 * 企业ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 开户行账号
	 */
	@ApiField("bank_account")
	private String bankAccount;

	/**
	 * 开户行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 税号
	 */
	@ApiField("tax_register_no")
	private String taxRegisterNo;

	/**
	 * 电话
	 */
	@ApiField("telephone")
	private String telephone;

	/**
	 * 企业抬头名称
	 */
	@ApiField("title_name")
	private String titleName;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getBankAccount() {
		return this.bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getTaxRegisterNo() {
		return this.taxRegisterNo;
	}
	public void setTaxRegisterNo(String taxRegisterNo) {
		this.taxRegisterNo = taxRegisterNo;
	}

	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTitleName() {
		return this.titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

}
