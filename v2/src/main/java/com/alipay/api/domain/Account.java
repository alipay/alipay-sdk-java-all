package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户信息
 *
 * @author auto create
 * @since 1.0, 2017-12-06 21:42:16
 */
public class Account extends AlipayObject {

	private static final long serialVersionUID = 1376177663746451727L;

	/**
	 * json字符串，扩展信息，支付宝：alipayId，外部银行卡：银行机构名称、银行机构号（总行、支行）、对公/对私等
	 */
	@ApiField("account_ext")
	private String accountExt;

	/**
	 * 账户名称，如银行账户名,支付宝手机号、email
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 资金账号,支付宝2088开头或银行卡号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 账户类型，ALIPAY(“ALIPAY”, “Alipay”, “支付宝账号”, “支付宝账号”),CURRENT(“CURRENT”, “MayiBank”, “网商银行账号”, “网商银行账号”),OUT_BANK(“OUT_BANK”, “OutBank”, “外部银行账号”, “外部银行账号”)
	 */
	@ApiField("account_type")
	private String accountType;

	public String getAccountExt() {
		return this.accountExt;
	}
	public void setAccountExt(String accountExt) {
		this.accountExt = accountExt;
	}

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

}
