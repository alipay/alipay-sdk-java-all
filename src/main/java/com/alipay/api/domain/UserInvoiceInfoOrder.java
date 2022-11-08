package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 无账单申请开票购方信息
 *
 * @author auto create
 * @since 1.0, 2022-04-14 16:09:02
 */
public class UserInvoiceInfoOrder extends AlipayObject {

	private static final long serialVersionUID = 7889733415836478118L;

	/**
	 * 购方公司
	 */
	@ApiField("address")
	private String address;

	/**
	 * 购方公司注册银行卡号
	 */
	@ApiField("bank_account")
	private String bankAccount;

	/**
	 * 购方公司的注册银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 购方公司的抬头
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 商户PID,传入购方商户的pid，无pid开票时传2088999999999999
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 收件邮寄地址信息
	 */
	@ApiField("recipient_info")
	private RecipientInfoOrder recipientInfo;

	/**
	 * 购方公司的税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	/**
	 * 购方公司电话
	 */
	@ApiField("telephone")
	private String telephone;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
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

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public RecipientInfoOrder getRecipientInfo() {
		return this.recipientInfo;
	}
	public void setRecipientInfo(RecipientInfoOrder recipientInfo) {
		this.recipientInfo = recipientInfo;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
