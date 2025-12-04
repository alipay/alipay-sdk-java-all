package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.title.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:53
 */
public class AlipayEbppInvoiceTitleDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3451418633527431149L;

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
	 * 开户行
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

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setOpenBankAccount(String openBankAccount) {
		this.openBankAccount = openBankAccount;
	}
	public String getOpenBankAccount( ) {
		return this.openBankAccount;
	}

	public void setOpenBankName(String openBankName) {
		this.openBankName = openBankName;
	}
	public String getOpenBankName( ) {
		return this.openBankName;
	}

	public void setTaxRegisterNo(String taxRegisterNo) {
		this.taxRegisterNo = taxRegisterNo;
	}
	public String getTaxRegisterNo( ) {
		return this.taxRegisterNo;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getTelephone( ) {
		return this.telephone;
	}

}
