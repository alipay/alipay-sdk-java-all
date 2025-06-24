package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票抬头基础信息
 *
 * @author auto create
 * @since 1.0, 2025-06-16 10:16:14
 */
public class InvoiceTitleInfo extends AlipayObject {

	private static final long serialVersionUID = 7764451388349236938L;

	/**
	 * 是否接受电子票 true:是，false:否
	 */
	@ApiField("accept_electronic")
	private Boolean acceptElectronic;

	/**
	 * 注册地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 银行账户
	 */
	@ApiField("bank_account")
	private String bankAccount;

	/**
	 * 开户行
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 发票抬头类型
	 */
	@ApiField("ip_role_type")
	private String ipRoleType;

	/**
	 * 当前操作人 个人的2088号
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 纳税人识别号
	 */
	@ApiField("tax_no")
	private String taxNo;

	/**
	 * 纳税人资格开始时间 （格式：时间戳） 一般纳税人必须填写，yyyyMMdd 小规模纳税人无需填写 例如20211220
	 */
	@ApiField("tax_payer_quali_valid")
	private String taxPayerQualiValid;

	/**
	 * 纳税人资格种类
	 */
	@ApiField("tax_payer_qualification")
	private String taxPayerQualification;

	/**
	 * 注册电话
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

	public String getIpRoleType() {
		return this.ipRoleType;
	}
	public void setIpRoleType(String ipRoleType) {
		this.ipRoleType = ipRoleType;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getTaxPayerQualiValid() {
		return this.taxPayerQualiValid;
	}
	public void setTaxPayerQualiValid(String taxPayerQualiValid) {
		this.taxPayerQualiValid = taxPayerQualiValid;
	}

	public String getTaxPayerQualification() {
		return this.taxPayerQualification;
	}
	public void setTaxPayerQualification(String taxPayerQualification) {
		this.taxPayerQualification = taxPayerQualification;
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
