package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行账号信息
 *
 * @author auto create
 * @since 1.0, 2021-12-24 16:36:46
 */
public class AccountVO extends AlipayObject {

	private static final long serialVersionUID = 7364331589553474464L;

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
	 * 分类 BUYER付款账户； SELLER收款账户
	 */
	@ApiField("category")
	private String category;

	/**
	 * 上次支付失败
	 */
	@ApiField("last_pay_fail")
	private String lastPayFail;

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

	/**
	 * 账号状态
	 */
	@ApiField("status")
	private String status;

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

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getLastPayFail() {
		return this.lastPayFail;
	}
	public void setLastPayFail(String lastPayFail) {
		this.lastPayFail = lastPayFail;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
