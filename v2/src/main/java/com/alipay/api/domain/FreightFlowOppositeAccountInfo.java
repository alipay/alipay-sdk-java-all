package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运企付-委托授权收款方信息
 *
 * @author auto create
 * @since 1.0, 2025-07-02 19:16:37
 */
public class FreightFlowOppositeAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 6282315512834123963L;

	/**
	 * 证件号
	 */
	@ApiField("account_cert_no")
	private String accountCertNo;

	/**
	 * 账户身份类型
	 */
	@ApiField("account_cert_type")
	private String accountCertType;

	/**
	 * 参与者类型(外部银行卡 必填)
	 */
	@ApiField("account_customer_type")
	private String accountCustomerType;

	/**
	 * 参与者联联行号(外部银行卡 必填)
	 */
	@ApiField("account_inst_code")
	private String accountInstCode;

	/**
	 * 参与者编号(外部银行卡 必填)
●网商结算户：卡号
●子户：子户卡号
●外部银行卡：银行卡号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 账户类型
	 */
	@ApiField("account_type")
	private String accountType;

	public String getAccountCertNo() {
		return this.accountCertNo;
	}
	public void setAccountCertNo(String accountCertNo) {
		this.accountCertNo = accountCertNo;
	}

	public String getAccountCertType() {
		return this.accountCertType;
	}
	public void setAccountCertType(String accountCertType) {
		this.accountCertType = accountCertType;
	}

	public String getAccountCustomerType() {
		return this.accountCustomerType;
	}
	public void setAccountCustomerType(String accountCustomerType) {
		this.accountCustomerType = accountCustomerType;
	}

	public String getAccountInstCode() {
		return this.accountInstCode;
	}
	public void setAccountInstCode(String accountInstCode) {
		this.accountInstCode = accountInstCode;
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
