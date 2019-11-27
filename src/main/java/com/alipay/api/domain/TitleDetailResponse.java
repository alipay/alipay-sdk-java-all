package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 抬头详情查询结果
 *
 * @author auto create
 * @since 1.0, 2019-10-08 21:57:04
 */
public class TitleDetailResponse extends AlipayObject {

	private static final long serialVersionUID = 8243642129155914634L;

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
	 * 开户行账号
	 */
	@ApiField("open_bank_account")
	private String openBankAccount;

	/**
	 * 开户行名称
	 */
	@ApiField("open_bank_name")
	private String openBankName;

	/**
	 * 纳税人识别号
	 */
	@ApiField("tax_register_no")
	private String taxRegisterNo;

	/**
	 * 电话
	 */
	@ApiField("telephone")
	private String telephone;

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

}
