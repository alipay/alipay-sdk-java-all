package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行账号信息
 *
 * @author auto create
 * @since 1.0, 2022-08-11 09:46:26
 */
public class AccountDTO extends AlipayObject {

	private static final long serialVersionUID = 8711736424529446929L;

	/**
	 * 户名
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 开户网点
	 */
	@ApiField("offical_name")
	private String officalName;

	/**
	 * 联行号
	 */
	@ApiField("offical_number")
	private String officalNumber;

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

	public String getOfficalName() {
		return this.officalName;
	}
	public void setOfficalName(String officalName) {
		this.officalName = officalName;
	}

	public String getOfficalNumber() {
		return this.officalNumber;
	}
	public void setOfficalNumber(String officalNumber) {
		this.officalNumber = officalNumber;
	}

}
