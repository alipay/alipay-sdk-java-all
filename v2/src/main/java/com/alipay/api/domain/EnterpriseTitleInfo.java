package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业抬头模型
 *
 * @author auto create
 * @since 1.0, 2021-12-23 16:53:21
 */
public class EnterpriseTitleInfo extends AlipayObject {

	private static final long serialVersionUID = 1532717168722782583L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 开户行账号
	 */
	@ApiField("bank_account")
	private String bankAccount;

	/**
	 * 开户行地址
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
	 * 抬头与企业关系表主键
	 */
	@ApiField("title_id")
	private String titleId;

	/**
	 * 企业抬头名称
	 */
	@ApiField("title_name")
	private String titleName;

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

	public String getTitleName() {
		return this.titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

}
