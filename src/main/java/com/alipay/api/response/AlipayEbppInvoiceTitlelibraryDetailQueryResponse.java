package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.titlelibrary.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:12:31
 */
public class AlipayEbppInvoiceTitlelibraryDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2191795553961175492L;

	/** 
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 开户行账号
	 */
	@ApiField("bank_account")
	private String bankAccount;

	/** 
	 * 开户行银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/** 
	 * 纳税人识别号
	 */
	@ApiField("register_no")
	private String registerNo;

	/** 
	 * 电话
	 */
	@ApiField("telephone")
	private String telephone;

	/** 
	 * 抬头名称
	 */
	@ApiField("title_name")
	private String titleName;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getBankAccount( ) {
		return this.bankAccount;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankName( ) {
		return this.bankName;
	}

	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}
	public String getRegisterNo( ) {
		return this.registerNo;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getTelephone( ) {
		return this.telephone;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public String getTitleName( ) {
		return this.titleName;
	}

}
