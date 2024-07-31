package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 监控账户信息
 *
 * @author auto create
 * @since 1.0, 2024-07-18 15:57:43
 */
public class AccountModelDTO extends AlipayObject {

	private static final long serialVersionUID = 8248737247779438428L;

	/**
	 * 账户登录账户
	 */
	@ApiField("account_logon_id")
	private String accountLogonId;

	/**
	 * 账户名
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 账户号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 账户类型
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccountLogonId() {
		return this.accountLogonId;
	}
	public void setAccountLogonId(String accountLogonId) {
		this.accountLogonId = accountLogonId;
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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
