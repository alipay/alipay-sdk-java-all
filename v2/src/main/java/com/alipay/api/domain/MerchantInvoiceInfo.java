package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票资料信息
 *
 * @author auto create
 * @since 1.0, 2022-05-16 19:54:52
 */
public class MerchantInvoiceInfo extends AlipayObject {

	private static final long serialVersionUID = 3346938686821194827L;

	/**
	 * 是否接受电子发票 true/false
	 */
	@ApiField("accept_electronic")
	private Boolean acceptElectronic;

	/**
	 * 开票地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 是否自动开票，值为true/false
	 */
	@ApiField("auto_invoice")
	private Boolean autoInvoice;

	/**
	 * 银行账号
	 */
	@ApiField("bank_account")
	private String bankAccount;

	/**
	 * 开户行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 收件人地址
	 */
	@ApiField("mail_address")
	private AddressInfo mailAddress;

	/**
	 * 收件人名称
	 */
	@ApiField("mail_name")
	private String mailName;

	/**
	 * 寄送电话
	 */
	@ApiField("mail_telephone")
	private String mailTelephone;

	/**
	 * 纳税人识别号
	 */
	@ApiField("tax_no")
	private String taxNo;

	/**
	 * 纳税人资格种类:01一般纳税人，02小规模纳税人。一般纳税人开的是专票
	 */
	@ApiField("tax_payer_qualification")
	private String taxPayerQualification;

	/**
	 * 纳税人资格开始时间,yyyyMMdd格式
	 */
	@ApiField("tax_payer_valid")
	private String taxPayerValid;

	/**
	 * 开票电话
	 */
	@ApiField("telephone")
	private String telephone;

	/**
	 * 发票抬头
	 */
	@ApiField("title")
	private String title;

	public Boolean getAcceptElectronic() {
		return this.acceptElectronic;
	}
	public void setAcceptElectronic(Boolean acceptElectronic) {
		this.acceptElectronic = acceptElectronic;
	}

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getAutoInvoice() {
		return this.autoInvoice;
	}
	public void setAutoInvoice(Boolean autoInvoice) {
		this.autoInvoice = autoInvoice;
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

	public AddressInfo getMailAddress() {
		return this.mailAddress;
	}
	public void setMailAddress(AddressInfo mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getMailName() {
		return this.mailName;
	}
	public void setMailName(String mailName) {
		this.mailName = mailName;
	}

	public String getMailTelephone() {
		return this.mailTelephone;
	}
	public void setMailTelephone(String mailTelephone) {
		this.mailTelephone = mailTelephone;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getTaxPayerQualification() {
		return this.taxPayerQualification;
	}
	public void setTaxPayerQualification(String taxPayerQualification) {
		this.taxPayerQualification = taxPayerQualification;
	}

	public String getTaxPayerValid() {
		return this.taxPayerValid;
	}
	public void setTaxPayerValid(String taxPayerValid) {
		this.taxPayerValid = taxPayerValid;
	}

	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
