package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoicetitle.alipaytrade.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-17 13:57:57
 */
public class AlipayEbppInvoicetitleAlipaytradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3427929388895991848L;

	/** 
	 * 银行账号
	 */
	@ApiField("open_bank_account")
	private String openBankAccount;

	/** 
	 * 开户银行
	 */
	@ApiField("open_bank_name")
	private String openBankName;

	/** 
	 * 纳税人识别号
	 */
	@ApiField("tax_register_no")
	private String taxRegisterNo;

	/** 
	 * 用户私人手机号（交付用）
	 */
	@ApiField("tele_phone_no")
	private String telePhoneNo;

	/** 
	 * 抬头名称
	 */
	@ApiField("title_name")
	private String titleName;

	/** 
	 * 抬头类型 字段值有两种情况抬: PERSONAL（个人） CORPORATION（企业）
	 */
	@ApiField("title_type")
	private String titleType;

	/** 
	 * 地址
	 */
	@ApiField("user_address")
	private String userAddress;

	/** 
	 * 用户私人邮箱（交付用）
	 */
	@ApiField("user_email")
	private String userEmail;

	/** 
	 * 电话号码
	 */
	@ApiField("user_mobile")
	private String userMobile;

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

	public void setTelePhoneNo(String telePhoneNo) {
		this.telePhoneNo = telePhoneNo;
	}
	public String getTelePhoneNo( ) {
		return this.telePhoneNo;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public String getTitleName( ) {
		return this.titleName;
	}

	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}
	public String getTitleType( ) {
		return this.titleType;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserAddress( ) {
		return this.userAddress;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserEmail( ) {
		return this.userEmail;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public String getUserMobile( ) {
		return this.userMobile;
	}

}
