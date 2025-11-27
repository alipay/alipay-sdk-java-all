package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开票申请的发票抬头信息
 *
 * @author auto create
 * @since 1.0, 2025-08-12 16:14:50
 */
public class ObcInvoiceIssuerRequest extends AlipayObject {

	private static final long serialVersionUID = 3415221216488125238L;

	/**
	 * 购方银行账户
	 */
	@ApiField("bank_account")
	private String bankAccount;

	/**
	 * 银行账户对应的支行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 发票的收件邮箱，必填
	 */
	@ApiListField("emails")
	@ApiField("string")
	private List<String> emails;

	/**
	 * 用来描述购方的抬头信息
	 */
	@ApiField("invoice_title")
	private String invoiceTitle;

	/**
	 * 增值税专用发票/增值税普通发票
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 邮编，可选，会展示到发票一栏
	 */
	@ApiField("post_code")
	private String postCode;

	/**
	 * 注册地址信息
	 */
	@ApiField("registered_address")
	private String registeredAddress;

	/**
	 * 注册电话
	 */
	@ApiField("registered_phone_no")
	private String registeredPhoneNo;

	/**
	 * oceanbase官网uid
	 */
	@ApiField("source_uid")
	private String sourceUid;

	/**
	 * 纳税人识别号
	 */
	@ApiField("tax_no")
	private String taxNo;

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

	public List<String> getEmails() {
		return this.emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public String getInvoiceTitle() {
		return this.invoiceTitle;
	}
	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getPostCode() {
		return this.postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getRegisteredAddress() {
		return this.registeredAddress;
	}
	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}

	public String getRegisteredPhoneNo() {
		return this.registeredPhoneNo;
	}
	public void setRegisteredPhoneNo(String registeredPhoneNo) {
		this.registeredPhoneNo = registeredPhoneNo;
	}

	public String getSourceUid() {
		return this.sourceUid;
	}
	public void setSourceUid(String sourceUid) {
		this.sourceUid = sourceUid;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
