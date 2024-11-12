package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票信息结果
 *
 * @author auto create
 * @since 1.0, 2024-07-04 16:40:00
 */
public class InvoiceInfoOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 5713391742292394477L;

	/**
	 * 银行账号
	 */
	@ApiField("bank_account")
	private String bankAccount;

	/**
	 * 银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 公司code
	 */
	@ApiField("ou_code")
	private String ouCode;

	/**
	 * 注册地址
	 */
	@ApiField("registered_address")
	private String registeredAddress;

	/**
	 * 注册电话
	 */
	@ApiField("registered_phone_no")
	private String registeredPhoneNo;

	/**
	 * 税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	/**
	 * 纳税人类型
	 */
	@ApiField("taxpayer_type")
	private String taxpayerType;

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

	public String getOuCode() {
		return this.ouCode;
	}
	public void setOuCode(String ouCode) {
		this.ouCode = ouCode;
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

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getTaxpayerType() {
		return this.taxpayerType;
	}
	public void setTaxpayerType(String taxpayerType) {
		this.taxpayerType = taxpayerType;
	}

}
