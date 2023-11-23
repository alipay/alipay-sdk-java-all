package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 员工抬头信息
 *
 * @author auto create
 * @since 1.0, 2023-08-23 17:59:00
 */
public class EmployeeTitleInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6656456258693638697L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 抬头名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 开户行帐号
	 */
	@ApiField("open_bank_account")
	private String openBankAccount;

	/**
	 * 开户行名称
	 */
	@ApiField("open_bank_name")
	private String openBankName;

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
	 * 抬头ID
	 */
	@ApiField("title_id")
	private String titleId;

	/**
	 * 抬头类型
	 */
	@ApiField("title_tag")
	private String titleTag;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpenBankAccount() {
		return this.openBankAccount;
	}
	public void setOpenBankAccount(String openBankAccount) {
		this.openBankAccount = openBankAccount;
	}

	public String getOpenBankName() {
		return this.openBankName;
	}
	public void setOpenBankName(String openBankName) {
		this.openBankName = openBankName;
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

	public String getTitleId() {
		return this.titleId;
	}
	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}

	public String getTitleTag() {
		return this.titleTag;
	}
	public void setTitleTag(String titleTag) {
		this.titleTag = titleTag;
	}

}
